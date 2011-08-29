package javalearning;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import utility.Arr;

public class AP1Tests {
	AP1 tst;
	
	@Before
	public void setUp() throws Exception {
		tst = AP1.INSTANCE;
	}
	
	@Test
	public void commonTwo(){
		assertEquals(2, tst.commonTwo(Arr.string("a","c","x"), Arr.string("b","c","d","x")));
		assertEquals(3, tst.commonTwo(Arr.string("a","c","x"), Arr.string("a","b","c","x","z")));
		assertEquals(3, tst.commonTwo(Arr.string("a","b","c"), Arr.string("a","b","c")));
	}
	
	@Test
	public void mergeTwo(){
		assertTrue(Arrays.equals(Arr.string("a","c","y"), tst.mergeTwo(Arr.string("a","c","z"), Arr.string("a","c","y","z"), 3)));
		assertTrue(Arrays.equals(Arr.string("a","b","c"), tst.mergeTwo(Arr.string("a","c","z"), Arr.string("b","f","z"), 3)));
		assertTrue(Arrays.equals(Arr.string("a","c","f"), tst.mergeTwo(Arr.string("a","c","z"), Arr.string("c","f","z"), 3)));
		assertTrue(Arrays.equals(Arr.string("c","f","g"), tst.mergeTwo(Arr.string("f","g","z"), Arr.string("c","f","g"), 3)));
	}
	
	@Test
	public void userCompare(){
		assertEquals(-1, tst.userCompare("bb", 1, "zz", 2));
		assertEquals(1, tst.userCompare("bb", 1, "aa", 2));
		assertEquals(0, tst.userCompare("bb", 1, "bb", 1));
	}
	
	@Test
	public void bigHeights(){
		assertEquals(1, tst.bigHeights(Arr.integer(5,3,6,7,2), 2, 4));
		assertEquals(0, tst.bigHeights(Arr.integer(5,3,6,7,2), 0, 1));
		assertEquals(1, tst.bigHeights(Arr.integer(5,3,6,7,2), 0, 4));
	}
	
	@Test
	public void sumHeights2(){
		assertEquals(7, tst.sumHeights2(Arr.integer(5,3,6,7,2), 2, 4));
		assertEquals(2, tst.sumHeights2(Arr.integer(5,3,6,7,2), 0, 1));
		assertEquals(15, tst.sumHeights2(Arr.integer(5,3,6,7,2), 0, 4));
	}
	
	@Test
	public void sumHeights(){
		assertEquals(6, tst.sumHeights(Arr.integer(5,3,6,7,2), 2, 4));
		assertEquals(2, tst.sumHeights(Arr.integer(5,3,6,7,2), 0, 1));
		assertEquals(11, tst.sumHeights(Arr.integer(5,3,6,7,2), 0, 4));
	}
	
	@Test
	public void scoresSpecial(){
		assertEquals(40, tst.scoresSpecial(Arr.integer(12,10,4), Arr.integer(2,20,30)));
		assertEquals(40, tst.scoresSpecial(Arr.integer(20,10,4), Arr.integer(2,20,10)));
		assertEquals(20, tst.scoresSpecial(Arr.integer(12,11,4), Arr.integer(2,20,31)));
	}
	
	@Test
	public void wordsWithout(){
		assertTrue(Arrays.equals(Arr.string("b","c"), tst.wordsWithout(Arr.string("a", "b", "c", "a"), "a")));
		assertTrue(Arrays.equals(Arr.string("a","c","a"), tst.wordsWithout(Arr.string("a", "b", "c", "a"), "b")));
		assertTrue(Arrays.equals(Arr.string("a","b","a"), tst.wordsWithout(Arr.string("a", "b", "c", "a"), "c")));
	}
	
	@Test
	public void scoreUp(){
		assertEquals(3, tst.scoreUp(Arr.string("a", "a", "b", "b"), Arr.string("?", "c", "b", "?")));
		assertEquals(6, tst.scoreUp(Arr.string("a", "a", "b", "b"), Arr.string("a", "c", "b", "c")));
		assertEquals(11, tst.scoreUp(Arr.string("a", "a", "b", "b"), Arr.string("a", "a", "b", "c")));
		assertEquals(16, tst.scoreUp(Arr.string("a", "a", "b", "b"), Arr.string("a", "a", "b", "b")));
	}
	
	@Test
	public void matchUp(){
		assertEquals(1, tst.matchUp(Arr.string("aa", "bb", "cc"), Arr.string("aaa", "xx", "bb")));
		assertEquals(2, tst.matchUp(Arr.string("aa", "bb", "cc"), Arr.string("aaa", "b", "bb")));
		assertEquals(1, tst.matchUp(Arr.string("aa", "bb", "cc"), Arr.string("", "", "ccc")));
	}
	
	@Test
	public void copyEndy(){
		assertTrue(Arrays.equals(Arr.integer(9, 90), tst.copyEndy(Arr.integer(9,11,90,22,6), 2)));
		assertTrue(Arrays.equals(Arr.integer(9, 90,6), tst.copyEndy(Arr.integer(9,11,90,22,6), 3)));
		assertTrue(Arrays.equals(Arr.integer(1, 1), tst.copyEndy(Arr.integer(12,1,1,13,0,20), 2)));
	}

	@Test
	public void copyEvens(){
		
		assertTrue(Arrays.equals(Arr.integer(2,4), tst.copyEvens(Arr.integer(3,2,4,5,8), 2)));
		
	}
	
	@Test
	public void divedsSelf(){
		assertEquals(true, tst.dividesSelf(128));
		assertEquals(true, tst.dividesSelf(12));
		assertEquals(false, tst.dividesSelf(120));
	}
	
	@Test
	public void hasOne(){
		assertEquals(true, tst.hasOne(10));
		assertEquals(false, tst.hasOne(22));
		assertEquals(false, tst.hasOne(220));
	}
	
	// ToDo: create new test helper for comparing  arrays to list.
	// @Test
	public void wordsWithoutList(){
//		assertEquals(Arr.string("bb", "ccc"), tst.wordsWithoutList(Arr.string("a", "bb", "b", "ccc"), 1));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void wordsFront(){
		assertEquals(Arr.string("a"), tst.wordsFront(Arr.string("a", "b", "c","d"), 1));
		assertEquals(Arr.string("a", "b"), tst.wordsFront(Arr.string("a", "b", "c","d"), 2));
		assertEquals(Arr.string("a", "b", "c"), tst.wordsFront(Arr.string("a", "b", "c","d"), 3));
	}
	
	@Test
	public void wordsCount(){
		assertEquals(2, tst.wordsCount(Arr.string("a", "bb","b","ccc"), 1));
		assertEquals(1, tst.wordsCount(Arr.string("a", "bb","b","ccc"), 3));
		assertEquals(0, tst.wordsCount(Arr.string("a", "bb","b","ccc"), 4));
	}
	
	@Test
	public void scoresAverage(){
		assertEquals(4, tst.scoresAverage(Arr.integer(2,2,4,4)));
		assertEquals(4, tst.scoresAverage(Arr.integer(4,4,4,2,2,2)));
		assertEquals(4, tst.scoresAverage(Arr.integer(3,4,5,1,2,3)));
	}
	
	@Test
	public void scoresClump(){
		assertEquals(false, tst.scoresClump(Arr.integer(3,4,6)));
		assertEquals(true, tst.scoresClump(Arr.integer(2,4,5,6)));
		assertEquals(true, tst.scoresClump(Arr.integer(3, 4, 5)));
		assertEquals(false, tst.scoresClump(Arr.integer(3, 4, 6)));
		assertEquals(true, tst.scoresClump(Arr.integer(1,3,5,5)));
	}
	
	@Test
	public void scores100(){
		assertEquals(true, tst.scores100(Arr.integer(1,100,100)));
		assertEquals(false, tst.scores100(Arr.integer(100,1,100)));
		assertEquals(false, tst.scores100(Arr.integer(1,100,99,100)));
	}
	
	@Test
	public void scoresIncreasing() {
		assertEquals(true, tst.scoresIncreasing(Arr.integer(1, 3, 4)));
		assertEquals(false, tst.scoresIncreasing(Arr.integer(1, 3, 2)));
		assertEquals(true, tst.scoresIncreasing(Arr.integer(1, 1, 4)));
	}

}
