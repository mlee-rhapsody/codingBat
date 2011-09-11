package javalearning;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import utility.Arr;

public class Recursion2Tests {
	Recursion2 test;
	
	
	@Before
	public void setUp() throws Exception {
		test=Recursion2.INSTANCE;
	}
	
	@Test
	public void groupSum5(){
		assertEquals(true, test.groupSum5(0, Arr.integer(2,5,10,4), 19));
	}
	
	
	@Test
	public void groupNoAdj(){
		assertEquals(true, test.groupNoAdj(0, Arr.integer(2,4,8), 10));
		assertEquals(true, test.groupNoAdj(0, Arr.integer(2,5,10,4), 12));
		assertEquals(false, test.groupNoAdj(0, Arr.integer(2,5,10,4), 14));
	}
	
	
	@Test
	public void groupSum6(){
		assertEquals(true, test.groupSum6(0, Arr.integer(5,6,2), 8));
		assertEquals(false, test.groupSum6(0, Arr.integer(5,6,2), 9));
		assertEquals(false, test.groupSum6(0, Arr.integer(5,6,2), 7));
		
		assertEquals(true, test.groupSum6(0, Arr.integer(1,6), 7));
	}

	@Test
	public void groupSum() {
		assertEquals(false, test.groupSum(0, Arr.integer(1,2), 4));
		
		assertEquals(true, test.groupSum(0, Arr.integer(1,2), 3));
		assertEquals(false, test.groupSum(0, Arr.integer(1), 2));
		assertEquals(true, test.groupSum(0, Arr.integer(1), 1));
		assertEquals(true, test.groupSum(0, Arr.integer(2,0,2), 4));
		assertEquals(true, test.groupSum(0, Arr.integer(2,4,8), 10));
		assertEquals(true, test.groupSum(0, Arr.integer(2,4,8), 14));
		assertEquals(false, test.groupSum(0, Arr.integer(2,4,8), 9));
	}

}
