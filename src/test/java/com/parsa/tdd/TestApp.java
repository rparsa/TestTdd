package com.parsa.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestApp {

	@Test
	public void testDisplay() {
		assertEquals(new App().getDisplay(), "Hello World");
		
	}

}
