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
	public void groupSum() {
		assertEquals(true, test.groupSum(0, Arr.integer(2,4,8), 10));
	}

}
