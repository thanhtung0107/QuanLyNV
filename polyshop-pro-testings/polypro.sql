CREATE DATABASE Polypro
USE qlpolypic
GO
CREATE TABLE NhanVien
(  
	MaNV nvarchar(50) NOT NULL,
	MatKhau nvarchar(50) NOT NULL,
	HoTen nvarchar(50) NOT NULL,  
	VaiTro nvarchar(30) NOT NULL,  
	PRIMARY KEY(MaNV) 
)
GO
CREATE TABLE ChuyenDe
(  
	MaCD nchar(5) NOT NULL,  
	TenCD nvarchar(50) NOT NULL, 
	HocPhi INT NOT NULL DEFAULT 0,  
	ThoiLuong int NOT NULL DEFAULT 30,  
	Hinh nvarchar(50) NOT NULL DEFAULT 'chuyen-de.png',  
	MoTa nvarchar(255) NOT NULL,  
	PRIMARY KEY(MaCD),  UNIQUE(TenCD),  CHECK(HocPhi >= 0 AND ThoiLuong > 0) 
) 
GO 
CREATE TABLE NguoiHoc
(  
	MaNH nchar(7) NOT NULL,  
	HoTen nvarchar(50) NOT NULL,  
	NgaySinh date NOT NULL,  
	GioiTinh NVARCHAR(6) NOT NULL,  
	DienThoai nvarchar(50) NOT NULL,  
	Email nvarchar(50) NOT NULL,  
	GhiChu nvarchar(max) NULL,  
	MaNV nvarchar(50) NOT NULL,  
	NgayDK date NOT NULL DEFAULT getdate(),  
	PRIMARY KEY(MaNH)
)
GO 
CREATE TABLE KhoaHoc
( 
	MaKH int IDENTITY(1,1) NOT NULL,  
	MaCD nchar(5) NOT NULL,  
	HocPhi int NOT NULL DEFAULT 0,  
	ThoiLuong int NOT NULL DEFAULT 0,  
	NgayKG date NOT NULL,  
	GhiChu nvarchar(50) NULL,  
	MaNV nvarchar(50) NOT NULL,  
	NgayTao date NOT NULL DEFAULT getdate(),
	PRIMARY KEY(MaKH),  CHECK(HocPhi >= 0 AND ThoiLuong > 0),
	FOREIGN KEY (MaCD) REFERENCES ChuyenDe(MaCD) ON UPDATE CASCADE,  FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV) ON UPDATE CASCADE 
)
GO 
CREATE TABLE HocVien
(  
	MaHV int IDENTITY(1,1) NOT NULL,
	MaKH int NOT NULL,  
	MaNH nchar(7) NOT NULL,  
	Diem float NOT NULL, 
	PRIMARY KEY(MaHV),
	UNIQUE(MaKH, MaNH),
	FOREIGN KEY (MaKH) REFERENCES KhoaHoc(MaKH) ON DELETE CASCADE,
	FOREIGN KEY (MaNH) REFERENCES NguoiHoc(MaNH) ON UPDATE CASCADE, 
);

INSERT INTO NhanVien  VALUES ('NV001','123456','Nguyễn Văn Tèo', 'Trưởng phòng'); 
INSERT INTO NhanVien  VALUES ('NV002','123456','Nguyễn Văn Tý', 'Nhân Viên');
INSERT INTO NhanVien  VALUES ('NV003','123456', 'Trần Thanh Tùng', 'Nhân Viên');
INSERT INTO NhanVien  VALUES ('NV004', '123456', 'Nguyễn Ngọc Mai', 'Nhân Viên') ;

INSERT INTO ChuyenDe  VALUES ('JAV','Lập trình Java cơ bản', '1000000', '8', 'chuyen-de.png','Công nghệ thông tin'); 
INSERT INTO ChuyenDe  VALUES ('WEB','Thiết kế web', '1000000', '6 ', 'chuyen-de.png','Công nghệ thông tin');
INSERT INTO ChuyenDe  VALUES ('SOF','Dự án ngành UD', '1000000', '4 ', 'chuyen-de.png','Công nghệ thông tin');
INSERT INTO ChuyenDe  VALUES ('SQL','Cơ sở dữ liệu SQL', '1000000', '5 ', 'chuyen-de.png','Công nghệ thông tin');

INSERT INTO NguoiHoc  VALUES ('PT1234', N'Nguyễn Văn Đông', '1999-01-04', N'Nam', '0983145678','dongnv@gmail.com',null, 'NV001', '2018-07-23');
INSERT INTO NguoiHoc VALUES ('PT1432', N'Nguyễn Thị Dung', '1999-06-23', N'Nữ', '09834545456','dungnt@gmail.com',null, 'NV001', '2018-05-18');
INSERT INTO NguoiHoc  VALUES ('PT1412', N'Trịnh Đình Quang', '1998-09-03', N'Nam', '0983143234','quangtd@gmail.com',null, 'NV001', '2018-07-22');
INSERT INTO NguoiHoc  VALUES ('PT1719', N'Nguyễn Kim Linh', '1999-07-27', N'Nữ', '0983475638','linhnk@gmail.com',null, 'NV001', '2018-07-30');

INSERT INTO KhoaHoc  VALUES ('SOF', '7000000', '24 ', '2018-08-01', null, 'NV001','2018-01-01');
INSERT INTO KhoaHoc  VALUES ('JAV', '7000000', '24 ', '2018-08-01', null, 'NV002','2018-01-01');
INSERT INTO KhoaHoc  VALUES ('SQL', '7000000', '24 ', '2018-08-01', null, 'NV003','2018-01-01');
INSERT INTO KhoaHoc  VALUES ('WEB', '7000000', '24', '2018-08-01', null, 'NV004','2018-01-01');

INSERT INTO HocVien  VALUES ('4','PT1432','7.5');
INSERT INTO HocVien  VALUES ('3','PT1234','8.5');
INSERT INTO HocVien  VALUES ('1','PT1412','9.5');
INSERT INTO HocVien  VALUES ('2','PT1719','6.5');

--Truy vấn
SELECT * FROM NhanVien;
SELECT * FROM ChuyenDe;
SELECT * FROM NguoiHoc; 
SELECT * FROM KhoaHoc;
SELECT * FROM HocVien ;
---Tổng hợp thống kê
CREATE PROC sp_ThongKeNguoiHoc
AS BEGIN  
	SELECT   
		YEAR(NgayDK) Nam,
		COUNT(*) SoLuong,   
		MIN(NgayDK) DauTien,
		MAX(NgayDK) CuoiCung
FROM NguoiHoc  
GROUP BY YEAR(NgayDK) 
END 
---Doanh thu chuyên đề
CREATE PROC sp_ThongKeDoanhThu(@Year INT)
AS BEGIN  SELECT
TenCD ChuyenDe,
		COUNT(DISTINCT kh.MaKH) SoKH,
		COUNT(hv.MaHV) SoHV,
		SUM(kh.HocPhi) DoanhThu,
		MIN(kh.HocPhi) ThapNhat,
	MAX(kh.HocPhi) CaoNhat,
	AVG(kh.HocPhi) TrungBinh 
FROM KhoaHoc kh 
JOIN HocVien hv ON kh.MaKH=hv.MaKH
JOIN ChuyenDe cd ON cd.MaCD=kh.MaCD  
WHERE YEAR(NgayKG) = @Year  
GROUP BY TenCD 
END
----Học Viên chuyên đề
CREATE PROC sp_ThongKeDiem 
AS BEGIN  SELECT  
TenCD ChuyenDe,
COUNT(MaHV) SoHV,
MIN(Diem) ThapNhat,
MAX(Diem) CaoNhat, 
AVG(Diem) TrungBinh  FROM KhoaHoc kh 
JOIN HocVien hv ON kh.MaKH=hv.MaKH
JOIN ChuyenDe cd ON cd.MaCD=kh.MaCD
GROUP BY TenCD
END
----Bảng điểm
CREATE PROC sp_BangDiem(@MaKH INT)
AS BEGIN  SELECT
nh.MaNH,   nh.HoTen,   hv.Diem  
FROM HocVien hv   JOIN NguoiHoc nh ON nh.MaNH=hv.MaNH 
WHERE hv.MaKH = @MaKH  
ORDER BY hv.Diem DESC
END



 