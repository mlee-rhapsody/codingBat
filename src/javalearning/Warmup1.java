package javalearning;

public class Warmup1 {

	public static int diff21(int n){
		
		int diff = Math.abs(n-21);
		
		if(n>21)
			return diff*2;
		
		return diff;
	}
	
	public static boolean makes10(int a, int b){
		int sum = a + b;
		if(a==10 || b==10 || sum ==10)
			return true;
		
		return false;
	}
	
	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile){
		if(aSmile && bSmile)
			return true;
		
		if(!aSmile && !bSmile)
			return true;
		
		return false;
	}
	
	public static boolean nearHundred(int n){
		return ((Math.abs(100-n)<=10) || (Math.abs(200-n)<=10));
	}
	
	public static String notString(String str){
		if(str.startsWith("not"))
			return str;
		
		return "not "+str;
	}
	
	public static boolean parrotTrouble(boolean talking, int hour){
		if(talking && (hour<7 || hour>20))
			return true;
		
		return false;
	}
	
	public static boolean posNeg(int a, int b, boolean bool){
		if(bool==true){
			if(a<0 && b<0)
				return true;
		}else{
			if((a*b)<0)
				return true;
		}
		
		return false;
	}
	
	public static boolean sleepIn(boolean weekday, boolean vacation){
		
		if(vacation)
			return true;
		
		if(!weekday)
			return true;
		
		return false;
	}
	
	public static int sumDouble(int num1, int num2){
		if(num1 == num2){
			return 2*(num1 + num2);
		}else{
			return num1 + num2;
		}
	}
	
	public static String missingChar(String str, int n){
		char[] charArray = str.toCharArray();
		
		String tmp="";
		for(int i=0; i<charArray.length; i++){
			if(i!=n){
				tmp = tmp + charArray[i];
			}
		}
		
		return tmp;
	}
	
	public static String frontBack(String str){
		
		if(str.length()==1 || str.isEmpty())
			return str;
		
		char front = str.charAt(0);
		char back = str.charAt(str.length()-1);
		String substring = str.substring(1, str.length()-1);
		String string = back+substring+front;
		
		return string;
	}
	
	public static String front3(String str){
		if(str.length() < 3)
			return str+str+str;
		
		String sub = str.substring(0, 3);
		
		return sub+sub+sub;
	}
	
	public static String backAround(String str){
		if(str.isEmpty())
			return "";
		
		String lastChar = str.substring(str.length()-1);
		return lastChar + str + lastChar;
	}
	
}
