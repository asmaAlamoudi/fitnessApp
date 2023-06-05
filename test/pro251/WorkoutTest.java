/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro251;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Asmaa
 */
public class WorkoutTest {
    
    public WorkoutTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Workout.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Workout instance = new Workout("blank", "for apps");
        String expResult = "blank";
        String result = instance.getName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getDescription method, of class Workout.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Workout instance = new Workout("blank", "for apps");
        String expResult = "for apps";
        String result = instance.getDescription();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of toString method, of class Workout.
     */
    @Ignore
    @Test
    public void testToString() {
        System.out.println("toString");
        Workout instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
