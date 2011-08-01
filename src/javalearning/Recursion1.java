package javalearning;

public class Recursion1 {
	public final static Recursion1 INSTANCE = new Recursion1();

	private Recursion1() {
	}
	
	public int countPairs(String str){
		if(str.length()==1 || str.isEmpty())
			return 0;
		
		String head = str.charAt(0)+ "";
		String body = str.substring(1);
		
		int num = 0;
		if(body.length()>1){
			String pair = body.charAt(1)+"";
			if(head.equals(pair)){
				num = 1;
			}
		}
		
		return num + countPairs(body);
	}
	
	
	
	public String endX(String str){
		
		if(str.length()==1 || str.isEmpty())
			return str;
		
		String head = str.charAt(0)+"";
		String body = str.substring(1);
		
		if(head.equals("x")){
			return endX(body)+head;
		}else{
			return head + endX(body);
		}
	}
	
	
	public String pairStar(String str){
		
		if(str.length()==1 || str.isEmpty())
			return str;
		
		String head = str.charAt(0)+"";
		String body = str.substring(1);

		String next = "";
		if(head.equals(body.substring(0, 1))){
			next = head + "*";
		}else{
			next = head;
		}
		return next + pairStar(body);
	}
	
	
	public String allStar(String str){
		if(str.length()==1 || str.isEmpty())
			return str;
		
		String head = str.charAt(0)+"*";
		String body = str.substring(1);
		
		return head + allStar(body);
	}
	
	public boolean array220(int[] nums, int index){
		
		if(index == nums.length)
			return false;
		
		if(index!=0){
			int prevNumber = nums[index-1];
			int currentNumber = nums[index];
			if(currentNumber == prevNumber*10)
				return true;
		}
		return array220(nums, ++index);
	}
	
	
	public int array11(int[] nums, int index){
		
		if(index == nums.length)
			return 0;
		int add = 0;
		if(nums[index++]==11){
			add = 1;
		}else{
			add = 0;
		}
		
		return add + array11(nums, index);
	}
	
	public boolean array6(int[] nums, int index){
		if(index==nums.length)
			return false;
		
		if(nums[index]==6)
			return true;
		
		return array6(nums, ++index);
	}
	
	public String noX(String str){
		
		if(str.contains("x")==false)
			return str;
		
		int xIndex = str.indexOf("x");
		String next = "";
		if(xIndex == 0){
			String right = str.substring(xIndex+"x".length());
			next = right;
		}else{
			String left = str.substring(0, xIndex);
			String right = str.substring(xIndex+"x".length());
			next = left + right;
		}
		
		return noX(next);
	}
	
	public String changePi(String str){
		
		if(str.contains("pi") == false)
			return str;
		
		int piIndex = str.indexOf("pi");
		String next = "";
		
		if(piIndex == 0){
			String rightSide = str.substring(piIndex+"pi".length());
			next = "3.14" + rightSide;
		}else{
			String leftSide = str.substring(0, piIndex);
			String rightSide = str.substring(piIndex+"pi".length());
			next = leftSide + "3.14"+rightSide;
		}

		return changePi(next);
	}
	
	
	public String changeXY(String str){
		
		boolean containsX = str.contains("x");
		if(containsX == false)
			return str;
		
		int xIndex = str.indexOf("x");
		char[] charArray = str.toCharArray();
		charArray[xIndex] ='y';
		
		return changeXY(new String(charArray));
	}
	
	public int countHi(String str){
		
		boolean contains = str.contains("hi");
		
		if(contains == false)
			return 0;
		
		int hiIndex = str.indexOf("hi");
		String next =str.substring(hiIndex+"hi".length());
		
		return 1 + countHi(next);
	}
	
	public int countX(String str){
		if(str.isEmpty())
			return 0;
		
		String substring = str.substring(1);
		String curentChar = str.substring(0, 1);
		
		int num;
		if(curentChar.equals("x"))
			num = 1;
		else
			num = 0;
		
		
		return num + countX(substring);
	}
	
	
	public int powerN(int base, int n){
		if(n==1)
			return base;
		
		return base*powerN(base, n-1);
	}
	
	public int count8(int n){
		if(n==0)
			return 0;
		
		int digit = n%10;
		int left = n/10;
		
		int num=0;
		int check = left %10;
		
		
		if(digit==8 && check==8){
			num = 2;
		}else
			num =1;
		
		
		if(digit !=8)
			num = 0;
		
		
		return num + count8(left);
		
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
