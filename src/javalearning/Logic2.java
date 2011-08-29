package javalearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Logic2 {
	final static Logic2 INSTANCE = new Logic2();

	private Logic2() {
	}
	
	public int makeChocolate(int small, int big, int goal){
		
		if((small + big*5) < goal)
			return -1;
		
		
		int bigTarget = goal / 5;
		
		if(bigTarget>big)
			bigTarget = big;
		
		int smallTarget = goal - 5*bigTarget;
		if(smallTarget>small || smallTarget<0)
			return -1;
		
		int materialBalance = goal - 5*bigTarget - smallTarget;
		if(materialBalance != 0)
			return -1;
		
		return smallTarget;
	}
	
	public boolean evenlySpaced(int a, int b, int c){
		
		if(a==b && b==c)
			return true;
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(a);
		list.add(b);
		list.add(c);
		Collections.sort(list);
		
		int deltaA = list.get(1) - list.get(0);
		int deltaB = list.get(2) - list.get(1);
		if(deltaA == deltaB)
			return true;
		
		return false;
	}
	
	public int blackjack(int a, int b){
		if(a>21 && b>21)
			return 0;
		if(a>21)
			a=0;
		
		if(b>21)
			b=0;
		
		if(a>b)
			return a;
		
		return b;
	}

	public boolean closeFar(int a, int b, int c){
	
		boolean isCloseAB = isClose(a,b);
		boolean isFarABC = isFar(a,b,c);
		if(isCloseAB&&isFarABC)
			 return true;
		 
		boolean isCloseAC = isClose(a,c);
		boolean isFarACB = isFar(a,c,b);
		if(isCloseAC&&isFarACB)
			 return true;
		 
		 return false;
		 
	}
	
	public boolean isFar(int a, int other, int close){
		return Math.abs(close - a)>=2 && Math.abs(close - other)>=2; 
	}
	
	public boolean isClose(int num1, int num2){
		return Math.abs(num2 - num1)<=1;
	}
	
	
	public static boolean logicalXOR(boolean x, boolean y) {
	    return ( ( x || y ) && ! ( x && y ) );
	}
	
	public int roundSum(int a, int b, int c){
		return round10(a) + round10(b) + round10(c);
	}
	
	public int round10(int num){
		String digit = Integer.toString(num);
		String lastStrDigit = digit.substring(digit.length()-1);
		int lastDigit = Integer.parseInt(lastStrDigit);
		
		String preStrDigit="0";
		
		if(num>=10)
			preStrDigit = digit.substring(0, digit.length()-1);
		
		int preDigit = Integer.parseInt(preStrDigit+"0");

		if(lastDigit>=5)
			preDigit += 10;
		
		return preDigit;
	}
	
	
	public int noTeenSum(int a, int b, int c){
		return fixTeen(a)+ fixTeen(b)+fixTeen(c);
	}
	
	public int fixTeen(int n){
		if(n==15 || n==16)
			return n;
		
		if(n>=13 && n<=19)
			return 0;
		
		
		return n;
	}
	
	
	public int luckySum(int a, int b, int c){
		if(a==13)
			return 0;
		
		if(b==13)
			return a;
		
		if(c==13)
			return a + b;
		
		return a + b + c;
	}
	
	public int loneSum(int a, int b, int c) {

		int aa = a, bb = b, cc = c;

		if (a == b || b == a) {
			aa = 0;
			bb = 0;
		}

		if (a == c || c == a) {
			aa = 0;
			cc = 0;
		}

		if (b == c || c == b) {
			bb = 0;
			cc = 0;
		}

		return aa + bb + cc;
	}

	//ToDo: reevaluate. recursion may be overkill for this problem
	public boolean makeBricks(int small, int big, int goal) {

		boolean retVal;

		if (goal < 0 || small < 0)
			return false;

		if (goal == 0)
			return true;

		int bigBrick = big * 5;
		if (bigBrick >= 5 && goal >= 5) {

			int leftOver = goal / 5;
			if (leftOver > 2 && (big - leftOver) > 0) {
				big = big - leftOver;
				goal = goal - 5 * leftOver;
				retVal = makeBricks(small, big, goal);
			} else {
				big--;
				goal = goal - 5;
				retVal = makeBricks(small, big, goal);
			}
		} else {

			if (small >= goal) {
				small = small - goal;
				goal = 0;
				retVal = makeBricks(small, big, goal);
			} else {
				return false;
			}

		}

		return retVal;
	}

}
