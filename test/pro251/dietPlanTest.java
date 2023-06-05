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


/**
 *
 * @author 96650
 */
public class dietPlanTest {
    
    public dietPlanTest() {
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
     * Test of Generate_Plan method, of class dietPlan.
     */
    @Test
    public void testGenerate_Plan() {
        System.out.println("Generate_Plan");
        dietPlan instance = new dietPlan(1);
        int calori = 1000;
        int expResult = 0;
        int result = dietPlan.Generate_Plan(calori);
        assertEquals(expResult, result);

    }

    /**
     * Test of diet_Plans method, of class dietPlan.
     */
    
    @Test(timeout=30)
    public void testDiet_Plans() {
        System.out.println("diet_Plans");
     int result_2 = 0;
        dietPlan instance = new dietPlan(0);
        String expResult = "Diet Plan Type : "+ "\nketo"+
                "\nDescription :"+"\nOne of the crash diets for rapid weight loss is low-carbohydrate and high-fat keto diet";
        String result = instance.diet_Plans(result_2);
        assertEquals(expResult, result);
     
    }
    
}
