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
}
