package javalearning;

public class Warmup2 {
	public static String stringTimes(String str, int n){
		
		String base = "";
		for(int i=0; i<n; i++){
			base += str;
		}
		
		return base;
	}
	
	public static String frontTimes(String str, int n){
		String base = "";
		String tmp = "";
		int length = str.length();
		if(length < 4)
			tmp = str;
		else
			tmp = str.substring(0, 3);
		
		for(int i=0; i<n; i++){
			base += tmp;
		}
			
		return base;
	}

	public static String stringBits(String str) {
		String base = "";
		
		if(str.length()==0)
			return "";
		
		for(int i=0; i<str.length(); i+=2){
			base = base + str.charAt(i);
		}
		return base;
	}
	
	public static String stringSplosion(String str){
		if(str.length()==0)
			return str;
		
		String base = "";
		for(int i=0; i<str.length(); i++){
			base = (str.substring(0, str.length()-i)) + base;
		}
		
		return base;
	}
	
	public static int last2(String str){
		if(str.length()<2)
			return 0;
		
		
		String searchTarget = str.substring(str.length()-2).trim();
		String preSubstring = str.substring(0, str.length()-2);

		if(str.length()==4){
			String preString = str.substring(0, 2);
			if(preString.equals(searchTarget))
				return 2;
		}
		
		int count=0;
		for(int i=0; i<=preSubstring.length()-2; i++){
			String substring = preSubstring.substring(i, i+2);
			if(substring.equals(searchTarget))
				count++;
		}
		
		return count;
	}
	
	public static void main(String[] args){
		System.out.println("Hello world: "+Warmup2.last2("h"));
	}
}
