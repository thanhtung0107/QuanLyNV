/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.chuyenDe;
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
public class chuyenDeDAOTest {
    
    public chuyenDeDAOTest() {
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
     * Test of insert method, of class chuyenDeDAO.
     */
    @org.junit.jupiter.api.Test
    public void testInsert() {
        System.out.println("insert");
        chuyenDe entity = null;
        chuyenDeDAO instance = new chuyenDeDAO();
        instance.insert(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class chuyenDeDAO.
     */
    @org.junit.jupiter.api.Test
    public void testUpdate() {
        System.out.println("update");
        chuyenDe entity = null;
        chuyenDeDAO instance = new chuyenDeDAO();
        instance.update(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class chuyenDeDAO.
     */
    @org.junit.jupiter.api.Test
    public void testDelete() {
        System.out.println("delete");
        String id = "";
        chuyenDeDAO instance = new chuyenDeDAO();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of select method, of class chuyenDeDAO.
     */
    @org.junit.jupiter.api.Test
    public void testSelect() {
        System.out.println("select");
        chuyenDeDAO instance = new chuyenDeDAO();
        List<chuyenDe> expResult = null;
        List<chuyenDe> result = instance.select();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

  
    @org.junit.jupiter.api.Test
    public void testFindById() {
        System.out.println("findById");
        String id = "";
        chuyenDeDAO instance = new chuyenDeDAO();
        chuyenDe expResult = null;
        chuyenDe result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
