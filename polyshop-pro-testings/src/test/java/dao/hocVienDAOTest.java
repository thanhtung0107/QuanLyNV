/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.util.List;
import model.hocVien;
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
public class hocVienDAOTest {
    
    public hocVienDAOTest() {
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
     * Test of readFromResultSet method, of class hocVienDAO.
     */
    @Test
    public void testReadFromResultSet() throws Exception {
        System.out.println("readFromResultSet");
        ResultSet rs = null;
        hocVienDAO instance = new hocVienDAO();
        hocVien expResult = null;
        hocVien result = instance.readFromResultSet(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of select method, of class hocVienDAO.
     */
    @Test
    public void testSelect_String_ObjectArr() {
        System.out.println("select");
        String sql = "";
        Object[] args = null;
        hocVienDAO instance = new hocVienDAO();
        List<hocVien> expResult = null;
        List<hocVien> result = instance.select(sql, args);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class hocVienDAO.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        hocVien model = null;
        hocVienDAO instance = new hocVienDAO();
        instance.insert(model);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class hocVienDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        hocVien model = null;
        hocVienDAO instance = new hocVienDAO();
        instance.update(model);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class hocVienDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Integer MaHV = null;
        hocVienDAO instance = new hocVienDAO();
        instance.delete(MaHV);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of select method, of class hocVienDAO.
     */
    @Test
    public void testSelect_0args() {
        System.out.println("select");
        hocVienDAO instance = new hocVienDAO();
        List<hocVien> expResult = null;
        List<hocVien> result = instance.select();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class hocVienDAO.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        String id = "";
        hocVienDAO instance = new hocVienDAO();
        hocVien expResult = null;
        hocVien result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
