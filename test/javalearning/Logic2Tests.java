package javalearning;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Logic2Tests {
	
	Logic2 tst;
	
	@Before
	public void setUp(){
		tst = Logic2.INSTANCE;
	}
	
	@Test
	public void closeFar(){
		assertEquals(true, tst.closeFar(1, 2, 10));
		assertEquals(true, tst.closeFar(1, 2, 10));
		assertEquals(true, tst.closeFar(4,1,3));
		assertEquals(false, tst.closeFar(4,5,3));
		assertEquals(false, tst.closeFar(4,3,5));
		assertEquals(true, tst.closeFar(-1,10,0));
		assertEquals(true, tst.closeFar(0,-1,10));
		assertEquals(true, tst.closeFar(10,10,8));
		assertEquals(false, tst.closeFar(10,8,9));
		assertEquals(false, tst.closeFar(8,9,10));
		assertEquals(false, tst.closeFar(8,9,7));
		assertEquals(true, tst.closeFar(8,6,9));
		
		
		assertEquals(false, tst.closeFar(1, 2, 3));
		assertEquals(true, tst.closeFar(8,6,9));
	}
	
	@Test
	public void roundSum(){
		assertEquals(60, tst.roundSum(16, 17, 18));
		assertEquals(30, tst.roundSum(12, 13, 14));
		assertEquals(10, tst.roundSum(6, 4, 4));
	}
	
	@Test
	public void round10(){
		assertEquals(10, tst.round10(5));
		assertEquals(230, tst.round10(225));
		assertEquals(20, tst.round10(16));
		assertEquals(0, tst.round10(0));
		
	}
	
	@Test
	public void noTeenSum(){
		assertEquals(6, tst.noTeenSum(1, 2, 3));
		assertEquals(3, tst.noTeenSum(2, 13, 1));
		assertEquals(3, tst.noTeenSum(2, 1, 14));
	}
	
	@Test
	public void luckySum(){
		assertEquals(6, tst.luckySum(1, 2, 3));
		assertEquals(3, tst.luckySum(1, 2, 13));
		assertEquals(1, tst.luckySum(1, 13, 3));
		assertEquals(0, tst.luckySum(13, 13, 3));
	}
	
	@Test
	public void loneSum(){
		assertEquals(6, tst.loneSum(1, 2, 3));
		assertEquals(2, tst.loneSum(3, 2, 3));
		assertEquals(0, tst.loneSum(3, 3, 3));
	}
	
	@Test
	public void makeBricks(){
		assertEquals(true, tst.makeBricks(3, 1, 8));
		assertEquals(false, tst.makeBricks(3, 1, 9));
		assertEquals(true, tst.makeBricks(3, 2, 10));
		assertEquals(true, tst.makeBricks(1000000, 1000, 1000100));
		assertEquals(true, tst.makeBricks(3,2,8));
		assertEquals(true, tst.makeBricks(2,5,25));
		assertEquals(false, tst.makeBricks(2,1000000,100003));
		assertEquals(false, tst.makeBricks(7,1,13));
		assertEquals(false, tst.makeBricks(40,1,46));
		
	}
}
