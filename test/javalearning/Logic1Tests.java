package javalearning;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Logic1Tests {
	Logic1 test;
	@Before
	public void setUp() throws Exception {
		test = Logic1.INSTANCE;
	}
	
	@Test
	public void teenSum(){
		assertEquals(7, test.teenSum(3, 4));
		assertEquals(19, test.teenSum(10, 13));
		assertEquals(19, test.teenSum(13, 2));
	}
	
	@Test
	public void nearTen(){
		assertEquals(true, test.nearTen(12));
		assertEquals(false, test.nearTen(17));
		assertEquals(true, test.nearTen(19));
	}
	
	@Test
	public void in1To10(){
		assertEquals(true, test.in1To10(5, false));
		assertEquals(false, test.in1To10(11, false));
		assertEquals(true, test.in1To10(11, true));
	}
	
	@Test
	public void love6(){
		assertEquals(true, test.love6(6, 4));
		assertEquals(false, test.love6(5, 4));
		assertEquals(true, test.love6(8, 2));
	}
	
	@Test
	public void alarmClock(){
		assertEquals("7:00", test.alarmClock(1, false));
		assertEquals("7:00", test.alarmClock(5, false));
		assertEquals("10:00", test.alarmClock(5, true));
	}

	@Test
	public void sortaSum(){
		assertEquals(7, test.sortaSum(3, 4));
		assertEquals(9, test.sortaSum(5, 4));
		assertEquals(20, test.sortaSum(5, 5));
		assertEquals(20, test.sortaSum(0, 19));
		assertEquals(20, test.sortaSum(0, 20));
		assertEquals(0, test.sortaSum(0, 0));
	}
	
	@Test
	public void caughtSpeeding(){
		assertEquals(0, test.caughtSpeeding(60, false));
		assertEquals(1, test.caughtSpeeding(61, false));
		assertEquals(0, test.caughtSpeeding(61, true));
		assertEquals(2, test.caughtSpeeding(81, false));
		assertEquals(1, test.caughtSpeeding(81, true));
		
		assertEquals(2, test.caughtSpeeding(100, true));
		assertEquals(2, test.caughtSpeeding(100, false));
	}
	
	@Test
	public void squrrelPlay(){
		assertEquals(true, test.squirrelPlay(70, false));
		assertEquals(false, test.squirrelPlay(95, false));
		assertEquals(true, test.squirrelPlay(95, true));
	}
	
	@Test
	public void dateFashion(){
		assertEquals(2, test.dateFashion(5, 10));
		assertEquals(0, test.dateFashion(5, 2));
		assertEquals(1, test.dateFashion(5, 5));
	}
	
	@Test
	public void cigarParty() {
		assertEquals(false, test.cigarParty(0, true));
		assertEquals(true, test.cigarParty(70, true));
		assertEquals(true, test.cigarParty(50, false));
		assertEquals(false, test.cigarParty(30, false));
		assertEquals(false, test.cigarParty(61, false));
	}

}
