package javalearning;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Recursion1Tests {
	Recursion1 test;
	@Before
	public void setUp(){
		test = Recursion1.INSTANCE;
	}
	
	@Test
	public void array220(){
		assertEquals(true, test.array220(Arr.input(1, 2, 20), 0));
		assertEquals(true, test.array220(Arr.input(3, 30), 0));
		assertEquals(false, test.array220(Arr.input(3), 0));
		
	}
	
	@Test
	public void array11(){
		assertEquals(0, test.array11(Arr.input(1, 1), 0));
		assertEquals(1, test.array11(Arr.input(1, 2, 11), 0));
		assertEquals(2, test.array11(Arr.input(11, 11), 0));
		assertEquals(2, test.array11(Arr.input(5,6,7,8,9,11, 11), 0));
	}
	
	@Test
	public void array6(){
		assertEquals(true, test.array6(Arr.input(1, 6, 4), 0));
		assertEquals(true, test.array6(Arr.input(6), 0));
		assertEquals(false, test.array6(Arr.input(1), 0));
		assertEquals(true, test.array6(Arr.input(1,2,3,4,5,6), 0));
		assertEquals(true, test.array6(Arr.input(1,2,3,4,5,6), 0));
	}
	
	@Test
	public void noX(){
		assertEquals("", test.noX(""));
		assertEquals("", test.noX("x"));
		
		assertEquals("a", test.noX("ax"));
		
		assertEquals("ae", test.noX("axe"));
		assertEquals("", test.noX("xxxxxxx"));
	}
	
	@Test
	public void changePi(){
		assertEquals("", test.changePi(""));
		assertEquals("3.14ety", test.changePi("piety"));
		assertEquals("x3.14x", test.changePi("xpix"));
		assertEquals("3.14p", test.changePi("pip"));
	}
	
	@Test
	public void changeXY(){
		assertEquals("codey", test.changeXY("codex"));
		assertEquals("yyhiyy", test.changeXY("xxhixx"));
		assertEquals("yhiyhiy", test.changeXY("xhixhix"));
	}
	
	@Test
	public void countHi(){
		assertEquals(0, test.countHi(""));
		assertEquals(1, test.countHi("hi"));
		
		assertEquals(2, test.countHi("hiahi"));
	}
	
	@Test
	public void countX(){
		assertEquals(0, test.countX("hi"));
		assertEquals(1, test.countX("x"));
		assertEquals(2, test.countX("xx"));
		
		
		assertEquals(3, test.countX("xhixhix"));
	}
	
	
	@Test
	public void powerN(){
		assertEquals(3, test.powerN(3, 1));
		assertEquals(9, test.powerN(3, 2));
		assertEquals(27, test.powerN(3, 3));
	}
	
	
	@Test
	public void count8(){
		assertEquals(1, test.count8(8));
		assertEquals(2, test.count8(818));
		assertEquals(4, test.count8(8818));
		
	}
	
	@Test
	public void count7(){
		assertEquals(0, test.count7(123));
		assertEquals(1, test.count7(7));
		assertEquals(2, test.count7(717));
	}
	
	@Test
	public void sumDigits(){
		assertEquals(3, test.sumDigits(12));
		assertEquals(13, test.sumDigits(49));
		assertEquals(9, test.sumDigits(126));
	}
	
	
	@Test
	public void triangle(){
		assertEquals(0, test.triangle(0));
		assertEquals(1, test.triangle(1));
		assertEquals(3, test.triangle(2));
	}
	
	@Test
	public void bunnyEars2(){
		assertEquals(0, test.bunnyEars2(0));
		assertEquals(2, test.bunnyEars2(1));
		assertEquals(5, test.bunnyEars2(2));
	}
	
	@Test
	public void fibonacci(){
		assertEquals(0, test.fibonacci(0));
		assertEquals(1, test.fibonacci(1));
		assertEquals(1, test.fibonacci(2));
		assertEquals(2, test.fibonacci(3));
		assertEquals(3, test.fibonacci(4));
		assertEquals(5, test.fibonacci(5));
	}
	
	
	@Test
	public void bunnyEars(){
		assertEquals(0, test.bunnyEars(0));
		assertEquals(2, test.bunnyEars(1));
		assertEquals(4, test.bunnyEars(2));
		
	}
	
	
	@Test
	public void factorial() {
		assertEquals(1, test.factorial(1));
		assertEquals(2, test.factorial(2));
		assertEquals(6, test.factorial(3));
	}
	
	static class Arr{
		public static int[] input(int... number){
			return number;
		}
		
		
	}

}


