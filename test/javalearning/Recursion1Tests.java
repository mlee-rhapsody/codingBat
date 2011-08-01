package javalearning;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Recursion1Tests {
	Recursion1 test;
	@Before
	public void setUp(){
		test = Recursion1.INSTANCE;
	}
	
	@Test
	public void count7(){
		assertEquals(0, test.count7(123));
		assertEquals(1, test.count7(7));
		assertEquals(2, test.count7(717));
	}
	
	@Test
	public void sumDigits(){
		assertEquals(3, test.sumDigits(12));
		assertEquals(13, test.sumDigits(49));
		assertEquals(9, test.sumDigits(126));
	}
	
	
	@Test
	public void triangle(){
		assertEquals(0, test.triangle(0));
		assertEquals(1, test.triangle(1));
		assertEquals(3, test.triangle(2));
	}
	
	@Test
	public void bunnyEars2(){
		assertEquals(0, test.bunnyEars2(0));
		assertEquals(2, test.bunnyEars2(1));
		assertEquals(5, test.bunnyEars2(2));
	}
	
	@Test
	public void fibonacci(){
		assertEquals(0, test.fibonacci(0));
		assertEquals(1, test.fibonacci(1));
		assertEquals(1, test.fibonacci(2));
		assertEquals(2, test.fibonacci(3));
		assertEquals(3, test.fibonacci(4));
		assertEquals(5, test.fibonacci(5));
	}
	
	
	@Test
	public void bunnyEars(){
		assertEquals(0, test.bunnyEars(0));
		assertEquals(2, test.bunnyEars(1));
		assertEquals(4, test.bunnyEars(2));
		
	}
	
	
	@Test
	public void factorial() {
		assertEquals(1, test.factorial(1));
		assertEquals(2, test.factorial(2));
		assertEquals(6, test.factorial(3));
	}

}
