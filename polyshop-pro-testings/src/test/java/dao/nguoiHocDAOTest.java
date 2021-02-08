/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.nguoiHoc;
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
public class nguoiHocDAOTest {
    
    public nguoiHocDAOTest() {
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
     * Test of insert method, of class nguoiHocDAO.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        nguoiHoc entity = null;
        nguoiHocDAO instance = new nguoiHocDAO();
        instance.insert(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class nguoiHocDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        nguoiHoc model = null;
        nguoiHocDAO instance = new nguoiHocDAO();
        instance.update(model);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class nguoiHocDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String id = "";
        nguoiHocDAO instance = new nguoiHocDAO();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of select method, of class nguoiHocDAO.
     */
    @Test
    public void testSelect() {
        System.out.println("select");
        nguoiHocDAO instance = new nguoiHocDAO();
        List<nguoiHoc> expResult = null;
        List<nguoiHoc> result = instance.select();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectByKeyword method, of class nguoiHocDAO.
     */
    @Test
    public void testSelectByKeyword() {
        System.out.println("selectByKeyword");
        String keyword = "";
        nguoiHocDAO instance = new nguoiHocDAO();
        List<nguoiHoc> expResult = null;
        List<nguoiHoc> result = instance.selectByKeyword(keyword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectByCourse method, of class nguoiHocDAO.
     */
    @Test
    public void testSelectByCourse() {
        System.out.println("selectByCourse");
        Integer makh = null;
        nguoiHocDAO instance = new nguoiHocDAO();
        List<nguoiHoc> expResult = null;
        List<nguoiHoc> result = instance.selectByCourse(makh);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class nguoiHocDAO.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        String manh = "";
        nguoiHocDAO instance = new nguoiHocDAO();
        nguoiHoc expResult = null;
        nguoiHoc result = instance.findById(manh);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
