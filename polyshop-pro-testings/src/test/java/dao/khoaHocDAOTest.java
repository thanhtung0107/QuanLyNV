/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.util.List;
import model.khoaHoc;
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
public class khoaHocDAOTest {
    
    public khoaHocDAOTest() {
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
     * Test of readFromResultSet method, of class khoaHocDAO.
     */
    @Test
    public void testReadFromResultSet() throws Exception {
        System.out.println("readFromResultSet");
        ResultSet rs = null;
        khoaHocDAO instance = new khoaHocDAO();
        khoaHoc expResult = null;
        khoaHoc result = instance.readFromResultSet(rs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of select method, of class khoaHocDAO.
     */
    @Test
    public void testSelect_String_ObjectArr() {
        System.out.println("select");
        String sql = "";
        Object[] args = null;
        khoaHocDAO instance = new khoaHocDAO();
        List<khoaHoc> expResult = null;
        List<khoaHoc> result = instance.select(sql, args);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class khoaHocDAO.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        khoaHoc model = null;
        khoaHocDAO instance = new khoaHocDAO();
        instance.insert(model);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class khoaHocDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        khoaHoc model = null;
        khoaHocDAO instance = new khoaHocDAO();
        instance.update(model);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class khoaHocDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Integer MaKH = null;
        khoaHocDAO instance = new khoaHocDAO();
        instance.delete(MaKH);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of select method, of class khoaHocDAO.
     */
    @Test
    public void testSelect_0args() {
        System.out.println("select");
        khoaHocDAO instance = new khoaHocDAO();
        List<khoaHoc> expResult = null;
        List<khoaHoc> result = instance.select();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class khoaHocDAO.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        Integer makh = null;
        khoaHocDAO instance = new khoaHocDAO();
        khoaHoc expResult = null;
        khoaHoc result = instance.findById(makh);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
