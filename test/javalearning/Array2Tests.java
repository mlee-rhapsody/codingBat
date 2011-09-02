package javalearning;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

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
	public void zeroMax(){
		assertTrue(Arrays.equals(Arr.integer(), tst.zeroMax(Arr.integer())));
//		assertTrue(Arrays.equals(Arr.integer(5,1,5), tst.zeroMax(Arr.integer(0,1,5))));
//		assertTrue(Arrays.equals(Arr.integer(5,5,3,3), tst.zeroMax(Arr.integer(0,5,0,3))));
//		assertTrue(Arrays.equals(Arr.integer(3,4,3,3), tst.zeroMax(Arr.integer(0,4,0,3))));
//		assertTrue(Arrays.equals(Arr.integer(1,1,0), tst.zeroMax(Arr.integer(0,1,0))));
	}
	
	
	@Test
	public void withoutTen(){
		assertTrue(Arrays.equals(Arr.integer(1,2,0,0), tst.withoutTen(Arr.integer(1,10,10,2))));
		assertTrue(Arrays.equals(Arr.integer(2,0,0), tst.withoutTen(Arr.integer(10,2,10))));
		assertTrue(Arrays.equals(Arr.integer(1,99,0), tst.withoutTen(Arr.integer(1,99,10))));
	}
	
	@Test
	public void zeroFront(){
		assertTrue(Arrays.equals(Arr.integer(0,0,1,1), tst.zeroFront(Arr.integer(1,0,0,1))));
		assertTrue(Arrays.equals(Arr.integer(0,0,1,1,1), tst.zeroFront(Arr.integer(0,1,1,0,1))));
		assertTrue(Arrays.equals(Arr.integer(0,1), tst.zeroFront(Arr.integer(1,0))));
	}
	
	
	@Test
	public void notAlone(){
		assertTrue(Arrays.equals(Arr.integer(1,1,1,2), tst.notAlone(Arr.integer(1,1,1,2), 1)));
		assertTrue(Arrays.equals(Arr.integer(1,3,3), tst.notAlone(Arr.integer(1,2,3), 2)));
		assertTrue(Arrays.equals(Arr.integer(1,3,3), tst.notAlone(Arr.integer(1,2,3), 2)));
		assertTrue(Arrays.equals(Arr.integer(1,3,3,5,5,2), tst.notAlone(Arr.integer(1,2,3,2,5,2), 2)));
	}

	@Test
	public void post4(){
		assertTrue(Arrays.equals(Arr.integer(), tst.post4(Arr.integer(4))));
		assertTrue(Arrays.equals(Arr.integer(1,2), tst.post4(Arr.integer(2,4,1,2))));
		assertTrue(Arrays.equals(Arr.integer(2), tst.post4(Arr.integer(4,1,4,2))));
		assertTrue(Arrays.equals(Arr.integer(1,2,3), tst.post4(Arr.integer(4,4,1,2,3))));
	}
	
	@Test
	public void pre4(){
		assertTrue(Arrays.equals(Arr.integer(1), tst.pre4(Arr.integer(1,4,4))));
		assertTrue(Arrays.equals(Arr.integer(3,1), tst.pre4(Arr.integer(3,1,4))));
		
		assertTrue(Arrays.equals(Arr.integer(), tst.pre4(Arr.integer())));
		assertTrue(Arrays.equals(Arr.integer(4), tst.pre4(Arr.integer(4))));
		assertTrue(Arrays.equals(Arr.integer(1,2), tst.pre4(Arr.integer(1,2,4,1))));
	}
	
	@Test
	public void tenRun(){
		assertTrue(Arrays.equals(Arr.integer(0,0), tst.tenRun(Arr.integer(0,2))));
		assertTrue(Arrays.equals(Arr.integer(1,2,3,4,5), tst.tenRun(Arr.integer(1,2,3,4,5))));
		assertTrue(Arrays.equals(Arr.integer(1,10,10,10,10), tst.tenRun(Arr.integer(1,10,3,4,5))));
		assertTrue(Arrays.equals(Arr.integer(2,10,10,10,20,20), tst.tenRun(Arr.integer(2,10,3,4,20,5))));
		assertTrue(Arrays.equals(Arr.integer(10,10,10,20), tst.tenRun(Arr.integer(10,1,9,20))));
	}
	
	@Test
	public void shiftLeft(){
		assertTrue(Arrays.equals(Arr.integer(2,5,3,6), tst.shiftLeft(Arr.integer(6,2,5,3))));
		assertTrue(Arrays.equals(Arr.integer(1,2), tst.shiftLeft(Arr.integer(2,1))));
		assertTrue(Arrays.equals(Arr.integer(1), tst.shiftLeft(Arr.integer(1))));
	}
	
	
	@Test
	public void tripleUp(){
		assertEquals(true, tst.tripleUp(Arr.integer(1,4,5,6,2)));
		assertEquals(true, tst.tripleUp(Arr.integer(1,2,3)));
		assertEquals(false, tst.tripleUp(Arr.integer(1,2,4)));
	}
	
	@Test
	public void sameEnds(){
		assertEquals(false, tst.sameEnds(Arr.integer(5,6,45,99,13,5,6), 1));
		assertEquals(true, tst.sameEnds(Arr.integer(5,6,45,99,13,5,6), 2));
		assertEquals(false, tst.sameEnds(Arr.integer(5,6,45,99,13,5,6), 3));
	}
	
	@Test
	public void twoTwo(){
		assertEquals(true, tst.twoTwo(Arr.integer(1)));
		assertEquals(true, tst.twoTwo(Arr.integer(4,2,2,3)));
		assertEquals(true, tst.twoTwo(Arr.integer(2,2,4)));
		assertEquals(false, tst.twoTwo(Arr.integer(2,2,3,2)));
	}
	
	@Test
	public void haveThree(){
		assertEquals(true,tst.haveThree(Arr.integer(3,1,3,1,3)));
		assertEquals(false,tst.haveThree(Arr.integer(3,1,3,3)));
		assertEquals(false,tst.haveThree(Arr.integer(3,4,3,3,4)));
	}
	
	@Test
	public void modThree(){
		assertEquals(true, tst.modThree(Arr.integer(2,1,3,5)));
		assertEquals(false, tst.modThree(Arr.integer(2,1,2,5)));
		assertEquals(true, tst.modThree(Arr.integer(2,4,2,5)));
	}
	
	@Test
	public void has12(){
		assertEquals(true, tst.has12(Arr.integer(1,3,2)));
		assertEquals(true, tst.has12(Arr.integer(3,1,2)));
		assertEquals(false, tst.has12(Arr.integer(2,1)));
	}
	
	@Test
	public void has77(){
		assertEquals(true, tst.has77(Arr.integer(1,7,7)));
		assertEquals(true, tst.has77(Arr.integer(1,7,1,7)));
		assertEquals(false, tst.has77(Arr.integer(1,7,1,1,7)));
	}
	
	@Test
	public void matchup(){
		assertEquals(2, tst.matchUp(Arr.integer(1,2,3), Arr.integer(2,3,10)));
		assertEquals(3, tst.matchUp(Arr.integer(1,2,3), Arr.integer(2,3,5)));
		assertEquals(2, tst.matchUp(Arr.integer(1,2,3), Arr.integer(2,3,3)));
	}
	
	
	@Test
	public void matchUp(){
		assertEquals(2, tst.matchUp(Arr.integer(1,2,3),Arr.integer(2,3,10)));
		assertEquals(3, tst.matchUp(Arr.integer(1,2,3),Arr.integer(2,3,5)));
		assertEquals(2, tst.matchUp(Arr.integer(1,2,3),Arr.integer(2,3,3)));
	}
	
	
	@Test
	public void either24(){
		assertEquals(true, tst.either24(Arr.integer(1,2,2)));
		assertEquals(true, tst.either24(Arr.integer(4,4,1)));
		assertEquals(false, tst.either24(Arr.integer(4,4,1,2,2)));
	}
	
	
	@Test
	public void isEverywhere(){
		assertEquals(true, tst.isEverywhere(Arr.integer(1,2,1,3), 1));
		assertEquals(true, tst.isEverywhere(Arr.integer(1,2,1,3), 1));
		assertEquals(false, tst.isEverywhere(Arr.integer(1,2,1,3), 2));
		assertEquals(false, tst.isEverywhere(Arr.integer(1,2,1,3,4), 1));
	}
	
	
	@Test
	public void no14(){
		assertEquals(true, tst.no14(Arr.integer(1,2,3)));
		assertEquals(false, tst.no14(Arr.integer(1,2,3,4)));
		assertEquals(true, tst.no14(Arr.integer(2,3,4)));
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
