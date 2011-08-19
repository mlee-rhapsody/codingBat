package javalearning;

public class Warmup2 {
	
	public static boolean has271(int[] nums){
		if(nums.length<3)
			return false;
		
		int a, b, c;
		
		for(int i=0; i<nums.length-2; i++){
			a = nums[i];
			b = nums[i+1];
			c = nums[i+2] - (a-1);
			
			if(a == (b-5) && Math.abs(c)<=2 ){
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean noTriples(int[] nums){
		if(nums.length<3)
			return true;
		
		boolean sentinal=true;
		
		
		for(int i=0; i <= nums.length-3; i++){
			if(nums[i]==nums[i+1] && nums[i+1]==nums[i+2] )
				sentinal = false;
		}
		
		return sentinal;
	}
	
	public static int array667(int[] nums){

		int count = 0;
		
		if(nums.length<=1)
			return 0;
		
		for(int i=0; i<nums.length-1; i++){
			if(nums[i]==6 && (nums[i+1]==6 || nums[i+1]==7))
				count++;
		}
		
		return count;
	}
	
	public static String stringYak(String str){

		if(str.isEmpty())
			return "";
				
		if(str.length()<3)
			return str;
		
		String buf = "";
		String[] split = str.split("yak");
		for(int i=0; i<split.length; i++){
			buf += split[i];
		}
		
		return buf;
	}
	
	public static String altPairs(String str){
		int count = 0;
		String buf = "";
		
		if(str.isEmpty())
			return "";
		
		do{
			if(count >= str.length()) break;
			buf += str.charAt(count++);
			
			if(count >= str.length()) break;
			buf += str.charAt(count++);
			
			count++;
			count++;
		}while(true);
		
		return buf;
	}
	
	public static String stringX(String str){
		if(str.isEmpty())
			return "";
		
		if(str.length()<2)
			return str;
		
		StringBuffer sb = new StringBuffer();
		sb.append(str.charAt(0));
		for(int i=1; i< str.length()-1; i++){
			if(str.toLowerCase().charAt(i) != 'x')
				sb.append(str.charAt(i));
		}
		
		sb.append(str.charAt(str.length()-1));
		
		return sb.toString();
	}
	
	public static int stringMatch(String a, String b){
		if(a.isEmpty() || b.isEmpty())
			return 0;
		int shortLength = a.length();
		
		if(b.length() < shortLength)
			shortLength = b.length();
		
		int tokenCount = 0;
		for(int i=0; i< shortLength-1; i++){
			if(a.charAt(i) == b.charAt(i) && a.charAt(i+1)==b.charAt(i+1)  )
				tokenCount++;
		}
		
		return tokenCount;
	}
	
	public static boolean array123(int[] nums){
		if(nums.length<3)
			return false;
		
		int i =0;
		do{
			boolean test=true;
			if(nums[i]!=1) test = false;
			if(nums[i+1]!=2) test = false;
			if(nums[i+2]!=3) test = false;
			
			if(test == true)
				return true;
			

		}while(i++<nums.length-3);
		
		return false;
	}
	public static boolean arrayFront9(int[] nums){
		int maxCount=nums.length;
		if(nums.length>4)
			maxCount=4;
		
		for(int i=0; i<maxCount; i++){
			if(nums[i]==9)
				return true;
		}
		
		return false;
	}
	public static int arrayCount9(int[] nums){
		int count=0;
		for(int i=0; i<nums.length; i++){
			if(nums[i]==9)
				count++;
		}
		return count;
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
	
	public static String stringTimes(String str, int n){
		
		String base = "";
		for(int i=0; i<n; i++){
			base += str;
		}
		
		return base;
	}
}
