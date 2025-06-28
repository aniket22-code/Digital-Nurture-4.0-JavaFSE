package org.test.Testing;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Exercise4 {
	
	Calculator calculator;
	
	@Before
	public void setUp() {
		calculator=new Calculator();
	}
	
	@After
	public void tearDown() {
		calculator=null;
	}
	
	@Test
	public void testAddMethod() {
		
		// Arrange
		int num1=30,num2=20;
		
		//act
		int addRes=calculator.addNum(num1, num2);
		
		//assert
		assertEquals(50, addRes);
	}
	
	
	@Test
	public void testSubMethod() {
		
		//Arrange
		int num1=30,num2=20;
		
		//act
		int subRes=calculator.asubNum(num1, num2);
		
		//assert
		assertEquals(10,subRes);
		
		
	}
	

}
