package javalearning;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import javalearning.Warmup1;

import org.junit.Test;



public class Warmup1Tests {
	
	
	@Test
	public void sleepIn(){
		assertTrue(Warmup1.sleepIn(false, false));
		assertFalse(Warmup1.sleepIn(true, false));
		assertTrue(Warmup1.sleepIn(false, true));
	}
	
	@Test
	public void monkeyTrouble(){
		assertTrue(Warmup1.monkeyTrouble(true, true));
		assertTrue(Warmup1.monkeyTrouble(false, false));
		assertFalse(Warmup1.monkeyTrouble(true, false));
	}
	
	@Test
	public void sumDouble(){
		assertEquals(3, Warmup1.sumDouble(1, 2));
		assertEquals(5, Warmup1.sumDouble(3, 2));
		assertEquals(8, Warmup1.sumDouble(2, 2));
	}
	
	@Test
	public void diff21(){
		assertEquals(2, Warmup1.diff21(19));
		assertEquals(11, Warmup1.diff21(10));
		assertEquals(0, Warmup1.diff21(21));
		assertEquals(2, Warmup1.diff21(22));
	}
	
	@Test
	public void parrotTrouble(){
		assertTrue(Warmup1.parrotTrouble(true, 6));
		assertFalse(Warmup1.parrotTrouble(true, 7));
		assertFalse(Warmup1.parrotTrouble(false, 6));
	}
	
	@Test
	public void makes10(){
		assertTrue(Warmup1.makes10(9, 10));
		assertFalse(Warmup1.makes10(9, 9));
		assertTrue(Warmup1.makes10(1, 9));
	}
	
	@Test
	public void nearHundred(){
		assertTrue(Warmup1.nearHundred(93));
		assertTrue(Warmup1.nearHundred(90));
		assertFalse(Warmup1.nearHundred(89));
	}
	
	@Test
	public void posNeg(){
		assertTrue(Warmup1.posNeg(1, -1, false));
		assertTrue(Warmup1.posNeg(-1, 1, false));
		assertFalse(Warmup1.posNeg(1, 1, false));
	}
	
	@Test
	public void notString(){
		assertEquals("not candy", Warmup1.notString("candy"));
		assertEquals("not x", Warmup1.notString("x"));
		assertEquals("not bad", Warmup1.notString("not bad"));
	}
	
	@Test
	public void missingChar(){
		assertEquals("ktten", Warmup1.missingChar("kitten", 1));
		assertEquals("itten", Warmup1.missingChar("kitten", 0));
		assertEquals("kittn", Warmup1.missingChar("kitten", 4));
	}
	
	@Test
	public void frontBack(){
		assertEquals("eodc", Warmup1.frontBack("code"));
		assertEquals("a", Warmup1.frontBack("a"));
		assertEquals("ba", Warmup1.frontBack("ab"));
		assertEquals("", Warmup1.frontBack(""));
	}
	
	@Test
	public void front3(){
		assertEquals("JavJavJav", Warmup1.front3("Java"));
		assertEquals("ChoChoCho", Warmup1.front3("Chocolate"));
		assertEquals("abcabcabc", Warmup1.front3("abc"));
		assertEquals("ababab", Warmup1.front3("ab"));
		assertEquals("aaa", Warmup1.front3("a"));
		assertEquals("", Warmup1.front3(""));
	}
	
	@Test
	public void backAround(){
		assertEquals("tcatt", Warmup1.backAround("cat"));
		assertEquals("oHelloo", Warmup1.backAround("Hello"));
		assertEquals("aaa", Warmup1.backAround("a"));
		assertEquals("", Warmup1.backAround(""));
	}
}
