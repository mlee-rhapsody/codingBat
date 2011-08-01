package javalearning;

public class Recursion1 {
	public final static Recursion1 INSTANCE = new Recursion1();

	private Recursion1() {
	}

	public int count8(int n){
		if(n==0)
			return 0;
		
		int digit = n%10;
		int left = n/10;
		
		
		
	}
	
	
	
	public int count7(int n){
		if(n==0)
			return 0;
		
		int digit = n%10;
		int left = n/10;
		
		int num = (digit==7)? 1 : 0;
		return  num + count7(left);
	}
	
	
	public int sumDigits(int n){
		
		if(n==0)
			return 0;
		
		int digit = n%10;
		int left = n/10;
		
		return digit + sumDigits(left);
	}
	
	public int triangle(int rows){
		if(rows == 0)
			return 0;
		
		return triangle(rows-1)+rows;
		
	}
	
	public int bunnyEars2(int bunnies){
		
		if(bunnies == 0)
			return 0;
		
		//Even bunnies
		if(bunnies%2==0){
			return 3+bunnyEars2(bunnies-1);
		}
		return 2 + bunnyEars2(bunnies-1);
	}
	
	public int fibonacci(int n){
		
		if(n==0)
			return 0;
		
		if(n==1)
			return 1;
		
		return fibonacci(n-2) + fibonacci(n-1);
	}
	
	public int bunnyEars(int bunnies) {
		if (bunnies == 0)
			return 0;
		
			return 2 + bunnyEars(bunnies - 1);
	}

	public int factorial(int n) {
		if (n == 1)
			return 1;

		return n * factorial(n - 1);
	}
}
