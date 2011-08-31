package javalearning;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import utility.Arr;

public class Array2Tests {
	private static Array2 tst;
	
	@Before
	public void setUp(){
		tst = Array2.INSTANCE;
	}
	
	@Test
	public void no14(){
		assertEquals(true, tst.no14(Arr.integer(1,2,3)));
	}
	
	@Test
	public void only14(){
		assertEquals(true, tst.only14(Arr.integer(1,4,1,4)));
		assertEquals(false, tst.only14(Arr.integer(1,4,2,4)));
		assertEquals(true, tst.only14(Arr.integer(1,1)));
	}
	
	
	@Test
	public void more14(){
		assertEquals(true, tst.more14(Arr.integer(1,4,1)));
		assertEquals(false, tst.more14(Arr.integer(1,4,1,4)));
		assertEquals(true, tst.more14(Arr.integer(1,1)));
	}
	
	@Test
	public void sum28(){
		assertEquals(true, tst.sum28(Arr.integer(2,3,2,2,4,2)));
		assertEquals(false, tst.sum28(Arr.integer(2,3,2,2,4,2,2)));
		assertEquals(false, tst.sum28(Arr.integer(1,2,3,4)));
	}
	
	@Test
	public void lucky13(){
		assertEquals(true, tst.lucky13(Arr.integer(0,2,4)));
		assertEquals(false, tst.lucky13(Arr.integer(1,2,3)));
		assertEquals(false, tst.lucky13(Arr.integer(1,2,4)));
	}
	
	@Test
	public void has22(){
		assertEquals(true, tst.has22(Arr.integer(1,2,2)));
		assertEquals(false, tst.has22(Arr.integer(1,2,1,2)));
		assertEquals(false, tst.has22(Arr.integer(1,2,1,2)));
	}
	
	
	@Test
	public void sum67(){
		assertEquals(18, tst.sum67(Arr.integer(2, 7, 6, 2, 6, 7, 2, 7)));
		assertEquals(5, tst.sum67(Arr.integer(1,2,2)));
		assertEquals(5, tst.sum67(Arr.integer(1,2,2,6,99,99,7)));
		assertEquals(4, tst.sum67(Arr.integer(1,1,6,7,2)));
	}
	
	@Test
	public void sum13(){
		assertEquals(6, tst.sum13(Arr.integer(1,2,2,1)));
		assertEquals(2, tst.sum13(Arr.integer(1,1)));
		assertEquals(6, tst.sum13(Arr.integer(1,2,2,1,13)));
	}
	
	@Test
	public void centeredAverage(){
		assertEquals(3, tst.centeredAverage(Arr.integer(1,2,3,4,100)));
		assertEquals(5, tst.centeredAverage(Arr.integer(1,1,5,5,10,8,7)));
		assertEquals(-3, tst.centeredAverage(Arr.integer(-10,-4,-2,-4,-2,0)));
	}
	@Test
	public void bigDiff(){
		assertEquals(7, tst.bigDiff(Arr.integer(10,3,5,6)));
		assertEquals(8, tst.bigDiff(Arr.integer(7,2,10,9)));
		assertEquals(8, tst.bigDiff(Arr.integer(2,10,7,2)));
	}
	
	@Test
	public void countEvens(){
		assertEquals(3, tst.countEvens(Arr.integer(2,1,2,3,4)));
		assertEquals(3, tst.countEvens(Arr.integer(2,2,0)));
		assertEquals(0, tst.countEvens(Arr.integer(1,3,5)));
	}
}
