package javalearning;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class Array1Tests {

	private static Array1 array1;
	
	
	
	int[] nums = {1,2,6};
	int[] nums2 = {6,2,1};
	int[] nums3 = {3,2,1};
	int[] nums4 = {};
	int[] nums5 = {6,2,6};
	int[] nums6 = {1};
	int[] nums7 = {7,7};
	
	int[] myPi = {3, 1, 4};
	
	int[] numA = {7, 3};
	int[] numB = {7, 3, 2};
	int[] num0 = {1,2,3};
	int[] f119 = {5, 11, 9};
	
	
	
	@Before
	public void setUp(){
		array1 = Array1.INSTANCE;
	}
	
	@Test
	public void unlucky1(){
		
		int[] empty = {};
		int[] one3	= {1,3};
		int[] three = {1, 3, 2};
		int[] threeA = {1, 1, 3};
		int[] threeB = {1, 1, 1};
		int[] fail = {1, 1, 1, 3, 1};
		
		assertEquals(false, array1.unlucky1(empty));
		assertEquals(false, array1.unlucky1(nums6));
		assertEquals(true, array1.unlucky1(one3));
		assertEquals(false, array1.unlucky1(nums7));
		
		assertEquals(true, array1.unlucky1(three));
		assertEquals(true, array1.unlucky1(threeA));
		assertEquals(false, array1.unlucky1(threeB));
		
		assertEquals(false, array1.unlucky1(fail));
		
		
	}
	

	@Ignore
	@Test
	public void front11(){
		
	}
	
	
	@Ignore
	@Test
	public void make2(){
		
	}
	
	
	
	@Test
	public void fix23(){
		int[] b = {1, 2, 0};
		assertTrue(Arrays.equals(b, array1.fix23(num0)));
	}
	
	@Test
	public void plusTwo(){
		
		int[] a= {9, 2};
		int[] b ={3, 4};
		int[] c = {9, 2, 3, 4};
		
		assertTrue(Arrays.equals(c, array1.plusTwo(a, b)));
	}
	
	
	@Test
	public void makeMiddle(){
		
		int[] a= {7,1,2,3,4,9};
		int[] b ={2, 3};
		
		assertTrue(Arrays.equals(b, array1.makeMiddle(a)));
	}
	@Ignore
	@Test
	public void swapEnds(){
		
	}
	
	@Ignore
	@Test
	public void frontPiece(){
		
	}
	
	@Ignore
	@Test
	public void maxTriple(){
		
	}
	
	
	@Ignore
	@Test
	public void midThree(){
		
	}
	
	
	@Ignore
	@Test
	public void biggerTwo(){
		
	}
	
	
	@Ignore
	@Test
	public void start1(){
		
	}
	
	@Test
	public void double23(){
		int[] a= {2,2};
		int[] b= {2,3};
		
		assertEquals(true, array1.double23(a));
		assertEquals(false, array1.double23(b));
	}
	
	@Test
	public void makeLast(){
		int[] a = {0, 0, 0, 0, 0, 6};
		int[] b = {4, 5, 6};
		assertTrue(Arrays.equals(a, array1.makeLast(b)));
	}
	
	
	@Test
	public void no23(){
		int[] a = {2, 5};
		int[] b = {5, 2};
		assertEquals(false, array1.no23(a));
		assertEquals(false, array1.no23(b));
		assertEquals(true, array1.no23(nums7));
	}
	
	@Test
	public void has23(){
		int[] a = {2, 5};
		int[] b = {5, 2};
		assertEquals(true, array1.has23(a));
		assertEquals(true, array1.has23(b));
		assertEquals(false, array1.has23(nums7));
	}


	
	@Test
	public void makeEnds(){
		int[] a = {1, 3};
		assertTrue(Arrays.equals(a, array1.makeEnds(num0)));
	}
	
	
	
	@Test
	public void middleWay(){
		int[] answr = {2, 5};
		int[] b ={4, 5, 6};
		
		assertTrue(Arrays.equals(answr, array1.middleWay(num0, b)));
	}
	
	
	@Test
	public void sum2(){
		assertEquals(3, array1.sum2(num0));
		assertEquals(0, array1.sum2(nums4));
	}
	
	
	@Test
	public void maxEnd3(){
		int[] a = {3, 3, 3};
		assertTrue(Arrays.equals(a, array1.maxEnd3(num0)));
		
		int[] t113 = {2, 11, 3};
		int[] eee = {3, 3, 3};
		assertTrue(Arrays.equals(eee, array1.maxEnd3(t113)));
	}
	
	@Test
	public void reverse3(){
		int[] a = {3, 2, 1};
		int[] b = {9, 11, 5};
		
		assertTrue(Arrays.equals(a, array1.reverse3(num0)));
		assertTrue(Arrays.equals(b, array1.reverse3(f119)));
	}
	
	@Test
	public void rotateLeft3(){
		int[] t31 = {2, 3, 1};
		int[] e95 = {11, 9, 5};
		assertTrue(Arrays.equals(t31, array1.rotateLeft3(num0)));
		assertTrue(Arrays.equals(e95, array1.rotateLeft3(f119)));
		
	}
	
	@Test
	public void sum3(){
		int[] f12 = {5, 11, 12};
		int[] s00 = {7, 0, 0};
		assertEquals(6, array1.sum3(num0));
		assertEquals(28, array1.sum3(f12));
		assertEquals(7, array1.sum3(s00));
	}
	
	@Test
	public void commonEnd(){
		assertEquals(true, array1.commonEnd(num0, numA));
		assertEquals(false, array1.commonEnd(num0, numB));
		assertEquals(true, array1.commonEnd(num0, nums));
	}
	
	
	@Test
	public void makePi(){
		assertTrue(Arrays.equals(myPi, array1.makePi()));
	}
	
	@Test
	public void sameFirstLast(){
		
		assertEquals(false, array1.sameFirstLast(nums4));
		assertEquals(true, array1.sameFirstLast(nums6));
		
		assertEquals(true, array1.sameFirstLast(nums5));
		
		assertEquals(true, array1.sameFirstLast(nums7));
		
		
	}
	
	@Test
	public void firstLast6() {
		
		assertEquals(true, array1.firstLast6(nums));
		assertEquals(true, array1.firstLast6(nums2));
		assertEquals(false, array1.firstLast6(nums3));
		assertEquals(false, array1.firstLast6(nums4));
		assertEquals(true, array1.firstLast6(nums5));
	}

}
