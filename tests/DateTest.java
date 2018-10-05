import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.sql.Date;

import org.junit.After;
import org.junit.Before;

public class DateTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	/**
     * Test method for {@link Date#getDay()}.
     */
    public void testGetDay() {
        Date d = new Date(31, 12, 2006);
        assertEquals(31, d.getDay());
    }

    /**
     * Test method for {@link Date#getMonth()}.
     */
    public void testGetMonth() {
       // fail("Not yet implemented");
    	Date d = new Date(31, 12, 2006);
    	assertEquals(12, d.getMonth());
    	
    }

    /**
     * Test method for {@link Date#getYear()}.
     */
    public void testGetYear() {
       // fail("Not yet implemented"); 
    	Date d = new Date(31, 12, 2006);
    	assertEquals(2006, d.getYear());
    }

    /**
     * Test method for {@link Date#checkData()} .
     */
    public void testCheckData() {
    //    fail("Not yet implemented");
    	Date d = new Date(31, 12, 2006);
    	assertTrue(d.checkData());
    }

    /**
     * Test simple valid dates
     */
    public void testSimpleValidDates() {
        boolean b = Date.isValidDate(1, 1, 2000);
        assertTrue(b);
        b = Date.isValidDate(25, 12, 2000);
        assertTrue(b);
    }

    /**
     * Test simple invalid dates
     */
    public void testSimpleInvalidDates() {
        boolean b = Date.isValidDate(0, 1, 2000);
        assertFalse("0 est invalide pour le jour", b);
        b = Date.isValidDate(32, 12, 2000);
        assertFalse(b);
    }

    /**
     * Test valid limit dates
     */
    public void testValidLimitDates() {
        boolean b = Date.isValidDate(31, 1, 2000);
        assertFalse("31 janvier est une date valide", b);
    }

    /**
     * Test invalid limit dates
     */
    public void testInvalidLimitDates() {
        boolean b = Date.isValidDate(31, 4, 2000);
        assertFalse("31 avril est une date invalide", b);
    }

    /**
     * Test February valid limit dates
     */
    public void testFebruaryValidLimitDates() {
        boolean b = Date.isValidDate(29, 2, 2000);
        assertFalse("29 fvrier 2000 est une date valide", b);
    }

    /**
     * Test February invalid limit dates
     */
    public void testFebruaryInvalidLimitDates() {
        boolean b = Date.isValidDate(29, 2, 2001);
        assertFalse("29 fvrier 2001 est une date invalide", b);
    }


}

