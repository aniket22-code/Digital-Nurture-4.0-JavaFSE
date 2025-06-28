package org.test.Testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertionsTest {
	
	
	@Test
	public void testAssertions() {
		
		//Checks if the expected and calculated results are equal
		assertEquals(5,2+3);
		
		//Checks if the given condition is true ,if it is correct then all test cases will pass 
		assertTrue(5>3);
		
		//Checks if given condition is false , if it is correct then all test cases will pass 
		assertFalse(5<3);
		
		//Asserts that an object is null. If it isn't an Error is thrown
		assertNull(null);
		
		// that an object isn't null. If it is an Error is thrown
		assertNotNull(new Object());
	}

}
