package javalearning;

public class Warmup1 {

	public static String backAround(String str){
		if(str.isEmpty())
			return "";
		
		String lastChar = str.substring(str.length()-1);
		return lastChar + str + lastChar;
	}
	
	public static String delDel(String str){
		int length = str.length();
		if(length<4)
			return str;
		
		String body = "";
		String substring = str.substring(1, 4);
		if(substring.contains("del"))
			body = str.charAt(0)+ str.substring(4);
		else
			body = str;
		
		return body;
	}
	
	public static int diff21(int n){
		
		int diff = Math.abs(n-21);
		
		if(n>21)
			return diff*2;
		
		return diff;
	}
	
	public static String front22(String str){
		String front = "";
		String body = "";
		
		if(str.isEmpty())
			return "";
		
		if(str.length() < 2){
			front = str;
			
			body = front + str + front;
		}else{
			front = str.substring(0, 2);
			body = front + str + front;
		}
		return body;
	}
	
	public static String front3(String str){
		if(str.length() < 3)
			return str+str+str;
		
		String sub = str.substring(0, 3);
		
		return sub+sub+sub;
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
	
	public static boolean hasTeen(int a, int b, int c){
		return (a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19);
	}
	
	public static boolean icyHot(int temp1, int temp2){
		
		if((temp1<0 && temp2 <0) || (temp1>100 && temp2>100))
			return false;
		
		if((temp1>=0 && temp1<=100) || (temp2>=0 && temp2<=100))
			return false;
		
		return true;
	}
	
	public static boolean in1020(int a, int b){
		return (a>=10 && a<=20)||(b>=10 && b<=20);
	}
	
	public static boolean loneTeen(int a, int b){
		boolean teenA = a>=13 && a<=19;
		boolean teenB = b>=13 && b<=19;

		if(teenA == true && teenB == true)
			return false;
		
		return (teenA || teenB);
	}
	
	public static boolean makes10(int a, int b){
		int sum = a + b;
		if(a==10 || b==10 || sum ==10)
			return true;
		
		return false;
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
	
	public static boolean startHi(String str){
		return str.startsWith("hi");
	}
	
	public static int sumDouble(int num1, int num2){
		if(num1 == num2){
			return 2*(num1 + num2);
		}else{
			return num1 + num2;
		}
	}
	
	public static boolean mixStart(String str){
		if(str.length()<3)
			return false;
		
		String substring = str.substring(1, 3);
		return substring.equals("ix");
	}
}
