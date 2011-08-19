package javalearning;

import static org.junit.Assert.assertEquals;
import utility.Arr;

import org.junit.Before;
import org.junit.Test;

public class AP1Tests {
	AP1 tst;
	
	@Before
	public void setUp() throws Exception {
		tst = AP1.INSTANCE;
	}
	
	@Test
	public void scoresClump(){
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
