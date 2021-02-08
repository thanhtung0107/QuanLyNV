/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.util.List;
import model.nhanVien;
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
public class nhanVienDAOTest {
    
    public nhanVienDAOTest() {
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
     * Test of readFromResultSet method, of class nhanVienDAO.
     */
    @Test
    public void testReadFromResultSet() throws Exception {
        System.out.println("readFromResultSet");
        ResultSet rs = null;
        nhanVienDAO instance = new nhanVienDAO();
        nhanVien expResult = null;
        nhanVien result = instance.readFromResultSet(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of select method, of class nhanVienDAO.
     */
    @Test
    public void testSelect_String_ObjectArr() {
        System.out.println("select");
        String sql = "";
        Object[] args = null;
        nhanVienDAO instance = new nhanVienDAO();
        List<nhanVien> expResult = null;
        List<nhanVien> result = instance.select(sql, args);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class nhanVienDAO.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        nhanVien entity = null;
        nhanVienDAO instance = new nhanVienDAO();
        instance.insert(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class nhanVienDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        nhanVien entity = null;
        nhanVienDAO instance = new nhanVienDAO();
        instance.update(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class nhanVienDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String maNV = "";
        nhanVienDAO instance = new nhanVienDAO();
        instance.delete(maNV);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of select method, of class nhanVienDAO.
     */
    @Test
    public void testSelect_0args() {
        System.out.println("select");
        nhanVienDAO instance = new nhanVienDAO();
        List<nhanVien> expResult = null;
        List<nhanVien> result = instance.select();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class nhanVienDAO.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        String id = "";
        nhanVienDAO instance = new nhanVienDAO();
        nhanVien expResult = null;
        nhanVien result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
