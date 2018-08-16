package com.nissan.training.hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalc {

	@Test
	public void testadd() {
		Calc c=new Calc();
		assertEquals(10,c.add(5,5));
	}
	
	@Test
	public void testsub() {
		Calc c=new Calc();
		assertEquals(10,c.sub(20, 10));
	}
	
	@Test
	public void testmut() {
		Calc c=new Calc();
		assertEquals(10,c.mut(5,2));
	}
	
	@Test
	public void testdiv() {
		Calc c=new Calc();
		assertEquals(2,c.div(10, 5));
	}

}
