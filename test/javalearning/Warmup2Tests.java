package javalearning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Warmup2Tests {
	
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
