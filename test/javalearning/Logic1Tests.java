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
	public void sumLimit(){
		assertEquals(5, test.sumLimit(2, 3));
		assertEquals(8, test.sumLimit(8, 3));
		assertEquals(9, test.sumLimit(8, 1));
	}
	
	@Test
	public void shareDigit(){
		assertEquals(true, test.shareDigit(12, 23));
		assertEquals(false, test.shareDigit(12, 34));
		assertEquals(true, test.shareDigit(12, 41));
		assertEquals(true, test.shareDigit(21, 41));
	}
	
	@Test
	public void blueTicket(){
		assertEquals(10, test.blueTicket(9, 1, 0));
		assertEquals(0, test.blueTicket(9, 2, 0));
		assertEquals(10, test.blueTicket(6, 1, 4));
	}
	
	@Test
	public void greenTicket(){
		assertEquals(0, test.greenTicket(1, 2, 3));
		assertEquals(20, test.greenTicket(2, 2, 2));
		assertEquals(10, test.greenTicket(1, 1, 2));
	}
	
	@Test
	public void redTicket(){
		assertEquals(10, test.redTicket(2, 2, 2));
		assertEquals(0, test.redTicket(2, 2, 1));
		assertEquals(5, test.redTicket(0, 0, 0));
	}
	
	@Test
	public void maxMod5(){
		assertEquals(3, test.maxMod5(2, 3));
		assertEquals(6, test.maxMod5(6, 2));
		assertEquals(3, test.maxMod5(3, 2));
	}
	
	@Test
	public void withoutDoubles(){
		assertEquals(5, test.withoutDouble(2, 3, true));
		assertEquals(7, test.withoutDouble(3, 3, true));
		assertEquals(6, test.withoutDouble(3, 3, false));
		assertEquals(10, test.withoutDouble(5, 5, false));
		assertEquals(11, test.withoutDouble(5, 5, true));
	}
	
	@Test
	public void lessBy10(){
		assertEquals(false, test.lessBy10(10, 7, 1));
		assertEquals(true, test.lessBy10(1, 7, 11));
		assertEquals(false, test.lessBy10(1, 7, 10));
		assertEquals(true, test.lessBy10(11, 1, 7));
	}
	
	@Test
	public void lastDigit(){
		assertEquals(true, test.lastDigit(23, 19, 13));
		assertEquals(false, test.lastDigit(23, 19, 12));
		assertEquals(true, test.lastDigit(23, 19, 3));
	}
	
	@Test
	public void inOrderEqual(){
		assertEquals(true, test.inOrderEqual(2, 5, 11, false));
		assertEquals(true, test.inOrderEqual(5, 6, 7, false));
		assertEquals(true, test.inOrderEqual(5, 5, 5, true));
		assertEquals(false, test.inOrderEqual(5, 5, 5, false));
		assertEquals(false, test.inOrderEqual(5, 4, 3, false));
	}
	
	@Test
	public void inOrder(){
		assertEquals(true, test.inOrder(1, 2, 4, false));
		assertEquals(false, test.inOrder(1, 2, 1, false));
		assertEquals(true, test.inOrder(1, 1, 2, true));
	}
	
	
	@Test
	public void twoAsOne(){
		assertEquals(true, test.twoAsOne(0, 0, 0));
		assertEquals(true, test.twoAsOne(1, 2, 3));
		assertEquals(true, test.twoAsOne(3, 1, 2));
		assertEquals(false, test.twoAsOne(3, 2, 2));
	}
	
	@Test
	public void teaParty(){
		assertEquals(1, test.teaParty(6, 8));
		assertEquals(0, test.teaParty(3, 8));
		assertEquals(2, test.teaParty(20, 6));
		assertEquals(2, test.teaParty(6, 20));
	}
	
	@Test
	public void answerCell(){
		assertEquals(false, test.answerCell(true, false, false));
		assertEquals(true, test.answerCell(false, false, false));
		assertEquals(false, test.answerCell(false, false, true));
		assertEquals(false, test.answerCell(false, false, true));
		assertEquals(false, test.answerCell(true, false, true));
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
