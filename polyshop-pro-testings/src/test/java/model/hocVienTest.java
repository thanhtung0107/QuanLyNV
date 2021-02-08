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
public class hocVienTest {
    
    public hocVienTest() {
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
     * Test of toString method, of class hocVien.
     */
  

    /**
     * Test of getMaHV method, of class hocVien.
     */
    
    @Test
    public void testGetMaHV() {
   
        hocVien instance = new hocVien();
        int expResult = 0;
        int result = instance.getMaHV();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaHV method, of class hocVien.
     */
//     String moTa = "java2";
//        chuyenDe instance = new chuyenDe();
//        instance.setMoTa(moTa);
//        String expected ="java2";
//        assertEquals(expected, instance.getMoTa());
       
    @Test
    public void testSetMaHV() {
        int maHV = 0;
        hocVien instance = new hocVien();
        instance.setMaHV(maHV);
         int expected =0;
        int result=instance.getMaHV();
        assertEquals(expected, result);
    }

    /**
     * Test of getMaKH method, of class hocVien.
     */
    @Test
    public void testGetMaKH() {
        System.out.println("getMaKH");
        hocVien instance = new hocVien();
        int expResult = 0;
        int result = instance.getMaKH();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaKH method, of class hocVien.
     */
    
    @Test
    public void testSetMaKH() {
        
        int maKH = 0;
        hocVien instance = new hocVien();
        instance.setMaKH(maKH);
        int expected=0;
        int result=instance.getMaKH();
        assertEquals(expected, result);
        
    }

    /**
     * Test of getMaNH method, of class hocVien.
     */
    @Test
    public void testGetMaNH() {
        System.out.println("getMaNH");
        hocVien instance = new hocVien();
        String expResult = "";
        String result = instance.getMaNH();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaNH method, of class hocVien.
     */
    @Test
    public void testSetMaNH() {
     String MaNH="123";
        String maNH = "";
        hocVien instance = new hocVien();
        instance.setMaNH(maNH);
        String expected="123";
        
        
        assertEquals(expected, instance.getMaNH());
        
    }

    /**
     * Test of getDiem method, of class hocVien.
     */
    @Test
    public void testGetDiem() {
        System.out.println("getDiem");
        hocVien instance = new hocVien();
        double expResult = 0.0;
        double result = instance.getDiem();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDiem method, of class hocVien.
     */
    @Test
    public void testSetDiem() {
    
        double diem = 0.0;
        hocVien instance = new hocVien();
        instance.setDiem(diem);
        double expected= 0.0;
         double result = instance.getDiem();
        assertEquals(expected, result, 0.0);
    }
    
}
