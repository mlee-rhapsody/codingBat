package javalearning;

import java.util.ArrayList;
import java.util.List;

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

	// ////////////////////////
	
	public String wordEnds(String str, String word){
		if(str.equals(word))
			return "";
		
		if(str.startsWith(word) && str.endsWith(word)){
			int delta = str.length()-word.length()-word.length();
			
			if(delta==0){
				String begWord = word.substring(0, 1);
				String endWord = word.substring(word.length()-1);
				
				return begWord + endWord;
			}
			
			
			if(delta==1){
				String newToken = str.substring(word.length(), str.length()-word.length());
				return newToken+newToken;
			}
			
			if(delta >2){
				String newToken = str.substring(word.length(), str.length()-word.length());

				if(!newToken.contains(word)){
					String beg=newToken.charAt(0)+"";
					String end = newToken.charAt(newToken.length()-1)+"";
					
					return beg+end;
				}
			}
		}
		
		int wordLength = word.length();
		ArrayList<Integer> wordList = new ArrayList<Integer>();
		for(int i=0; i<str.length()-wordLength; i++){
			String substring = str.substring(i, i+wordLength);
			if(substring.contains(word)){
				wordList.add(i);
			}
		}
		
		StringBuffer sb = new StringBuffer();
		for(int element: wordList){
			String left = "";
			String right = "";
			
			if(element>0){
				left = str.charAt(element-1)+"";
				sb.append(left);
			}
			
			if(element+wordLength<str.length()){
				right = str.charAt(element+wordLength)+"";
				sb.append(right);
			}
		}
		
		if(str.endsWith(word)){
			String endLetter = str.charAt(str.length()-word.length()-1)+"";
			sb.append(endLetter);
		}
		
		return sb.toString();
	}
	
	public String plusOut(String str, String word){
		if(str.isEmpty())
			return "";
		
		int wordLength = word.length();
		ArrayList<Integer> wordList = new ArrayList<Integer>();
		for(int i=0; i<str.length()-wordLength; i++){
			String substring = str.substring(i, i+wordLength);
			if(substring.contains(word)){
				wordList.add(i);
			}
		}
		
		char[] plusArray = str.toCharArray();
		for(int i=0; i<plusArray.length; i++)
			plusArray[i]='+';
		
		for(int element: wordList){
			int count=0;
			for(int i=element; i<(element+wordLength); i++){
				plusArray[i] = word.charAt(count);
				count++;
			}
		}
		
		if(str.endsWith(word)){
			int count = 0;
			for(int i=str.length()-wordLength; i<str.length(); i++){
				plusArray[i] = word.charAt(count);
				count++;
			}
		}
		return String.valueOf(plusArray);
	}
	
	public String starOut(String str) {
		if (str.isEmpty())
			return "";

		if (str.contains("*") == false)
			return str;

		if (str.length()<3 && str.contains("*"))
			return "";

		List<Integer> starList = new ArrayList<Integer>();

		for (int i = 1; i < str.length() - 1; i++) {
			String letter = str.charAt(i) + "";
			if (letter.equals("*")) {
				starList.add(i);
			}
		}

		char[] strArray = str.toCharArray();
		
		String startChar = str.charAt(0)+"";
		String endChar = str.substring(str.length()-1);
		
		if(startChar.contains("*"))
			strArray[1]='*';
		
		if(endChar.contains("*"))
			strArray[str.length()-2]='*';
		
		for (int element : starList) {
			strArray[element - 1] = '*';
			strArray[element + 1] = '*';
		}
		
		StringBuffer sb = new StringBuffer();
		for(int i =0; i< strArray.length; i++){
			String letter = strArray[i] + "";
			if(!letter.equals("*"))
				sb.append(letter);
		}

		return sb.toString();
	}

	public String zipZap(String str) {

		if (str.length() < 3)
			return str;

		boolean ignoreAppend = false;

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length() - 2; i++) {
			String substring = str.substring(i, i + 3);

			String z = substring.charAt(0) + "";
			String p = substring.charAt(2) + "";

			if (z.equals("z") && p.equals("p")) {
				sb.append("zp");

				if (i == str.length() - 3)
					ignoreAppend = true;

				i = i + 2;
			} else {
				sb.append(str.charAt(i) + "");
			}
		}
		if (ignoreAppend == false) {
			sb.append(str.charAt(str.length() - 2) + "");
			sb.append(str.charAt(str.length() - 1) + "");
		}

		return sb.toString();
	}

	public boolean sameStarChar(String str) {

		if (str.isEmpty())
			return true;

		if (str.length() == 1 && str.equals("*"))
			return true;

		if (str.length() == 2 && str.contains("*"))
			return true;

		if (str.contains("*") == false)
			return true;

		boolean sentinel = false;

		for (int i = 1; i < str.length() - 1; i++) {
			String letter = str.charAt(i) + "";
			String beforeLetter = str.charAt(i - 1) + "";
			String afterLetter = str.charAt(i + 1) + "";

			if (letter.equals("*") && beforeLetter.equals(afterLetter))
				sentinel = true;

			if (letter.equals("*") && beforeLetter.equals(afterLetter) == false) {
				return false;
			}
		}

		return sentinel;
	}

	public String getSandwich(String str) {
		if (str.isEmpty() || !str.contains("bread"))
			return "";

		if (str.indexOf("bread") == str.lastIndexOf("bread"))
			return "";
		return str
				.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread"));
	}

	public boolean xyzMiddle(String str) {
		if (str.isEmpty() || !str.contains("xyz"))
			return false;

		if (str.equals("xyz"))
			return true;

		if (str.length() == 4 && str.contains("xyz"))
			return true;

		if (str.length() < 4 && !str.contains("xyz"))
			return false;

		for (int i = 0; i < str.length() - 3; i++) {
			String substring = str.substring(i, i + 3);
			if (substring.equals("xyz")) {
				String leftString = str.substring(0, i);
				String rightString = str.substring(i + 3);

				if (Math.abs(leftString.length() - rightString.length()) <= 1)
					return true;
			}
		}

		return false;
	}

	public boolean prefixAgain(String str, int n) {

		String prefix = str.substring(0, n);
		String post = str.substring(n);
		return post.contains(prefix);
	}

	public String repeatSeparator(String word, String sep, int count) {
		if (count == 0)
			return "";

		if (count == 1)
			return word;

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < count - 1; i++) {
			sb.append(word);
			sb.append(sep);
		}

		sb.append(word);

		return sb.toString();
	}

	public String repeatFront(String str, int n) {

		if (str.isEmpty())
			return "";

		if (str.length() == 1)
			return str;

		String substring = str.substring(0, n);

		StringBuffer sb = new StringBuffer();
		sb.append(substring);

		for (int i = n - 1; i >= 1; i--) {
			String substring2 = substring.substring(0, i);
			sb.append(substring2);
		}

		return sb.toString();
	}

	public String repeatEnd(String str, int n) {
		if (str.isEmpty())
			return "";

		String end = str.substring(str.length() - n);

		String repeat = "";
		for (int i = 0; i < n; i++) {
			repeat += end;
		}
		return repeat;
	}

	public String mixString(String a, String b) {

		if (a.isEmpty() && b.isEmpty())
			return "";

		if (a.isEmpty() && b.length() > 0)
			return b;

		if (a.length() > 0 && b.isEmpty())
			return a;

		StringBuffer sb = new StringBuffer();
		int maxLength = a.length() > b.length() ? a.length() : b.length();
		for (int i = 0; i < maxLength; i++) {

			if (i < a.length())
				sb.append(a.charAt(i) + "");

			if (i < b.length())
				sb.append(b.charAt(i) + "");
		}

		return sb.toString();
	}

	public boolean xyBalance(String str) {

		if (str.length() == 0)
			return true;

		if (str.length() == 1) {

			String firstChar = str.charAt(0) + "";

			if (firstChar.equals("y"))
				return true;

			if (firstChar.equals("x"))
				return false;

			return true;
		}

		if (str.contains("x") == false)
			return true;

		if (str.contains("y") == true && str.contains("x") == false)
			return true;

		if (str.contains("x") && str.contains("y")) {

			int lastIndexOfX = str.lastIndexOf("x");
			int lastIndexOfY = str.lastIndexOf("y");

			if (lastIndexOfY > lastIndexOfX)
				return true;
		}
		return false;
	}

	public boolean bobThere(String str) {
		if (str.length() < 3)
			return false;

		if (str.contains("bob"))
			return true;

		for (int i = 0; i < str.length() - 2; i++) {
			String substring = str.substring(i, i + 3);

			String b1 = substring.charAt(0) + "";
			String b2 = substring.charAt(2) + "";
			if (b1.equals("b") && b2.equals("b"))
				return true;
		}
		return false;
	}

	public boolean xyzThere(String str) {
		boolean sentinel = false;

		if (str.startsWith("xyz"))
			sentinel = true;

		for (int i = 1; i < str.length() - 2; i++) {
			String substring = str.substring(i, i + 3);
			String prevI = "" + str.charAt(i - 1);

			if (substring.equals("xyz") && !prevI.equals(".")) {
				sentinel = true;
				break;
			}
		}

		return sentinel;
	}

	public boolean endOther(String a, String b) {

		if (b.toLowerCase().endsWith(a.toLowerCase()))
			return true;

		if (a.toLowerCase().endsWith(b.toLowerCase()))
			return true;

		return false;
	}

	public int countCode(String str) {
		int codeCount = 0;

		for (int i = 0; i < str.length() - 3; i++) {
			String substring = str.substring(i, i + 4);
			if (substring.startsWith("co") && substring.endsWith("e"))
				codeCount++;
		}

		return codeCount;
	}

	public boolean catDog(String str) {

		int dogCount = 0;
		int catCount = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			String substring = str.substring(i, i + 3);
			if (substring.equals("dog"))
				dogCount++;
			if (substring.equals("cat"))
				catCount++;
		}

		return dogCount == catCount;
	}

	public int countHi(String str) {
		int hiCount = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			String substring = str.substring(i, i + 2);
			if (substring.equals("hi"))
				hiCount++;
		}
		return hiCount;
	}

	public String doubleChar(String str) {
		String tmp = "";

		for (int i = 0; i < str.length(); i++) {
			// String item = Character.toString(str.charAt(i));
			tmp += "" + str.charAt(i) + str.charAt(i);
		}

		return tmp;
	}

}
