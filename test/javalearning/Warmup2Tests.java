package javalearning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Warmup2Tests {

	@Test
	public void has271(){
		int[] num0 = {};
		assertEquals(false, Warmup2.has271(num0));
		
		int[] num1 = {1,2,7,1};
		assertEquals(true, Warmup2.has271(num1));
		
		int[] num2 = {1,2,8,1};
		assertEquals(false, Warmup2.has271(num2));
		
		int[] num3 = {2,7,1};
		assertEquals(true, Warmup2.has271(num3));
		
		int[] num4 = {2,7,3};
		assertEquals(true, Warmup2.has271(num4));
		
		int[] num5 = {2,7,4};
		assertEquals(false, Warmup2.has271(num5));
		
	}
	
	@Test
	public void noTriples(){
		
		int[] num1 = {1, 1, 2, 2, 1};
		assertEquals(true, Warmup2.noTriples(num1));
		
		int[] num2 = {1, 1, 2, 2, 2, 1};
		assertEquals(false, Warmup2.noTriples(num2));
		
		int[] num3 = {1, 1, 1, 2, 2, 2, 1};
		assertEquals(false, Warmup2.noTriples(num3));
		
		int[] num4 = {};
		assertEquals(true, Warmup2.noTriples(num4));
		
		int[] num5 = {1, 1, 1};
		assertEquals(false, Warmup2.noTriples(num5));
	}
	
	
	@Test
	public void array667(){
		
		int[] nums0 = {6, 6, 2, 6, 7};
		assertEquals(2, Warmup2.array667(nums0));
		
		int[] nums1 = {6,6,2};
		assertEquals(1, Warmup2.array667(nums1));
		
		int[] nums2 = {6,6,2,6};
		assertEquals(1, Warmup2.array667(nums2));
		
		int[] nums3 = {6,7,2,6};
		assertEquals(1, Warmup2.array667(nums3));
		
		int[] nums4 = {0};
		assertEquals(0, Warmup2.array667(nums4));
		
		int[] nums5 = {3,6,6,7};
		assertEquals(2, Warmup2.array667(nums5));
		
		int[] nums6 = {};
		assertEquals(0, Warmup2.array667(nums6));
	}
	
	@Test
	public void stringYak(){
		assertEquals("pak", Warmup2.stringYak("yakpak"));
		assertEquals("pak", Warmup2.stringYak("pakyak"));
		assertEquals("123ya", Warmup2.stringYak("yak123ya"));
		assertEquals("", Warmup2.stringYak(""));
	}
	
	@Test
	public void altPairs(){
		assertEquals("kien", Warmup2.altPairs("kitten"));
		assertEquals("Chole", Warmup2.altPairs("Chocolate"));
		assertEquals("Congrr", Warmup2.altPairs("CodingHorror"));
	}
	
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
