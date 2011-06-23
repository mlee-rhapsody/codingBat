package javalearning;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class Warmup2Tests {
	
	@Test
	public void stringX(){
		assertEquals("x", Warmup2.stringX("x"));
		assertEquals("xx", Warmup2.stringX("xx"));
		assertEquals("xHix", Warmup2.stringX("xxHxix"));
		assertEquals("abcd", Warmup2.stringX("abxxxcd"));
		assertEquals("", Warmup2.stringX(""));
		assertEquals("xabcdx", Warmup2.stringX("xabxxxcdx"));
	}
	
	@Test
	public void stringMatch(){
		assertEquals(3, Warmup2.stringMatch("xxcaazz", "xxbaaz"));
		assertEquals(2, Warmup2.stringMatch("abc", "abc"));
		assertEquals(0, Warmup2.stringMatch("abc", "axc"));
		assertEquals(0, Warmup2.stringMatch("", ""));
		assertEquals(0, Warmup2.stringMatch("a", "a"));
	}
	
	
	@Test
	public void array123(){
		int[] num1 = {1,1,2,3,1};
		int[] num2 = {1,1,2,4,1};
		int[] num3 = {1,2,3};
		int[] num4 = {1, 1, 2, 1, 2, 3};
		
		assertEquals(true, Warmup2.array123(num4));
		assertEquals(true, Warmup2.array123(num3));
		assertEquals(true, Warmup2.array123(num1));
		assertEquals(false, Warmup2.array123(num2));
	}
	
	@Test
	public void arrayFront9(){
		int[] num1 = {1,2,9,3,4};
		int[] num2 = {1,2,3,4,9};
		int[] num3 = {1,2,3,4,5};
		
		assertEquals(true, Warmup2.arrayFront9(num1));
		assertEquals(false, Warmup2.arrayFront9(num2));
		assertEquals(false, Warmup2.arrayFront9(num3));
	}
	@Test
	public void arrayCount9(){
		int[] nums = {1,2,9};
		assertEquals(1, Warmup2.arrayCount9(nums));
	}
	@Test
	public void frontTimes(){
		assertEquals("ChoCho", Warmup2.frontTimes("Chocolate", 2));
		assertEquals("ChoChoCho", Warmup2.frontTimes("Chocolate", 3));
		assertEquals("AbcAbcAbc", Warmup2.frontTimes("Abc", 3));
	}
	
	@Test
	public void last2(){
		assertEquals(1, Warmup2.last2("hixxhi"));
		assertEquals(1, Warmup2.last2("xaxxaxaxx"));
		assertEquals(2, Warmup2.last2("axxxaaxx"));
	}
	
	@Test
	public void stringBits(){
		
		assertEquals("Hlo", Warmup2.stringBits("Hello"));
		assertEquals("H", Warmup2.stringBits("Hi"));
		assertEquals("Hello", Warmup2.stringBits("Heeololeo"));
	}
	
	@Test
	public void stringSplosion(){
		assertEquals("CCoCodCode", Warmup2.stringSplosion("Code"));
		assertEquals("aababc", Warmup2.stringSplosion("abc"));
		assertEquals("aab", Warmup2.stringSplosion("ab"));
	}
	
	@Test
	public void stringTimes(){
		assertEquals("HiHi", Warmup2.stringTimes("Hi", 2));
		assertEquals("HiHiHi", Warmup2.stringTimes("Hi", 3));
		assertEquals("Hi", Warmup2.stringTimes("Hi", 1));
		assertEquals("", Warmup2.stringTimes("Hi", 0));
	}
}
