/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author haunguyen
 */
public class nguoiHocTest {
    
    public nguoiHocTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of toString method, of class nguoiHoc.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        nguoiHoc instance = new nguoiHoc();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaNH method, of class nguoiHoc.
     */
    @Test
    public void testGetMaNH() {
        System.out.println("getMaNH");
        nguoiHoc instance = new nguoiHoc();
        String expResult = "";
        String result = instance.getMaNH();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testSetMaNH() {
     String MaNH="123";
        String maNH = "";
        hocVien instance = new hocVien();
        instance.setMaNH(maNH);
        String expected="123";
        
        
        assertEquals(expected, instance.getMaNH());
        
    }

    
    @Test
    public void testGetHoTen() {
        System.out.println("getHoTen");
        nguoiHoc instance = new nguoiHoc();
        String expResult = "";
        String result = instance.getHoTen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHoTen method, of class nguoiHoc.
     */
    @Test
    public void testSetHoTen() {
        
        String hoTen = "nguyen van a";
        nguoiHoc instance = new nguoiHoc();
        instance.setHoTen(hoTen);
        String expected="nguyen van a";
        assertEquals(expected, instance.getHoTen());
    }

    /**
     * Test of getNgaySinh method, of class nguoiHoc.
     */
    @Test
    public void testGetNgaySinh() {
        System.out.println("getNgaySinh");
        nguoiHoc instance = new nguoiHoc();
        Date expResult = null;
        Date result = instance.getNgaySinh();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNgaySinh method, of class nguoiHoc.
     */
    @Test
    public void testSetNgaySinh() {

        Date ngaySinh = null;
        nguoiHoc instance = new nguoiHoc();
        instance.setNgaySinh(ngaySinh);
          Date expected =null;
        assertEquals(expected, instance.getNgaySinh());
    }

    /**
     * Test of isGioiTinh method, of class nguoiHoc.
     */
    @Test
    public void testIsGioiTinh() {
        System.out.println("isGioiTinh");
        nguoiHoc instance = new nguoiHoc();
        boolean expResult = false;
        boolean result = instance.isGioiTinh();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGioiTinh method, of class nguoiHoc.
     */
    @Test
    public void testSetGioiTinh() {

        boolean gioiTinh = false;
        nguoiHoc instance = new nguoiHoc();
        instance.setGioiTinh(gioiTinh);
         boolean expected =false;
        assertEquals(expected, instance.isGioiTinh());
    }

    /**
     * Test of getDienThoai method, of class nguoiHoc.
     */
    @Test
    public void testGetDienThoai() {
        System.out.println("getDienThoai");
        nguoiHoc instance = new nguoiHoc();
        String expResult = "";
        String result = instance.getDienThoai();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDienThoai method, of class nguoiHoc.
     */
    @Test
    public void testSetDienThoai() {
        
        String dienThoai = "0344266847";
        nguoiHoc instance = new nguoiHoc();
        instance.setDienThoai(dienThoai);
          String expected = "0344266847";
        assertEquals(expected, instance.getDienThoai());
    }

    /**
     * Test of getEmail method, of class nguoiHoc.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        nguoiHoc instance = new nguoiHoc();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class nguoiHoc.
     */
    @Test
    public void testSetEmail() {
       
        String email = "hauntph07061@fpt.edu.vn";
        nguoiHoc instance = new nguoiHoc();
        instance.setEmail(email);
            String expResult = "hauntph07061@fpt.edu.vn";
         String result = instance.getEmail();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getGhiChu method, of class nguoiHoc.
     */
    @Test
    public void testGetGhiChu() {
        System.out.println("getGhiChu");
        nguoiHoc instance = new nguoiHoc();
        String expResult = "";
        String result = instance.getGhiChu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGhiChu method, of class nguoiHoc.
     */
    @Test
    public void testSetGhiChu() {
        
        String ghiChu = "123";
        khoaHoc instance = new khoaHoc();
        instance.setGhiChu(ghiChu);
           String expected ="123";
        assertEquals(expected, instance.getGhiChu());
    }

    /**
     * Test of getMaNV method, of class nguoiHoc.
     */
    @Test
    public void testGetMaNV() {
        System.out.println("getMaNV");
        nguoiHoc instance = new nguoiHoc();
        String expResult = "";
        String result = instance.getMaNV();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaNV method, of class nguoiHoc.
     */
    @Test
    public void testSetMaNV() {
      
        String maNV = "123";
        khoaHoc instance = new khoaHoc();
        instance.setMaNV(maNV);
             String expected ="123";
        assertEquals(expected, instance.getMaNV());
        
    }

    /**
     * Test of getNgayDK method, of class nguoiHoc.
     */
    @Test
    public void testGetNgayDK() {
        System.out.println("getNgayDK");
        nguoiHoc instance = new nguoiHoc();
        Date expResult = null;
        Date result = instance.getNgayDK();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNgayDK method, of class nguoiHoc.
     */
    @Test
    public void testSetNgayDK() {
       
        Date ngayDK = null;
        nguoiHoc instance = new nguoiHoc();
        instance.setNgayDK(ngayDK);
        Date expected =null;
        assertEquals(expected, instance.getNgayDK());
    }
    
}
