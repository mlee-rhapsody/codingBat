package javalearning;

public class String2 {
	
	public static final String2 INSTANCE = new String2();
	
	private String2() {
	}
	
	public static void main(String[] args) {
		String2 tst = String2.INSTANCE;
		
		print(tst.countCode("cozexxcope"));
	}
	
	@SuppressWarnings("unused")
	private static void print(boolean catDog) {
		System.out.println(catDog);
		
	}

	private static void print(int countHi) {
		System.out.println(countHi);
	}
	//////////////////////////
	
	public int countCode(String str){
		
		int codeCount = 0;
		
		for(int i=0; i<str.length()-3; i++){
			String substring = str.substring(i, i+4);
			System.out.printf("%2d %s%n", i, substring);
			if(substring.startsWith("co")&&substring.endsWith("e") )
				codeCount++;
		}
		
		
		return codeCount;
	}
	
	public boolean catDog(String str){
		
		int dogCount = 0;
		int catCount = 0;
		for(int i=0; i<str.length()-2; i++){
			String substring = str.substring(i, i+3);
			if(substring.equals("dog"))
				dogCount++;
			if(substring.equals("cat"))
				catCount++;
		}
		
		return dogCount == catCount;
	}

	
	
	public int countHi(String str){
		int hiCount = 0;
		for(int i=0; i<str.length()-1; i++){
			String substring = str.substring(i, i+2);
			if(substring.equals("hi"))
				hiCount++;
		}
		return hiCount;
	}
	
	
	public String doubleChar(String str){
		String tmp = "";
		
		for(int i=0; i<str.length(); i++){
			 //String item = Character.toString(str.charAt(i));
			 tmp += ""+str.charAt(i)+str.charAt(i);
		}
		
		return tmp;
	}
	
	
}
