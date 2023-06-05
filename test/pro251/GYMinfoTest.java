/*
 Reema
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
 * @author reema
 */
public class GYMinfoTest {
    
    public GYMinfoTest() {
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
     * Test of getGymName method, of class GYMinfo.
     */
    @Ignore
    @Test 
    public void testGetGymName() {
        System.out.println("getGymName");
        GYMinfo instance = null;
        String expResult = "";
        String result = instance.getGymName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Ignore
    @Test
    public void testGetGymDescription() {
        System.out.println("getGymDescription");
        GYMinfo instance = null;
        String expResult = "";
        String result = instance.getGymDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   @Ignore
    @Test
    public void testGetGymLocation() {
        System.out.println("getGymLocation");
        GYMinfo instance = null;
        String expResult = "";
        String result = instance.getGymLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Ignore
    @Test
    public void testGetGymPrice() {
        System.out.println("getGymPrice");
        GYMinfo instance = null;
        int expResult = 0;
        int result = instance.getGymPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   @Ignore
    @Test
    public void testSetGymName() {
        System.out.println("setGymName");
        String gymName = "";
        GYMinfo instance = null;
        instance.setGymName(gymName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Ignore
    @Test
    public void testSetGymDescription() {
        System.out.println("setGymDescription");
        String gymDescription = "";
        GYMinfo instance = null;
        instance.setGymDescription(gymDescription);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Ignore
    @Test
    public void testSetGymLocation() {
        System.out.println("setGymLocation");
        String gymLocation = "";
        GYMinfo instance = null;
        instance.setGymLocation(gymLocation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Ignore
    @Test
    public void testSetGymPrice() {
        System.out.println("setGymPrice");
        int gymPrice = 0;
        GYMinfo instance = null;
        instance.setGymPrice(gymPrice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
    @Test
    public void testDisplayGYM() {
       
        GYMinfo  GYM = new GYMinfo("ReGYM","For women","Jeddah",3000);
       
        System.out.println("DisplayGYMs");
        String expected =  "Name= " + "ReGYM" + " GYM,\tDescription= " + "For women" + ",\tLocation= " + "Jeddah" +" city"+ ",\tPrice= " + 3000 +" SAR"+"";
    
      assertEquals(expected, GYMinfo.DisplayGYM(GYM));
    }

    @Ignore
    @Test
    public void testToString() {
        System.out.println("toString");
        GYMinfo instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
