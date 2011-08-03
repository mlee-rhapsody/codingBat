package javalearning;

public class Recursion1 {
	public final static Recursion1 INSTANCE = new Recursion1();

	private Recursion1() {
	}
	
	public int strDist(String str, String sub){
		if(str.isEmpty())
			return 0;
		
		if(str.equals(sub))
			return sub.length();
		
		if(str.startsWith(sub) && str.endsWith(sub))
			return str.length();
		
		int leftIndex = str.indexOf(sub);
		if(leftIndex>0)
			return strDist(str.substring(1), sub);
		
		return strDist(str.substring(0, str.length()-1), sub);
	}
	
	public boolean strCopies(String str, String sub, int n){
		if(str.isEmpty())
			return true;
		
		if(str.contains(sub)==false && n==0)
			return true;
		
		if(str.contains(sub)==false)
			return false;
		
		if(str.substring(0, sub.length()).equals(sub)){
			String next = str.substring(1);
			return strCopies(next, sub, --n);	
			
		}else
			return strCopies(str.substring(1), sub, n);
	}
	
	public int strCount(String str, String sub){
		
		if(str.contains(sub)==false)
			return 0;
		
		if(str.contains(sub)){
			String next = str.replaceFirst(sub, "");
			return 1 + strCount(next, sub);
		}
		
		return strCount(str, sub);
	}
	
	
	public boolean nestParen(String str){
		if(str.isEmpty())
			return true;
		
		if(str.equals("()"))
			return true;
		
		String leftChar=str.substring(0,1);
		String rightChar = str.substring(str.length()-1);
		if(leftChar.equals("(") && rightChar.equals(")")){
			
			int leftParen = str.indexOf("(");
			int rightParen = str.lastIndexOf(")")+1;
			
			String next = str.substring(leftParen+1, rightParen-1);
			
			return nestParen(next);
		}else
			return false;
	}
	
	
	public String parenBit(String str){
		if(str.isEmpty())
			return "";
		
		String leftChar=str.substring(0,1);
		String rightChar = str.substring(str.length()-1);
		
		if(leftChar.equals("(") && rightChar.equals(")"))
			return str;
		
		int leftParen = str.indexOf("(");
		int rightParen = str.lastIndexOf(")")+1;
		
		String next = str.substring(leftParen, rightParen);
		
		return parenBit(next);
	}
	
	public int countHi2(String str){
		if(!str.contains("xhi") && !str.contains("hi"))
			return 0;
		
		if(str.contains("xhi")){
			String next = str.replaceFirst("xhi", "");
			return 0 + countHi2(next);
		}
		
		String next = str.replaceFirst("hi", "");
		
		return 1 + countHi2(next);
	}
	
	public String stringClean(String str){
		if(str.length()==1 || str.isEmpty())
			return str;
		
		String head = str.substring(0, 1);
		String body = str.substring(1);
		
		if(head.equals(body.substring(0, 1))){
			return stringClean(body);
		}else{
			return head + stringClean(body);
		}
	}

	public int count11(String str){
		if(!str.contains("11"))
			return 0;
		
		String next = str.replaceFirst("11", "");
		
		return 1 + count11(next);
	}
	
	public int countAbc(String str) {

		int sum = 0;
		if(!str.contains("abc") && !str.contains("aba"))
			return 0;
		
		
		if (str.contains("abc"))
			sum += 1;

		if (str.contains("aba"))
			sum += 1;

		String replace = str.replaceFirst("abc", "");
		String replace2 = replace.replaceFirst("aba", "");
		
		return sum + countAbc(replace2);
	}

	public int countPairs(String str) {
		if (str.length() == 1 || str.isEmpty())
			return 0;

		String head = str.charAt(0) + "";
		String body = str.substring(1);

		int num = 0;
		if (body.length() > 1) {
			String pair = body.charAt(1) + "";
			if (head.equals(pair)) {
				num = 1;
			}
		}

		return num + countPairs(body);
	}

	public String endX(String str) {

		if (str.length() == 1 || str.isEmpty())
			return str;

		String head = str.charAt(0) + "";
		String body = str.substring(1);

		if (head.equals("x")) {
			return endX(body) + head;
		} else {
			return head + endX(body);
		}
	}

	public String pairStar(String str) {

		if (str.length() == 1 || str.isEmpty())
			return str;

		String head = str.charAt(0) + "";
		String body = str.substring(1);

		String next = "";
		if (head.equals(body.substring(0, 1))) {
			next = head + "*";
		} else {
			next = head;
		}
		return next + pairStar(body);
	}

	public String allStar(String str) {
		if (str.length() == 1 || str.isEmpty())
			return str;

		String head = str.charAt(0) + "*";
		String body = str.substring(1);

		return head + allStar(body);
	}

	public boolean array220(int[] nums, int index) {

		if (index == nums.length)
			return false;

		if (index != 0) {
			int prevNumber = nums[index - 1];
			int currentNumber = nums[index];
			if (currentNumber == prevNumber * 10)
				return true;
		}
		return array220(nums, ++index);
	}

	public int array11(int[] nums, int index) {

		if (index == nums.length)
			return 0;
		int add = 0;
		if (nums[index++] == 11) {
			add = 1;
		} else {
			add = 0;
		}

		return add + array11(nums, index);
	}

	public boolean array6(int[] nums, int index) {
		if (index == nums.length)
			return false;

		if (nums[index] == 6)
			return true;

		return array6(nums, ++index);
	}

	public String noX(String str) {

		if (str.contains("x") == false)
			return str;

		int xIndex = str.indexOf("x");
		String next = "";
		if (xIndex == 0) {
			String right = str.substring(xIndex + "x".length());
			next = right;
		} else {
			String left = str.substring(0, xIndex);
			String right = str.substring(xIndex + "x".length());
			next = left + right;
		}

		return noX(next);
	}

	public String changePi(String str) {

		if (str.contains("pi") == false)
			return str;

		int piIndex = str.indexOf("pi");
		String next = "";

		if (piIndex == 0) {
			String rightSide = str.substring(piIndex + "pi".length());
			next = "3.14" + rightSide;
		} else {
			String leftSide = str.substring(0, piIndex);
			String rightSide = str.substring(piIndex + "pi".length());
			next = leftSide + "3.14" + rightSide;
		}

		return changePi(next);
	}

	public String changeXY(String str) {

		boolean containsX = str.contains("x");
		if (containsX == false)
			return str;

		int xIndex = str.indexOf("x");
		char[] charArray = str.toCharArray();
		charArray[xIndex] = 'y';

		return changeXY(new String(charArray));
	}

	public int countHi(String str) {

		boolean contains = str.contains("hi");

		if (contains == false)
			return 0;

		int hiIndex = str.indexOf("hi");
		String next = str.substring(hiIndex + "hi".length());

		return 1 + countHi(next);
	}

	public int countX(String str) {
		if (str.isEmpty())
			return 0;

		String substring = str.substring(1);
		String curentChar = str.substring(0, 1);

		int num;
		if (curentChar.equals("x"))
			num = 1;
		else
			num = 0;

		return num + countX(substring);
	}

	public int powerN(int base, int n) {
		if (n == 1)
			return base;

		return base * powerN(base, n - 1);
	}

	public int count8(int n) {
		if (n == 0)
			return 0;

		int digit = n % 10;
		int left = n / 10;

		int num = 0;
		int check = left % 10;

		if (digit == 8 && check == 8) {
			num = 2;
		} else
			num = 1;

		if (digit != 8)
			num = 0;

		return num + count8(left);

	}

	public int count7(int n) {
		if (n == 0)
			return 0;

		int digit = n % 10;
		int left = n / 10;

		int num = (digit == 7) ? 1 : 0;
		return num + count7(left);
	}

	public int sumDigits(int n) {

		if (n == 0)
			return 0;

		int digit = n % 10;
		int left = n / 10;

		return digit + sumDigits(left);
	}

	public int triangle(int rows) {
		if (rows == 0)
			return 0;

		return triangle(rows - 1) + rows;

	}

	public int bunnyEars2(int bunnies) {

		if (bunnies == 0)
			return 0;

		// Even bunnies
		if (bunnies % 2 == 0) {
			return 3 + bunnyEars2(bunnies - 1);
		}
		return 2 + bunnyEars2(bunnies - 1);
	}

	public int fibonacci(int n) {

		if (n == 0)
			return 0;

		if (n == 1)
			return 1;

		return fibonacci(n - 2) + fibonacci(n - 1);
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
