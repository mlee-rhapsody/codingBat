package javalearning;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class Warmup2Tests {
	
	@Test
	public void last2(){
		assertEquals(1, Warmup2.last2("hixxhi"));
		assertEquals(1, Warmup2.last2("xaxxaxaxx"));
		assertEquals(2, Warmup2.last2("axxxaaxx"));
	}
	
	@Test
	public void stringSplosion(){
		assertEquals("CCoCodCode", Warmup2.stringSplosion("Code"));
		assertEquals("aababc", Warmup2.stringSplosion("abc"));
		assertEquals("aab", Warmup2.stringSplosion("ab"));
	}
	
	@Test
	public void stringBits(){
		
		assertEquals("Hlo", Warmup2.stringBits("Hello"));
		assertEquals("H", Warmup2.stringBits("Hi"));
		assertEquals("Hello", Warmup2.stringBits("Heeololeo"));
	}
	
	@Test
	public void frontTimes(){
		assertEquals("ChoCho", Warmup2.frontTimes("Chocolate", 2));
		assertEquals("ChoChoCho", Warmup2.frontTimes("Chocolate", 3));
		assertEquals("AbcAbcAbc", Warmup2.frontTimes("Abc", 3));
		
	}
	
	@Test
	public void stringTimes(){
		assertEquals("HiHi", Warmup2.stringTimes("Hi", 2));
		assertEquals("HiHiHi", Warmup2.stringTimes("Hi", 3));
		assertEquals("Hi", Warmup2.stringTimes("Hi", 1));
		assertEquals("", Warmup2.stringTimes("Hi", 0));
	}
}
