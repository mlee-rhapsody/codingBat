package javalearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AP1 {
	public final static AP1 INSTANCE = new AP1();

	private AP1() {
	}

	public int commonTwo(String[] a, String[] b){
		Set<String> set = new TreeSet<String>();
		for(int i=0; i<a.length; i++){
			for(int j=0; j<b.length; j++){
				if(a[i].equals(b[j])){
					set.add(a[i]);
				}
			}
		}
		return set.size();
	}
	
	public String[] mergeTwo(String[] a, String[] b, int n) {
		Set<String> list = new TreeSet<String>();
		for (int i = 0; i < n; i++) {
			list.add(a[i]);
			list.add(b[i]);
		}
		
		String[] retArray = new String[n];
		int counter = 0;
		for(String item: list){
			retArray[counter++] = item;
			if(counter>=n) break;
		}
		return retArray;
	}

	public int userCompare(String aName, int aId, String bName, int bId) {

		if (aName.equals(bName)) {
			if (aId == bId) {
				return 0;
			} else if (aId < bId) {
				return -1;
			} else {
				return 1;
			}
		}
		int sortValue;
		int compareTo = aName.compareTo(bName);
		if (compareTo < 0) {
			sortValue = -1;
		} else if (compareTo > 0) {
			sortValue = 1;
		} else {
			sortValue = 0;
		}
		return sortValue;
	}

	public int bigHeights(int[] heights, int start, int end) {
		int bigSteps = 0;
		int delta;
		for (int i = start + 1; i <= end; i++) {
			delta = Math.abs(heights[i - 1] - heights[i]);
			if (delta >= 5)
				bigSteps += 1;
		}
		return bigSteps;
	}

	public int sumHeights2(int[] heights, int start, int end) {
		int sum = 0;
		int delta;
		for (int i = start + 1; i <= end; i++) {
			delta = Math.abs(heights[i - 1] - heights[i]);
			if (heights[i - 1] < heights[i]) {
				sum += delta * 2;
			} else {
				sum += delta;
			}
		}
		return sum;
	}

	public int sumHeights(int[] heights, int start, int end) {
		int sum = 0;
		int delta;
		for (int i = start + 1; i <= end; i++) {
			delta = Math.abs(heights[i - 1] - heights[i]);
			sum += delta;
		}
		return sum;
	}

	public int scoresSpecial(int[] a, int[] b) {
		int aSpecialScore = findLargestSpecialScore(a);
		int bSpecialScore = findLargestSpecialScore(b);

		return aSpecialScore + bSpecialScore;
	}

	private int findLargestSpecialScore(int[] scores) {
		int maxSpecialScore = 0;
		for (int score : scores) {
			if (score % 10 == 0) {
				if (score > maxSpecialScore)
					maxSpecialScore = score;
			}
		}
		return maxSpecialScore;
	}

	public String[] wordsWithout(String[] words, String target) {
		ArrayList<String> list = new ArrayList<String>();
		for (String item : words) {
			if (!target.equals(item)) {
				list.add(item);
			}
		}

		return (String[]) list.toArray(new String[0]);
	}

	public int scoreUp(String[] key, String[] answers) {
		int score = 0;
		for (int i = 0; i < key.length; i++) {
			if (answers[i].equals("?")) {
				// score doesn't change on blank
			} else if (key[i].equals(answers[i])) {
				score = score + 4;
			} else {
				score = score - 1;
			}
		}
		return score;
	}

	public int matchUp(String[] a, String[] b) {
		if (a.length != b.length)
			return 0;

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			String aChr;
			if (a[i].isEmpty()) {
				aChr = "";
			} else {
				aChr = a[i].charAt(0) + "";
			}
			String bChr;
			if (b[i].isEmpty()) {
				bChr = "";
			} else {
				bChr = b[i].charAt(0) + "";
			}

			if (aChr.equals(bChr) && aChr.length() == 1 && bChr.length() == 1)
				count++;
		}

		return count;
	}

	public int[] copyEndy(int[] nums, int count) {
		int endyCount = 0;
		int[] endy = new int[count];
		for (int num : nums) {
			if (isEndy(num)) {
				endy[endyCount] = num;

				endyCount++;
				if (endyCount >= count)
					break;
			}
		}

		return endy;
	}

	private boolean isEndy(int num) {
		return (num >= 0 && num <= 10) || (num >= 90 && num <= 100);
	}

	public int[] copyEvens(int[] nums, int count) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int num : nums) {
			if (num % 2 == 0)
				list.add(num);
		}

		int[] intArr = new int[count];
		for (int i = 0; i < count; i++) {
			intArr[i] = list.get(i);
		}

		return intArr;
	}

	public boolean dividesSelf(int n) {
		int lastDigit;
		int currentNumber;
		currentNumber = n;

		do {
			lastDigit = currentNumber % 10;
			currentNumber = currentNumber / 10;

			if (lastDigit == 0 || n % lastDigit != 0)
				return false;
		} while (currentNumber > 10);

		if (currentNumber == 0 || n % currentNumber != 0)
			return false;

		return true;
	}

	public boolean hasOne(int n) {
		int lastDigit;
		int currentNumber;
		currentNumber = n;
		do {

			lastDigit = currentNumber % 10;
			currentNumber = currentNumber / 10;
			if (lastDigit == 1)
				return true;

		} while (currentNumber != 0);

		return false;
	}

	public List<String> wordsWithoutList(String[] words, int len) {
		ArrayList<String> list = new ArrayList<String>();

		for (String item : words) {
			if (item.length() != len)
				list.add(item);
		}

		return list;
	}

	public String[] wordsFront(String[] words, int n) {
		String[] newString = new String[n];

		for (int i = 0; i < n; i++) {
			newString[i] = words[i];
		}

		return newString;
	}

	public int wordsCount(String[] words, int len) {
		int count = 0;

		for (String item : words) {
			if (item.length() == len)
				count++;
		}

		return count;
	}

	public int scoresAverage(int[] scores) {

		int half = scores.length / 2;
		int firstAvg = average(scores, 0, half);
		int secondAvg = average(scores, half, scores.length);

		if (firstAvg > secondAvg)
			return firstAvg;

		return secondAvg;
	}

	private int average(int[] scores, int start, int end) {
		int sum = 0;
		int count = 0;

		for (int i = start; i < end; i++) {
			sum = sum + scores[i];
			count++;
		}

		int avg = sum / count;
		return avg;
	}

	public boolean scoresClump(int[] scores) {

		for (int i = 2; i < scores.length; i++) {
			int n1 = scores[i - 2];
			int n2 = scores[i - 1];
			int n3 = scores[i];

			int delta1 = n2 - n1;
			int delta2 = n3 - n1;

			if (delta1 <= 2 && delta2 <= 2)
				return true;
		}

		return false;
	}

	public boolean scores100(int[] scores) {

		for (int i = 1; i < scores.length; i++) {
			if (scores[i - 1] == 100 && scores[i] == 100)
				return true;
		}

		return false;
	}

	public boolean scoresIncreasing(int[] scores) {
		int hiscore = scores[0];

		for (int current : scores) {
			if (current >= hiscore)
				hiscore = current;
			else
				return false;
		}

		return true;
	}
}
