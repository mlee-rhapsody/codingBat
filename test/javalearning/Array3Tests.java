package javalearning;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import utility.Arr;

public class Array3Tests {
	private static Array3 tst;
	
	@Before
	public void setUp(){
		tst = Array3.INSTANCE;
	}

	@Test
	public void maxMirror(){
//		assertEquals(4, tst.maxMirror(Arr.integer(21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9)));
		assertEquals(2, tst.maxMirror(Arr.integer(1, 2, 3, 3, 8)));
//		assertEquals(3, tst.maxMirror(Arr.integer(1,1,1)));
//		assertEquals(3, tst.maxMirror(Arr.integer(1,2,3,8,9,3,2,1)));
//		assertEquals(3, tst.maxMirror(Arr.integer(1,2,1,4)));
//		assertEquals(2, tst.maxMirror(Arr.integer(7,1,2,9,7,2,1)));
	}
	
	@Test
	public void getSubArray(){
		assertTrue(Arrays.equals(Arr.integer(3,4,5), tst.getSubArray(Arr.integer(1,2,3,4,5), 2, 3)));
	}
	
	@Test
	public void arrayFind(){
		assertEquals(true, tst.arrayFind(Arr.integer(1,1,1), Arr.integer(1,1,1)));
		assertEquals(true, tst.arrayFind(Arr.integer(1,2,3,4,5,6,7), Arr.integer(3,4,5)));
		assertEquals(false, tst.arrayFind(Arr.integer(1,2,3,4,5,6,7), Arr.integer(3,4,6)));
		assertEquals(false, tst.arrayFind(Arr.integer(1,2,3,4,5,6,7), Arr.integer()));
	}
	
	
	@Test
	public void seriesUp(){
		assertTrue(Arrays.equals(Arr.integer(1, 1, 2, 1, 2, 3), tst.seriesUp(3)));
		assertTrue(Arrays.equals(Arr.integer(1, 1, 2, 1, 2, 3, 1, 2, 3, 4), tst.seriesUp(4)));
	}
	
	@Test
	public void squareUp(){
		assertTrue(Arrays.equals(Arr.integer(0,0,0,1,0,0,2,1,0,3,2,1,4,3,2,1), tst.squareUp(4)));
		assertTrue(Arrays.equals(Arr.integer(0,0,1,0,2,1,3,2,1), tst.squareUp(3)));
		assertTrue(Arrays.equals(Arr.integer(0,1,2,1), tst.squareUp(2)));
	}
	
	
	@Test
	public void linearIn(){
		assertEquals(true, tst.linearIn(Arr.integer(1,2,3), Arr.integer(2)));
		assertEquals(false, tst.linearIn(Arr.integer(1,2,3), Arr.integer(2,4)));
		assertEquals(true, tst.linearIn(Arr.integer(1,2,4,6), Arr.integer(2,4)));
		assertEquals(false, tst.linearIn(Arr.integer(1,2,4,6), Arr.integer(2,3,4)));
		assertEquals(true, tst.linearIn(Arr.integer(1,2,4,6), Arr.integer(2,4)));
	}
	
	@Test
	public void canBalance(){
		assertEquals(true, tst.canBalance(Arr.integer(1,1,1,2,1)));
		assertEquals(false, tst.canBalance(Arr.integer(2, 1, 1, 2, 1)));
		assertEquals(true, tst.canBalance(Arr.integer(10,10)));
	}
	
	@Test
	public void fix45(){
		assertTrue(Arrays.equals(Arr.integer(1,4,5,1), tst.fix45(Arr.integer(1,4,1,5))));
		assertTrue(Arrays.equals(Arr.integer(9, 4, 5, 4, 5, 9), tst.fix45(Arr.integer(5, 4, 9, 4, 9, 5))));
		assertTrue(Arrays.equals(Arr.integer(1, 4, 5, 1, 1, 4, 5), tst.fix45(Arr.integer(1, 4, 1, 5, 5, 4, 1))));
	}
	
	
	@Test
	public void fix34(){
		assertTrue(Arrays.equals(Arr.integer(1, 3, 4, 1, 1, 3, 4), tst.fix34(Arr.integer(1, 3, 1, 4, 4, 3, 1))));
		assertTrue(Arrays.equals(Arr.integer(1,3,4,1), tst.fix34(Arr.integer(1,3,1,4))));
		assertTrue(Arrays.equals(Arr.integer(1,3,4,1,1,3,4), tst.fix34(Arr.integer(1,3,1,4,4,3,1))));
		assertTrue(Arrays.equals(Arr.integer(), tst.fix34(Arr.integer())));
		assertTrue(Arrays.equals(Arr.integer(1), tst.fix34(Arr.integer(1))));
	}
	
	@Test
	public void maxSpan(){
		assertEquals(0, tst.maxSpan(Arr.integer()));
		assertEquals(1, tst.maxSpan(Arr.integer(3)));
		
		assertEquals(4, tst.maxSpan(Arr.integer(1,5,1,1,5)));
		assertEquals(4, tst.maxSpan(Arr.integer(1,2,1,1,3)));
	}
}
