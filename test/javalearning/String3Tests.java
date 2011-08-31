package javalearning;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class String3Tests {
	String3 tst;
	
	@Before
	public void setUp(){
		tst = String3.INSTANCE;
	}
	
	@Test
	public void notReplace(){
		assertEquals("is not", tst.notReplace("is"));		
		assertEquals("This is not right", tst.notReplace("This is right"));		
		assertEquals("isABCis", tst.notReplace("isABCis"));
		assertEquals("is not-is not", tst.notReplace("is-is"));
		assertEquals("", tst.notReplace(""));
		assertEquals("i", tst.notReplace("i"));
		assertEquals("is not", tst.notReplace(" is "));
		assertEquals("is not", tst.notReplace("is "));
		assertEquals("is not", tst.notReplace("is"));
		
		assertEquals("is not test", tst.notReplace("is test"));
		assertEquals("is not-is not", tst.notReplace("is-is"));
		assertEquals("This is not right", tst.notReplace("This is right"));
	}
	
	@Test
	public void sumNumbers(){
		assertEquals(123, tst.sumNumbers("abc123xyz"));
		assertEquals(44, tst.sumNumbers("abc11xyz33"));
		assertEquals(0, tst.sumNumbers(""));
		
	}
	
	@Test
	public void maxBlock(){
		assertEquals(2, tst.maxBlock("xxyz"));
		assertEquals(5, tst.maxBlock("aaaaabbb"));
		assertEquals(3, tst.maxBlock("abbCCCddBBBxx"));
		assertEquals(0, tst.maxBlock(""));
	}
	
	
	@Test
	public void mirrorEnds(){
		assertEquals("ab", tst.mirrorEnds("abXYZba"));
		assertEquals("a", tst.mirrorEnds("abca"));
		assertEquals("aba", tst.mirrorEnds("aba"));
	}
	
	@Test
	public void sameEnds(){
		assertEquals("ab", tst.sameEnds("abXYab"));
	}
	
	@Test
	public void sumDigits(){
		assertEquals(6, tst.sumDigits("aa1bc2d3"));
		assertEquals(8, tst.sumDigits("aa11b33"));
		assertEquals(0, tst.sumDigits("chocolate"));
	}
	
	@Test
	public void countTriple(){
		assertEquals(3, tst.countTriple("xxxabyyyycd"));
		assertEquals(1, tst.countTriple("abbb"));
		assertEquals(0, tst.countTriple("a"));
		assertEquals(0, tst.countTriple("aa"));
		assertEquals(1, tst.countTriple("aaa"));
		assertEquals(0, tst.countTriple("aab"));
		
		
//		assertEquals(1, tst.countTriple("abcXXXabc"));
	}
	
	@Test
	public void gHappy(){
		assertEquals(true, tst.gHappy("xxgggxygg"));
		assertEquals(false, tst.gHappy("g"));
		assertEquals(true, tst.gHappy("xxggxx"));
		assertEquals(false, tst.gHappy("xxgxx"));
		assertEquals(false, tst.gHappy("xxggyygxx"));
	}
	
	@Test
	public void equalIsNot(){
		assertEquals(false, tst.equalIsNot("This is not"));
		
	}
	
	@Test
	public void withoutString(){
		assertEquals("He there", tst.withoutString("Hello there", "llo"));
		assertEquals("Hllo thr", tst.withoutString("Hello there", "e"));
		assertEquals("Hello there", tst.withoutString("Hello there", "x"));
	}
	
	
	@Test
	public void countYZ(){
		assertEquals(2, tst.countYZ("!!day--yaz!!"));
		assertEquals(2, tst.countYZ("fez day"));
		assertEquals(2, tst.countYZ("day fez"));
		assertEquals(2, tst.countYZ("day fyyyz"));
	}
}
