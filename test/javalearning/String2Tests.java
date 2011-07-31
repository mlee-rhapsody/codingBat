package javalearning;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class String2Tests {
	String2 test;
	@Before
	public void setUp() throws Exception {
		test = String2.INSTANCE;
	}
	
	@Test
	public void countCode(){
		assertEquals(1, test.countCode("aaacodebbb"));
		assertEquals(2, test.countCode("codexxcode"));
		assertEquals(2, test.countCode("cozexxcope"));
	}
	
	@Test
	public void catDog(){
		assertEquals(true, test.catDog("catdog"));
		assertEquals(false, test.catDog("catcat"));
		assertEquals(true, test.catDog("1cat1cadodog"));
	}
	
	@Test
	public void countHi(){
		assertEquals(1, test.countHi("abc hi ho"));
		assertEquals(2, test.countHi("ABChi hi"));
		assertEquals(2, test.countHi("hihi"));
	}
	
	@Test
	public void doubleChar() {
		assertEquals("TThhee", test.doubleChar("The"));
		assertEquals("AAAAbbbb", test.doubleChar("AAbb"));
		assertEquals("HHii--TThheerree", test.doubleChar("Hi-There"));
	}

}
