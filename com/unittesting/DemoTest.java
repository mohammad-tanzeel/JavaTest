package com.unittesting;

//import static org.junit.Assert.*;
//import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.Assert.*;				
import org.junit.Test;

//import org.junit.jupiter.api.Test;

class DemoTest {

	
	@Test
	void testConcatString() {
		Demo demo = new Demo();
		String first = "Hello";
		String second = "World";
		assertEquals("HelloWorld", demo.concatMyString("Hell", "World"));
//		assertTrue(demo.compareString(first, second).equals("Hello"));
//		assertTrue("Testing", "HelloWorl", "HelloWorl");
		assertTrue("Hello".equals("Hello"));
	}
	
	@Test
	void squreTest() {
		Demo demo = new Demo();
		int output_1 = demo.squree(4);
		assertEquals(15, output_1);
	}
}
