package javalearning;

public class Logic2 {
	final static Logic2 INSTANCE = new Logic2();

	private Logic2() {
	}
	
	public int roundSum(int a, int b, int c){
		
		return 0;
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
