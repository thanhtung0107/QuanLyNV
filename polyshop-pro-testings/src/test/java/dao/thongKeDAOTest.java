/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
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
public class thongKeDAOTest {
    
    public thongKeDAOTest() {
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
     * Test of getNguoiHoc method, of class thongKeDAO.
     */
    @Test
    public void testGetNguoiHoc() {
        System.out.println("getNguoiHoc");
        thongKeDAO instance = new thongKeDAO();
        List expResult = null;
        List result = instance.getNguoiHoc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBangDiem method, of class thongKeDAO.
     */
    @Test
    public void testGetBangDiem() {
        System.out.println("getBangDiem");
        Integer makh = null;
        thongKeDAO instance = new thongKeDAO();
        List expResult = null;
        List result = instance.getBangDiem(makh);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiemTheoChuyenDe method, of class thongKeDAO.
     */
    @Test
    public void testGetDiemTheoChuyenDe() {
        System.out.println("getDiemTheoChuyenDe");
        thongKeDAO instance = new thongKeDAO();
        List expResult = null;
        List result = instance.getDiemTheoChuyenDe();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDoanhThu method, of class thongKeDAO.
     */
    @Test
    public void testGetDoanhThu() {
        System.out.println("getDoanhThu");
        int nam = 0;
        thongKeDAO instance = new thongKeDAO();
        List expResult = null;
        List result = instance.getDoanhThu(nam);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNamKhaiGiang method, of class thongKeDAO.
     */
    @Test
    public void testGetNamKhaiGiang() {
        System.out.println("getNamKhaiGiang");
        thongKeDAO instance = new thongKeDAO();
        List<Integer> expResult = null;
        List<Integer> result = instance.getNamKhaiGiang();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
