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
public class khoaHocTest {
    
    public khoaHocTest() {
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
     * Test of toString method, of class khoaHoc.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        khoaHoc instance = new khoaHoc();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaKH method, of class khoaHoc.
     */
    @Test
    public void testGetMaKH() {
    
        khoaHoc instance = new khoaHoc();
        int expResult = 0;
        int result = instance.getMaKH();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaKH method, of class khoaHoc.
     */
    @Test
    public void testSetMaKH() {
        String MaKH="123";
        int maKH = 0;
        khoaHoc instance = new khoaHoc();
        instance.setMaKH(maKH);
       String expected = "123";
        assertEquals(expected, instance.getMaKH());
    }

    /**
     * Test of getMaCD method, of class khoaHoc.
     */
    @Test
    public void testGetMaCD() {
        System.out.println("getMaCD");
        khoaHoc instance = new khoaHoc();
        String expResult = "";
        String result = instance.getMaCD();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaCD method, of class khoaHoc.
     */
    @Test
    public void testSetMaCD() {
                                                     
        String maCD = "M01";
        chuyenDe instance = new chuyenDe();
        instance.setMaCD(maCD);
        String expected = "M01";
        assertEquals(expected, instance.getMaCD());
    }

    /**
     * Test of getHocPhi method, of class khoaHoc.
     */
    @Test
    public void testGetHocPhi() {
        System.out.println("getHocPhi");
        khoaHoc instance = new khoaHoc();
        double expResult = 0.0;
        double result = instance.getHocPhi();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHocPhi method, of class khoaHoc.
     */
    @Test
    public void testSetHocPhi() {
//        System.out.println("setHocPhi");
        double hocPhi = 600;
        chuyenDe instance = new chuyenDe();
        instance.setHocPhi(hocPhi);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        double expected = 600;
        double result = instance.getHocPhi();
        assertEquals(expected, result, 0.0);
    }

    @Test
    public void testSetHocPhiam() {
//        System.out.println("setHocPhi");
        double hocPhi = -600;
        chuyenDe instance = new chuyenDe();
        //        // TODO review the generated test code and remove the default call to fail.
        //        fail("The test case is a prototype.");
        Exception exception=assertThrows(Exception.class,
                ()-> instance.setHocPhi(hocPhi));

    }
    @Test
    public void testSetHocPhilon() {
//        System.out.println("setHocPhi");
        double hocPhi = 600000000;
        chuyenDe instance = new chuyenDe();
        //        // TODO review the generated test code and remove the default call to fail.
        //        fail("The test case is a prototype.");
        Exception exception=assertThrows(Exception.class,
                ()-> instance.setHocPhi(hocPhi));

    }

    /**
     * Test of getThoiLuong method, of class khoaHoc.
     */
    @Test
    public void testGetThoiLuong() {
        System.out.println("getThoiLuong");
        khoaHoc instance = new khoaHoc();
        int expResult = 0;
        int result = instance.getThoiLuong();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setThoiLuong method, of class khoaHoc.
     */
    @Test
    public void testSetThoiLuong() {
        int thoiLuong =10;
        chuyenDe instance = new chuyenDe();
        instance.setThoiLuong(thoiLuong);
        int expected =10;
        int result=instance.getThoiLuong();
        assertEquals(expected, result);
    }

    /**
     * Test of getNgayKG method, of class khoaHoc.
     */
    @Test
    public void testGetNgayKG() {
        System.out.println("getNgayKG");
        khoaHoc instance = new khoaHoc();
        Date expResult = null;
        Date result = instance.getNgayKG();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNgayKG method, of class khoaHoc.
     */
    @Test
    public void testSetNgayKG() {
        
        Date ngayKG = null;
        khoaHoc instance = new khoaHoc();
        instance.setNgayKG(ngayKG);
         Date expected =null;
        Date result=instance.getNgayKG();
        assertEquals(expected, result);
    }

    /**
     * Test of getGhiChu method, of class khoaHoc.
     */
    @Test
    public void testGetGhiChu() {
        System.out.println("getGhiChu");
        khoaHoc instance = new khoaHoc();
        String expResult = "";
        String result = instance.getGhiChu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGhiChu method, of class khoaHoc.
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
     * Test of getMaNV method, of class khoaHoc.
     */
    @Test
    public void testGetMaNV() {
        System.out.println("getMaNV");
        khoaHoc instance = new khoaHoc();
        String expResult = "";
        String result = instance.getMaNV();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaNV method, of class khoaHoc.
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
     * Test of getNgayTao method, of class khoaHoc.
     */
    @Test
    public void testGetNgayTao() {
        System.out.println("getNgayTao");
        khoaHoc instance = new khoaHoc();
        Date expResult = null;
        Date result = instance.getNgayTao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNgayTao method, of class khoaHoc.
     */
    @Test
    public void testSetNgayTao() {
        Date ngayTao = null;
        khoaHoc instance = new khoaHoc();
        instance.setNgayTao(ngayTao);
           Date expected =null;
        assertEquals(expected, instance.getNgayTao());
    }
    
}
