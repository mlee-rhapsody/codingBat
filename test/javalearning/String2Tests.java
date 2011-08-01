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
	public void wordEnds(){
		
		assertEquals("acac", test.wordEnds("abc1xyz1abc", "b"));
		
		assertEquals("cxz", test.wordEnds("abc1xyz1", "1"));
		assertEquals("cxziij", test.wordEnds("abc1xyz1i1j", "1"));
		assertEquals("XY", test.wordEnds("XYXY", "XY"));
		assertEquals("", test.wordEnds("foo", "foo"));
		assertEquals("c13i", test.wordEnds("abcXY123XYijk", "XY"));
		assertEquals("13", test.wordEnds("XY123XY", "XY"));
		assertEquals("11", test.wordEnds("XY1XY", "XY"));
	}
	

	@Test
	public void plusOut(){
		assertEquals("", test.plusOut("", "xy"));
		assertEquals("++xy++", test.plusOut("12xy34", "xy"));
		assertEquals("1+++++", test.plusOut("12xy34", "1"));
		
		assertEquals("++xy++xy+++xy", test.plusOut("12xy34xyabcxy", "xy"));
		
	}
	
	
	@Test
	public void starOut(){
		assertEquals("", test.starOut(""));
		assertEquals("nostar4u", test.starOut("nostar4u"));
		
		assertEquals("", test.starOut("a*"));
		assertEquals("", test.starOut("*a"));
		
		assertEquals("", test.starOut("a*a"));
		
		assertEquals("ad", test.starOut("ab*cd"));
		assertEquals("ad", test.starOut("ab**cd"));
		assertEquals("silly", test.starOut("sm*eilly"));
		assertEquals("string", test.starOut("stringy*"));
		assertEquals("tring", test.starOut("*stringy*"));
	}
	
	
	@Test
	public void zipZap(){
		
		assertEquals("foobar", test.zipZap("foobar"));
		
		assertEquals("zpXzp", test.zipZap("zipXzap"));
		assertEquals("zpzp", test.zipZap("zopzop"));
		assertEquals("zzzpzp", test.zipZap("zzzopzop"));
	}
	
	@Test
	public void sameStarChar(){
		assertEquals(true, test.sameStarChar(""));
		
		assertEquals(true, test.sameStarChar("*"));
		
		assertEquals(true, test.sameStarChar("x*"));
		assertEquals(true, test.sameStarChar("*x"));
		
		assertEquals(true, test.sameStarChar("biteme"));
		
		assertEquals(true, test.sameStarChar("xy*yzz"));
		assertEquals(false, test.sameStarChar("xy*zzz"));
		assertEquals(true, test.sameStarChar("*xa*az"));
	}
	
	@Test
	public void getSandwich(){
		
		assertEquals("", test.getSandwich(""));
		assertEquals("", test.getSandwich("foobar"));
		
		assertEquals("", test.getSandwich("foobreadbar"));
		assertEquals("", test.getSandwich("breadfoobar"));
		assertEquals("", test.getSandwich("foobarbread"));
		
		assertEquals("jam", test.getSandwich("breadjambread"));
		assertEquals("jam", test.getSandwich("xxbreadjambreadyy"));
		
	}
	
	@Test
	public void xyzMiddle(){
		assertEquals(false, test.xyzMiddle(""));
		assertEquals(true, test.xyzMiddle("xyz"));
		
		assertEquals(true, test.xyzMiddle("xxyz"));
		assertEquals(true, test.xyzMiddle("xyzx"));
		
		assertEquals(false, test.xyzMiddle("xy"));
		assertEquals(false, test.xyzMiddle("a"));
		assertEquals(false, test.xyzMiddle("ab"));
		assertEquals(false, test.xyzMiddle("abc"));
		assertEquals(false, test.xyzMiddle("abcd"));
		assertEquals(false, test.xyzMiddle("abcde"));
		
		assertEquals(false, test.xyzMiddle("AAQQQBB"));
		
		assertEquals(true, test.xyzMiddle("AAxyzBB"));
		assertEquals(true, test.xyzMiddle("AxyzBB"));
		
		assertEquals(true, test.xyzMiddle("xyzxyzAxyzBxyzxyz"));
		assertEquals(true, test.xyzMiddle("xyzxyzxyzBxyzxyz"));
	}
	
	@Test
	public void prefixAgain(){
		assertEquals(true, test.prefixAgain("abXYabc", 1));
		assertEquals(true, test.prefixAgain("abXYabc", 2));
		assertEquals(false, test.prefixAgain("abXYabc", 3));
		
	}
	
	@Test
	public void repeatSeparator(){
		assertEquals("WordXWordXWord", test.repeatSeparator("Word", "X", 3));
		assertEquals("ThisAndThis", test.repeatSeparator("This", "And", 2));
		assertEquals("This", test.repeatSeparator("This", "And", 1));
	}
	
	@Test
	public void repeatFront(){
		assertEquals("", test.repeatFront("", 0));
		assertEquals("a", test.repeatFront("a", 1));
		
		assertEquals("ChocChoChC", test.repeatFront("Chocolate", 4));
		assertEquals("ChoChC", test.repeatFront("Chocolate", 3));
		assertEquals("IcI", test.repeatFront("Ice Cream", 2));
	}
	
	@Test
	public void repeatEnd(){
		assertEquals("", test.repeatEnd("", 1));
		assertEquals("o", test.repeatEnd("Hello", 1));
		assertEquals("lolo", test.repeatEnd("Hello", 2));
		assertEquals("llollollo", test.repeatEnd("Hello", 3));
	}
	
	
	@Test
	public void mixString(){
		assertEquals("", test.mixString("", ""));
		assertEquals("abc", test.mixString("abc", ""));
		assertEquals("xyz", test.mixString("", "xyz"));
		
		assertEquals("HTihere", test.mixString("Hi", "There"));
		
		assertEquals("xTxhxexre", test.mixString("xxxx", "There"));
	}
	
	
	@Test
	public void xyBalance(){
		
		assertEquals(true, test.xyBalance(""));
		
		assertEquals(true, test.xyBalance("y"));
		assertEquals(false, test.xyBalance("x"));
		assertEquals(true, test.xyBalance("z"));
		
		assertEquals(true, test.xyBalance("aaxbby"));
		assertEquals(false, test.xyBalance("aaxbb"));
		assertEquals(false, test.xyBalance("yaaxbb"));
		assertEquals(true, test.xyBalance("yaaxbby"));
	}
	
	
	@Test
	public void bobThere(){
		assertEquals(true, test.bobThere("abcbob"));
		assertEquals(true, test.bobThere("b9b"));
		assertEquals(false, test.bobThere("bac"));
		
		assertEquals(false, test.bobThere("bb"));
		assertEquals(true, test.bobThere("b1b"));
	}
	
	@Test
	public void xyzThere(){
		assertEquals(true, test.xyzThere("abcxyz"));
		assertEquals(false, test.xyzThere("abc.xyz"));
		assertEquals(true, test.xyzThere("xyz.abc"));
	}
	
	@Test
	public void endOther(){
		assertEquals(true, test.endOther("Hiabc", "abc"));
		assertEquals(true, test.endOther("AbC", "HiaBc"));
		assertEquals(true, test.endOther("abc", "abXabc"));
		assertEquals(false, test.endOther("xxx", "aa"));
		assertEquals(true, test.endOther("xxx", ""));
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
