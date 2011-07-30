package javalearning;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class String1Tests {
	String1 string1;
	@Before
	public void setUp(){
		string1 = String1.INSTANCE;
	}
	
	@Test
	public void frontAgain(){
		assertEquals(false, string1.frontAgain(""));
		assertEquals(false, string1.frontAgain("e"));
		assertEquals(true, string1.frontAgain("ed"));
		assertEquals(true, string1.frontAgain("edited"));
	}
	
	@Test
	public void seeColor(){
		assertEquals("red", string1.seeColor("redxx"));
		assertEquals("", string1.seeColor("xxred"));
		assertEquals("", string1.seeColor(""));
		assertEquals("blue", string1.seeColor("blueTimes"));
		
	}
	
	@Test
	public void lastTwo(){
		assertEquals("", string1.lastTwo(""));
		assertEquals("a", string1.lastTwo("a"));
		assertEquals("codign", string1.lastTwo("coding"));
		assertEquals("cta", string1.lastTwo("cat"));
	}
	
	
	@Test
	public void conCat(){
		assertEquals("abcat", string1.conCat("abc", "cat"));
		assertEquals("dogcat", string1.conCat("dog", "cat"));
		assertEquals("abc", string1.conCat("abc", ""));
	}
	
	@Test
	public void lastChars(){
		assertEquals("ls", string1.lastChars("last", "chars"));
		assertEquals("ya", string1.lastChars("yo", "java"));
		assertEquals("h@", string1.lastChars("hi", ""));
	}
	
	@Test
	public void atFirst(){
		assertEquals("he", string1.atFirst("hello"));
		assertEquals("@@", string1.atFirst(""));
		assertEquals("h@", string1.atFirst("h"));
		assertEquals("hi", string1.atFirst("hi"));
	}
	
	@Test
	public void hasBad(){
		assertEquals(true, string1.hasBad("xbadxx"));
		assertEquals(true, string1.hasBad("badxx"));
		assertEquals(false, string1.hasBad("xxbadxx"));
	}
	@Test
	public void middleThree(){
		assertEquals("and", string1.middleThree("Candy"));
		assertEquals("and", string1.middleThree("and"));
		assertEquals("lvi", string1.middleThree("solving"));
	}
	
	
	@Test
	public void twoChar(){
		assertEquals("ja", string1.twoChar("java", -1));
		assertEquals("ja", string1.twoChar("java", 0));
		assertEquals("va", string1.twoChar("java", 2));
		assertEquals("ja", string1.twoChar("java", 3));
	}
	
	@Test
	public void nTwice(){
		assertEquals("Helo", string1.nTwice("Hello", 2));
		assertEquals("Choate", string1.nTwice("Chocolate", 3));
		assertEquals("Ce", string1.nTwice("Chocolate", 1));
	}
	
	@Test
	public void endsLy(){
		assertEquals(true, string1.endsLy("oddly"));
		assertEquals(false, string1.endsLy("y"));
		assertEquals(false, string1.endsLy("oddy"));
	}
	
	@Test
	public void middleTwo(){
		assertEquals("ri", string1.middleTwo("string"));
		assertEquals("od", string1.middleTwo("code"));
		assertEquals("ct", string1.middleTwo("Practice"));
		
	}
	
	@Test
	public void withouEnd2(){
		assertEquals("ell", string1.withouEnd2("Hello"));
		assertEquals("b", string1.withouEnd2("abc"));
		assertEquals("", string1.withouEnd2("ab"));
		
	}
	
	@Test
	public void theEnd(){
		assertEquals("H", string1.theEnd("Hello", true));
		assertEquals("o", string1.theEnd("Hello", false));
		assertEquals("o", string1.theEnd("oh", true));
	}
	
	@Test
	public void right2(){
		assertEquals("loHel", string1.right2("Hello"));
		assertEquals("vaja", string1.right2("java"));
		assertEquals("Hi", string1.right2("Hi"));
	}
	
	@Test
	public void left2(){
		assertEquals("lloHe", string1.left2("Hello"));
		assertEquals("vaja", string1.left2("java"));
		assertEquals("Hi", string1.left2("Hi"));
		
	}
	
	@Test
	public void nonStart(){
		assertEquals("ellohere", string1.nonStart("Hello", "There"));
		assertEquals("avaode", string1.nonStart("java", "code"));
		assertEquals("hotlava", string1.nonStart("shotl", "java"));
	}
	
	@Test
	public void comboString(){
		assertEquals("hiHellohi", string1.comboString("Hello", "hi"));
		assertEquals("hiHellohi", string1.comboString("hi", "Hello"));
		assertEquals("baaab", string1.comboString("aaa", "b"));
	}
	
	@Test
	public void withoutEnd(){
		assertEquals("ell", string1.withoutEnd("Hello"));
		assertEquals("av", string1.withoutEnd("java"));
		assertEquals("odin", string1.withoutEnd("coding"));
	}
	
	@Test
	public void firstHalf(){
		assertEquals("Woo", string1.firstHalf("WooHoo"));
		assertEquals("Hello", string1.firstHalf("HelloThere"));
		assertEquals("abc", string1.firstHalf("abcdef"));
	}
	
	@Test
	public void firstTwo(){
		assertEquals("He", string1.firstTwo("Hello"));
		assertEquals("ab", string1.firstTwo("abcdefg"));
		assertEquals("ab", string1.firstTwo("ab"));
	}
	
	@Test
	public void extraEnd(){
		assertEquals("lololo", string1.extraEnd("Hello"));
		assertEquals("ababab", string1.extraEnd("ab"));
		assertEquals("HiHiHi", string1.extraEnd("Hi"));
	}
	
	@Test
	public void makeOutWord(){
		assertEquals("<<Yay>>", string1.makeOutWord("<<>>", "Yay"));
		assertEquals("<<WooHoo>>", string1.makeOutWord("<<>>", "WooHoo"));
		assertEquals("[[word]]", string1.makeOutWord("[[]]", "word"));
	}
	
	@Test
	public void helloName(){
		assertEquals("Hello Bob!", string1.helloName("Bob"));
		assertEquals("Hello Alice!", string1.helloName("Alice"));
		assertEquals("Hello X!", string1.helloName("X"));
	}
	
	@Test
	public void makeAbba(){
		assertEquals("HiByeByeHi", string1.makeAbba("Hi", "Bye"));
		assertEquals("YoAliceAliceYo", string1.makeAbba("Yo", "Alice"));
		assertEquals("xyyx", string1.makeAbba("x", "y"));
		
	}
}
