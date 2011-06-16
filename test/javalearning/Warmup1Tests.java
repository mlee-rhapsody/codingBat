package javalearning;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import javalearning.Warmup1;

import org.junit.Test;



public class Warmup1Tests {
	
	@Test
	public void everyNth(){
		assertEquals("Mrce", Warmup1.everyNth("Miracle", 2));
		assertEquals("aceg", Warmup1.everyNth("abcdefg", 2));
		assertEquals("adg", Warmup1.everyNth("abcdefg", 3));
	}
	
	@Test
	public void endup(){
		assertEquals("HeLLO", Warmup1.endUp("Hello"));
		assertEquals("hi thERE", Warmup1.endUp("hi there"));
		assertEquals("HI", Warmup1.endUp("hi"));
	}
	
	@Test
	public void lastDigit(){
		assertEquals(true, Warmup1.lastDigit(7, 17));
		assertEquals(false, Warmup1.lastDigit(6, 17));
		assertEquals(true, Warmup1.lastDigit(3, 113));
		assertEquals(true, Warmup1.lastDigit(0, 0));
		assertEquals(true, Warmup1.lastDigit(0, 1110));
		assertEquals(false, Warmup1.lastDigit(0, 1));
		
		
	}
	
	@Test
	public void stringE(){
		assertEquals(true, Warmup1.stringE("Hello"));
		assertEquals(true, Warmup1.stringE("Heelle"));
		assertEquals(false, Warmup1.stringE("Heelele"));
	}
	
	@Test
	public void max1020(){
		assertEquals(19, Warmup1.max1020(11, 19));
		assertEquals(19, Warmup1.max1020(19, 11));
		assertEquals(11, Warmup1.max1020(11, 9));
		assertEquals(10, Warmup1.max1020(10, 10));
		assertEquals(20, Warmup1.max1020(20, 20));
		assertEquals(0, Warmup1.max1020(-2, -2));
		assertEquals(10, Warmup1.max1020(10, 21));
		
	}
	
	@Test public void in3050(){
		assertEquals(true, Warmup1.in3050(30, 31));
		assertEquals(false, Warmup1.in3050(30, 41));
		assertEquals(true, Warmup1.in3050(40, 50));
	}
	
	@Test public void close10(){
		assertEquals(8, Warmup1.close10(8, 13));
		assertEquals(8, Warmup1.close10(13, 8));
		assertEquals(0, Warmup1.close10(13, 7));
		
	}
	@Test
	public void intMax(){
		assertEquals(3, Warmup1.intMax(1, 2, 3));
		assertEquals(3, Warmup1.intMax(1, 3, 2));
		assertEquals(3, Warmup1.intMax(3, 2, 1));
		assertEquals(0, Warmup1.intMax(0, 0, 0));
	}
	
	@Test
	public void startOz(){
		assertEquals("o", Warmup1.startOz("ounce"));
		assertEquals("oz", Warmup1.startOz("ozymandias"));
		assertEquals("z", Warmup1.startOz("bzoo"));
		assertEquals("o", Warmup1.startOz("oxx"));
	}
	
	@Test
	public void mixStart(){
		assertEquals(true, Warmup1.mixStart("mix snacks"));
		assertEquals(true, Warmup1.mixStart("pix snacks"));
		assertEquals(false, Warmup1.mixStart("piz snacks"));
		assertEquals(true, Warmup1.mixStart("nix"));
	}
	
	@Test
	public void backAround(){
		assertEquals("tcatt", Warmup1.backAround("cat"));
		assertEquals("oHelloo", Warmup1.backAround("Hello"));
		assertEquals("aaa", Warmup1.backAround("a"));
		assertEquals("", Warmup1.backAround(""));
	}
	
	@Test
	public void delDel(){
		assertEquals("abc", Warmup1.delDel("adelbc"));
		assertEquals("aHello", Warmup1.delDel("adelHello"));
		assertEquals("adedbc", Warmup1.delDel("adedbc"));
		assertEquals("", Warmup1.delDel(""));
		assertEquals("a", Warmup1.delDel("a"));
	}
	
	@Test
	public void diff21(){
		assertEquals(2, Warmup1.diff21(19));
		assertEquals(11, Warmup1.diff21(10));
		assertEquals(0, Warmup1.diff21(21));
		assertEquals(2, Warmup1.diff21(22));
	}
	
	@Test
	public void front22(){
		assertEquals("aaa", Warmup1.front22("a"));
		assertEquals("HaHaHa", Warmup1.front22("Ha"));
		assertEquals("ababcab", Warmup1.front22("abc"));
		assertEquals("kikittenki", Warmup1.front22("kitten"));
		
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
	public void frontBack(){
		assertEquals("eodc", Warmup1.frontBack("code"));
		assertEquals("a", Warmup1.frontBack("a"));
		assertEquals("ba", Warmup1.frontBack("ab"));
		assertEquals("", Warmup1.frontBack(""));
	}
	
	@Test
	public void hasTeen(){
		assertEquals(true, Warmup1.hasTeen(13, 20, 10));
		assertEquals(true, Warmup1.hasTeen(20, 19, 10));
		assertEquals(true, Warmup1.hasTeen(20, 10, 13));
		assertEquals(true, Warmup1.hasTeen(13, 13, 13));
		assertEquals(true, Warmup1.hasTeen(13, 1, 3));
		assertEquals(false, Warmup1.hasTeen(20, 10, 10));
		assertEquals(false, Warmup1.hasTeen(20, 20, 20));
		assertEquals(false, Warmup1.hasTeen(12, 12, 12));
		
	}
	@Test
	public void icyHot(){
		assertEquals(true, Warmup1.icyHot(120, -1));
		assertEquals(true, Warmup1.icyHot(-1, 120));
		assertEquals(false, Warmup1.icyHot(2, 120));
		assertEquals(false, Warmup1.icyHot(0, 0));
		assertEquals(true, Warmup1.icyHot(-1, 101));
		assertEquals(false, Warmup1.icyHot(-1, 100));
		
		
	}
	
	@Test
	public void in1020(){
		assertEquals(true, Warmup1.in1020(12, 99));
		assertEquals(true, Warmup1.in1020(21, 12));
		assertEquals(false, Warmup1.in1020(8, 99));
		assertEquals(true, Warmup1.in1020(10, 20));
		assertEquals(true, Warmup1.in1020(20, 10));
		assertEquals(true, Warmup1.in1020(21, 10));
		assertEquals(true, Warmup1.in1020(20, 9));
	}
	
	@Test
	public void loneTeen(){
		assertEquals(true, Warmup1.loneTeen(13, 99));
		assertEquals(true, Warmup1.loneTeen(21, 19));
		assertEquals(false, Warmup1.loneTeen(19, 13));
		assertEquals(false, Warmup1.loneTeen(12, 12));
		assertEquals(false, Warmup1.loneTeen(20, 20));
		assertEquals(false, Warmup1.loneTeen(13, 13));
		assertEquals(false, Warmup1.loneTeen(19, 19));
	}
	
	@Test
	public void makes10(){
		assertTrue(Warmup1.makes10(9, 10));
		assertFalse(Warmup1.makes10(9, 9));
		assertTrue(Warmup1.makes10(1, 9));
	}
	
	@Test
	public void missingChar(){
		assertEquals("ktten", Warmup1.missingChar("kitten", 1));
		assertEquals("itten", Warmup1.missingChar("kitten", 0));
		assertEquals("kittn", Warmup1.missingChar("kitten", 4));
	}
	
	@Test
	public void monkeyTrouble(){
		assertTrue(Warmup1.monkeyTrouble(true, true));
		assertTrue(Warmup1.monkeyTrouble(false, false));
		assertFalse(Warmup1.monkeyTrouble(true, false));
	}
	
	@Test
	public void nearHundred(){
		assertTrue(Warmup1.nearHundred(93));
		assertTrue(Warmup1.nearHundred(90));
		assertFalse(Warmup1.nearHundred(89));
	}
	
	@Test
	public void notString(){
		assertEquals("not candy", Warmup1.notString("candy"));
		assertEquals("not x", Warmup1.notString("x"));
		assertEquals("not bad", Warmup1.notString("not bad"));
	}
	
	@Test
	public void parrotTrouble(){
		assertTrue(Warmup1.parrotTrouble(true, 6));
		assertFalse(Warmup1.parrotTrouble(true, 7));
		assertFalse(Warmup1.parrotTrouble(false, 6));
	}
	
	@Test
	public void posNeg(){
		assertTrue(Warmup1.posNeg(1, -1, false));
		assertTrue(Warmup1.posNeg(-1, 1, false));
		assertFalse(Warmup1.posNeg(1, 1, false));
	}
	
	@Test
	public void sleepIn(){
		assertTrue(Warmup1.sleepIn(false, false));
		assertFalse(Warmup1.sleepIn(true, false));
		assertTrue(Warmup1.sleepIn(false, true));
	}
	
	@Test
	public void startHi(){
		assertEquals(true, Warmup1.startHi("hi there"));
		assertEquals(true, Warmup1.startHi("hi"));
		assertEquals(false, Warmup1.startHi("hello hi"));
	}
	
	@Test
	public void sumDouble(){
		assertEquals(3, Warmup1.sumDouble(1, 2));
		assertEquals(5, Warmup1.sumDouble(3, 2));
		assertEquals(8, Warmup1.sumDouble(2, 2));
	}
}
