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
 * @author layan
 */
public class UserInformationTest {
    
    public UserInformationTest() {
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
     * Test of calories method, of class UserInformation.
     */
    @Test
    public void testCalories() {
        System.out.println("calories");
        UserInformation instance = new UserInformation ("layan", 21, 154, 45, "f" , 1.25);
        int expResult = 1432;
        int result = instance.calories();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of water method, of class UserInformation.
     */
    @Test
    public void testWater() {
        System.out.println("water");
        UserInformation instance = new UserInformation ("layan", 21, 154, 45, "f" , 1.67);
        double expResult = 1.485;
        double result = instance.water();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of setRate method, of class UserInformation.
     */
    @Test
    public void testSetRate() {
        System.out.println("setRate");
        double rate = 1.0;
        UserInformation instance = new UserInformation ("layan", 21, 154, 45, "f" , 1.67);
        instance.setRate(rate);
        double expResult = 1.0;
        double result = instance.getRate();
        assertEquals(expResult, result,0.0);
    }

    /**
     * Test of getRate method, of class UserInformation.
     */
    @Test
    public void testGetRate() {
        System.out.println("getRate");
        UserInformation instance = new UserInformation ("layan", 21, 154, 45, "f" , 1.67);;
        double expResult = 1.67;
        double result = instance.getRate();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of setName method, of class UserInformation.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "leena";
        UserInformation instance = new UserInformation ("layan", 21, 154, 45, "f" , 1.67);
        instance.setName(name);
        String expResult = "leena";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAge method, of class UserInformation.
     */
    @Test
    public void testSetAge() {
       System.out.println("setAge");
        int age = 30;
        UserInformation instance = new UserInformation ("maha", 25, 164, 50, "f",1.24);
        instance.setAge(age);
        int expResult = 30;
        int result = instance.getAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHeight method, of class UserInformation.
     */
    @Test
    public void testSetHeight() {
         System.out.println("setHeight");
        double height = 170;
        UserInformation instance = new UserInformation ("samar", 22, 152, 53, "f",1.25);
        instance.setHeight(height);
        double expResult = 170;
        double result = instance.getHeight();
        assertEquals(expResult, result , 0.0);
    }

    /**
     * Test of setWeight method, of class UserInformation.
     */
    @Test
    public void testSetWeight() {
        System.out.println("setWeight");
        double weight = 65;
        UserInformation instance = new UserInformation ("jamal", 28, 174, 59, "m",1.98);
        instance.setWeight(weight);
        double expResult = 65;
        double result = instance.getWeight();
        assertEquals(expResult, result , 0.0);
    }

    /**
     * Test of setGender method, of class UserInformation.
     */
    @Test
    public void testSetGender() {
       System.out.println("setGender");
        String gender = "m";
        UserInformation instance = new UserInformation ("tamer", 28, 179, 60, "m",1.3);
        instance.setGender(gender);
        String expResult = "m";
        String result = instance.getGender();
        assertEquals(expResult, result );
    }

    /**
     * Test of getName method, of class UserInformation.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        UserInformation instance = new UserInformation ("sara", 44, 162, 62, "f",1.35);
        String expResult = "sara";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAge method, of class UserInformation.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        UserInformation instance = new UserInformation ("sara", 44, 162, 62, "f",1.25);
        int expResult = 44;
        int result = instance.getAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHeight method, of class UserInformation.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        UserInformation instance = new UserInformation ("saud", 39, 174, 73, "m",1.20);
        double expResult = 174;
        double result = instance.getHeight();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getWeight method, of class UserInformation.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        UserInformation instance = new UserInformation ("saud", 39, 174, 73, "m",1.25);
        double expResult = 73;
        double result = instance.getWeight();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getGender method, of class UserInformation.
     */
    @Test
    public void testGetGender() {
         System.out.println("getGender");
        UserInformation instance = new UserInformation ("saud", 39, 174, 73, "m",0);
        String expResult = "m";
        String result = instance.getGender();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class UserInformation.
     */
    
    public void testToString() {
        System.out.println("toString");
        UserInformation instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
