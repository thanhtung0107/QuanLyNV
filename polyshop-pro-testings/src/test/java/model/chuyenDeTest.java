/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
public class chuyenDeTest {

    public chuyenDeTest() {
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
     * Test of toString method, of class chuyenDe.
     */
    //    @Test
    //    public void testToString() {
    //        System.out.println("toString");
    //        chuyenDe instance = new chuyenDe();
    //        String expResult = "";
    //        String result = instance.toString();
    //        assertEquals(expResult, result);
    //        // TODO review the generated test code and remove the default call to fail.
    //        fail("The test case is a prototype.");
    //    }
    /**
     * Test of getMaCD method, of class chuyenDe.
     */
    @Test
    public void testGetMaCD() {
        //        System.out.println("getMaCD");
        chuyenDe instance = new chuyenDe();
        String expResult = "";
        String result = instance.getMaCD();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaCD method, of class chuyenDe.
     */
    @Test
    public void testSetMaCD() {
//        System.out.println("setMaCD");
        String maCD = "M01";
        chuyenDe instance = new chuyenDe();
        instance.setMaCD(maCD);
        String expected = "M01";
        assertEquals(expected, instance.getMaCD());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getTenCD method, of class chuyenDe.
     */
    @Test
    public void testGetTenCD() {
        String TenCD="lap trinh++";
        chuyenDe instance = new chuyenDe();
        instance.setTenCD(TenCD);
        String expected="lap trinh++";
        
        assertEquals(expected, instance.getTenCD());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTenCD method, of class chuyenDe.
     */
    @Test
    public void testSetTenCD() {
       String TenCD="lap trinh++";
        chuyenDe instance = new chuyenDe();
        instance.setTenCD(TenCD);
        String expected="lap trinh++";
        
        assertEquals(expected, instance.getTenCD());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHocPhi method, of class chuyenDe.
     */
    @Test
    public void testGetHocPhi() {
//        System.out.println("getHocPhi");
        chuyenDe instance = new chuyenDe();
        double expResult = 0.0;
        double result = instance.getHocPhi();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

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
    @Test
    public void testGetThoiLuong() {
        System.out.println("getThoiLuong");
        chuyenDe instance = new chuyenDe();
        int expResult = 0;
        int result = instance.getThoiLuong();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setThoiLuong method, of class chuyenDe.
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
     * Test of getHinh method, of class chuyenDe.
     */
    @Test
    public void testGetHinh() {
        System.out.println("getHinh");
        chuyenDe instance = new chuyenDe();
        String expResult = "";
        String result = instance.getHinh();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHinh method, of class chuyenDe.
     */
    
    @Test
    public void testSetHinh() {
        
        String hinh = "";
        chuyenDe instance = new chuyenDe();
        instance.setHinh(hinh);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMoTa method, of class chuyenDe.
     */
    @Test
    public void testGetMoTa() {
        System.out.println("getMoTa");
        chuyenDe instance = new chuyenDe();
        String expResult = "";
        String result = instance.getMoTa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMoTa method, of class chuyenDe.
     */
    
    @Test
    public void testSetMoTa() {
        
        String moTa = "java2";
        chuyenDe instance = new chuyenDe();
        instance.setMoTa(moTa);
        String expected ="java2";
        assertEquals(expected, instance.getMoTa());
    }

}
