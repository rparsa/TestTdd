/**
 * 
 */
package com.parsa.ilearn.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author rparsa
 *
 */
public class TestApp {


	@Test
	public void testPrintHelloWorld() {
		String expected = new App().getHelloWorld();
		String actual = "Hello World";
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDisplayArgument() {
		String expected = new App().getHelloName("Ramesh");
		String actual = "Hello Ramesh";
		assertEquals(expected, actual);
	}
}
