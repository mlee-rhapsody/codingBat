package javalearning;

import java.util.ArrayList;
import java.util.List;

public class String3 {
	public static final String3 INSTANCE = new String3();
	
	private String3(){
	}
	
	public String notReplace(String str){
		
		if(str.isEmpty() || str.length()<2)
			return str;
		
		if(str.trim().equals("is"))
			return "is not";
		
		String currChar = "";
		String nextChar = "";
		String word = "";
		boolean lastChar = false;
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i< str.length()-1;i++){
			currChar = str.charAt(i)+"";
			nextChar = str.charAt(i+1)+"";
			
			word = currChar + nextChar;
			if(word.equals("is")){
				String isWord = checkSurrounding(i, str, word, currChar, nextChar);
					//System.out.print(isWord);
					sb.append(isWord);
				i++;
				lastChar = false;
			}else{
				//System.out.print(currChar);
				sb.append(currChar);
				lastChar = true;
			}
			
		}
		if(lastChar)
			//System.out.println(nextChar);
			sb.append(nextChar);
		
			
		return sb.toString();
	}
	
	private String checkSurrounding(int i, String str, String word, String currChar, String nextChar) {
		
		// Beginning of string
		if(i==0){
			boolean isThirdCharLetter = Character.isLetter(str.charAt(2));
			if(isThirdCharLetter){
				return "is";
			}else{
				return "is not";
			}
		}
		
		
		// End of string
		int endOfLine = str.length()-2;
		if(endOfLine == i){
			boolean isPrevCharLetter = Character.isLetter(str.charAt(str.length()-3));
			
			if(isPrevCharLetter){
				return "is";
			}else{
				return "is not";
			}
		}
		
		boolean isThirdCharLetter = Character.isLetter(str.charAt(i+2));
		boolean isPrevCharLetter = Character.isLetter(str.charAt(i-1));
		
		if(!isPrevCharLetter&&!isThirdCharLetter)
			return "is not";
		return "is";
	}

	public int sumNumbers(String str){
		String[] strBuff = new String[str.length()];
		char[] charArray = str.toCharArray();
		for(int i=0; i< str.length(); i++){
			if(Character.isDigit(charArray[i])){
				strBuff[i]=charArray[i]+"";
			}else{
				strBuff[i]=" ";
			}
		}
		String tmpStr="";
		for(String item: strBuff){
			tmpStr +=item;
		}
		
		String[] split = tmpStr.trim().split(" ");
		
		int sum = 0;
		for(int i=0; i< split.length; i++){
			if(split[i].length()>0){
				sum += Integer.parseInt(split[i]);
			}
		}
		
		return sum;
	}
	
	public int maxBlock(String str){
		if(str.isEmpty())
			return 0;
		
		if(str.length()==1)
			return 1;
		String tokenBuffer = "";
		if(str.substring(0, 1).equals(str.charAt(1)+"")){
			tokenBuffer = str.substring(0,1);
		}
		
		
		List<String> list = new ArrayList<String>();
		for(int i=0; i< str.length()-1; i++){
			String curChar = str.substring(i, i+1);
			String nextChar = str.charAt(i+1)+"";
			if(curChar.equals(nextChar)){
				tokenBuffer += curChar;
			}else{
				list.add(tokenBuffer);
				tokenBuffer=nextChar;
			}
		}
		list.add(tokenBuffer);

		int maxBlock = 0;
		for(String item:list){
			if(item.length() > maxBlock)
				maxBlock = item.length();
		}
		
		return maxBlock;
	}
	
	public String mirrorEnds(String string){
		
		StringBuffer sb = new StringBuffer();
		sb.append(string);
		String reverse = sb.reverse().toString();
		if(reverse.equals(string))
			return string;
		
		String front="";
		String end="";
		String tmp="";
		
		for(int i=0; i<string.length()/2; i++){
			front=string.substring(0, i+1);
			end = end + string.charAt(string.length()-1-i);
			if(front.equals(end)){
				tmp = front;
			}
		}
		
		return tmp;
	}

	public String sameEnds(String string){
		String front = "";
		String end = "";
		String tmp = "";
		
		for(int i=0; i<string.length()/2; i++){
			front = string.substring(0, i+1);
			end = string.substring(string.length()-1-i);
			if(front.equals(end))
				tmp = front;
		}
		
		return tmp;
	}
	
	public int sumDigits(String str){
		char[] charArray = str.toCharArray();
		
		int sum = 0;
		for(int i=0; i<charArray.length; i++){
			if(Character.isDigit(charArray[i])){
				sum += Integer.parseInt(charArray[i]+"");
			}
		}
		
		return sum;
	}
	
	
	public int countTriple(String str){
		if(str.length()<3)
			return 0;
		
		String a;
		String b;
		String c;
		
		int tripleCount = 0;
		for(int i=2; i<str.length(); i++){
			a = str.charAt(i-2)+"";
			b = str.charAt(i-1)+"";
			c = str.charAt(i)+"";
			
			if( (a.equals(b)) && (b.equals(c))){
				tripleCount++;
			}
		}
		return tripleCount;
	}
	
	
	public boolean gHappy(String str){
		if(str.isEmpty())
			return true;
		
		if(str.equals("g"))
			return false;
		
		String replace="";
		String tmpString = str;
		
		for(int i=0; i<str.length(); i++){
			replace +="g";
		}
		
		do{
			tmpString = tmpString.replace(replace, "");
			replace = replace.substring(0, replace.length()-1);
		}while(replace.length()>1);
		
		return !tmpString.contains("g");
	}
	
	public boolean equalIsNot(String str){
		int isCount = 0;
		int notCount = 0;
		
		String workString = str;
		
		do{
			if(workString.contains("is")){
				workString = workString.replaceFirst("is", "");
				isCount++;
			}
			
		}while(workString.contains("is"));
		
		do{
			if(workString.contains("not")){
				workString = workString.replaceFirst("not", "");
				notCount++;
			}
		}while(workString.contains("not"));
		return isCount == notCount;
	}
	
	public String withoutString(String base, String remove){
		String replaceLowercase = base.replace(remove.toLowerCase(), "");
		String replaceUppercase = replaceLowercase.replace(remove.toUpperCase(), "");
		return replaceUppercase.replace(remove, "");
	}
	
	public int countYZ(String str){
		char[] charArray = str.toCharArray();
		String[] tmp = new String[charArray.length];
		
		for(int i=0; i<charArray.length; i++){
			if(Character.isLetter(charArray[i])){
				tmp[i]=charArray[i]+"";
			}else{
				tmp[i]=" ";
			}
		}
		
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<tmp.length; i++){
			sb.append(tmp[i]);
		}
		String tmpString = sb.toString().trim();
		String[] split = tmpString.split(" ");
		
		int count = 0;
		for(String item: split){
			if(!item.isEmpty()){
				String lastChar= item.toLowerCase().charAt(item.length()-1)+"";
				if(lastChar.equals("y")||lastChar.equals("z"))
					count++;
			}
		}
		return count;
	}

}
