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
public class nhanVienTest {
    
    public nhanVienTest() {
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
     * Test of toString method, of class nhanVien.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        nhanVien instance = new nhanVien();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaNV method, of class nhanVien.
     */
    @Test
    public void testGetMaNV() {
        System.out.println("getMaNV");
        nhanVien instance = new nhanVien();
        String expResult = "";
        String result = instance.getMaNV();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaNV method, of class nhanVien.
     */
    @Test
    public void testSetMaNV() {
        
        String maNV = "123";
        nhanVien instance = new nhanVien();
        instance.setMaNV(maNV);
          String expected ="123";
        assertEquals(expected, instance.getMaNV());
    }

    /**
     * Test of getMatKhau method, of class nhanVien.
     */
    @Test
    public void testGetMatKhau() {
        System.out.println("getMatKhau");
        nhanVien instance = new nhanVien();
        String expResult = "";
        String result = instance.getMatKhau();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMatKhau method, of class nhanVien.
     */
    @Test
    public void testSetMatKhau() {
       
        String matKhau = "songlong";
        nhanVien instance = new nhanVien();
        instance.setMatKhau(matKhau);
         String expected ="songlong";
        assertEquals(expected, instance.getMatKhau());
    }

    /**
     * Test of getHoTen method, of class nhanVien.
     */
    @Test
    public void testGetHoTen() {
        System.out.println("getHoTen");
        nhanVien instance = new nhanVien();
        String expResult = "";
        String result = instance.getHoTen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHoTen method, of class nhanVien.
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
     * Test of isVaiTro method, of class nhanVien.
     */
    @Test
    public void testIsVaiTro() {
        System.out.println("isVaiTro");
        nhanVien instance = new nhanVien();
        boolean expResult = false;
        boolean result = instance.isVaiTro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVaiTro method, of class nhanVien.
     */
    @Test
    public void testSetVaiTro() {
    
        boolean vaiTro = false;
        nhanVien instance = new nhanVien();
        boolean expected=false;
        assertEquals(expected, instance.isVaiTro());
    }
    
}
