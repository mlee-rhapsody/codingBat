package javalearning;

import java.util.Arrays;

public class Array2 {
	public static final Array2 INSTANCE = new Array2();

	private Array2() {
	}

	public int[] evenOdd(int[] nums) {

		int oddCount = 0;
		int evenCount = 0;

		for (int i = 0; i < nums.length; i++) {
			if(nums[i]%2==0)
				evenCount++;
		}
		oddCount = nums.length - evenCount;
		
		int[] oddArray = new int[oddCount];
		int[] evenArray = new int[evenCount];
		int[] copy = new int[nums.length];
		
		int evenIndex = 0;
		int oddIndex  = 0;
		for(int i=0; i< nums.length; i++){
			if(nums[i]%2==0){
				evenArray[evenIndex++] = nums[i];
			}else{
				oddArray[oddIndex++] = nums[i];
			}
				
		}
		
		int copyIndex = 0;
		for(int num: evenArray){
			copy[copyIndex++] = num;
		}
		for(int num: oddArray){
			copy[copyIndex++] = num;
		}
		return copy;
	}

	public int[] zeroMax(int[] nums) {
		if (nums.length < 2)
			return nums;

		int[] copy = new int[nums.length];

		// find some zeroes
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				// find the largest odd value to right of current zero
				int maxOdd = nums[i];
				for (int j = i; j < nums.length; j++) {
					if (nums[j] % 2 != 0 && nums[j] > maxOdd)
						maxOdd = nums[j];
				}
				copy[i] = maxOdd;
			} else
				copy[i] = nums[i];
		}

		return copy;
	}

	public int[] withoutTen(int[] nums) {
		int[] copy = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			copy[i] = 0;
		}

		int tenCount = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 10) {
				copy[tenCount] = nums[i];
				tenCount++;
			}
		}
		return copy;
	}

	public int[] zeroFront(int[] nums) {
		int[] copy = new int[nums.length];
		int zeroCount = 0;
		int nonZero = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				copy[zeroCount] = 0;
				zeroCount++;
			} else {
				nonZero = nums[i];
			}
		}

		for (int j = zeroCount; j < nums.length; j++) {
			copy[j] = nonZero;
		}
		return copy;
	}

	public int[] notAlone(int[] nums, int val) {

		int[] copy = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				copy[i] = isAlone(i, nums);
			} else
				copy[i] = nums[i];
		}

		return copy;
	}

	private int isAlone(int i, int[] nums) {
		if (i == 0) {
			return nums[i];
		}

		if (i == nums.length - 1)
			return nums[nums.length - 1];

		int left = nums[i - 1];
		int right = nums[i + 1];

		if (left == nums[i] || right == nums[i])
			return nums[i];

		if (left > right)
			return left;

		return right;
	}

	public int[] post4(int[] nums) {
		if (nums.length == 0)
			return new int[0];

		if (nums.length == 1 && nums[0] == 4)
			return new int[0];

		int firstFourIndex = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4) {
				firstFourIndex = i + 1;
			}
		}

		int count = 0;
		int[] post4Array = new int[nums.length - firstFourIndex];
		for (int i = firstFourIndex; i < nums.length; i++) {
			post4Array[count] = nums[i];
			count++;
		}
		return post4Array;
	}

	public int[] pre4(int[] nums) {
		if (nums.length == 0)
			return new int[0];

		if (nums.length == 1 && nums[0] == 4)
			return nums;

		int firstFourIndex = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4) {
				firstFourIndex = i;
				break;
			}
		}

		int[] pre4Array = new int[firstFourIndex];
		for (int i = 0; i < firstFourIndex; i++) {
			pre4Array[i] = nums[i];
		}
		return pre4Array;
	}

	public int[] tenRun(int[] nums) {
		int[] copy = new int[nums.length];
		boolean tenrun = false;
		int tenCount = 10;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 10 == 0 && tenrun == false) {
				copy[i] = nums[i];
				tenCount = nums[i];
				tenrun = true;
			} else {
				if (tenrun == false)
					copy[i] = nums[i];

				if (tenrun == true && nums[i] % 10 == 0) {
					tenCount = nums[i];
					copy[i] = nums[i];
				}

				if (tenrun == true) {
					copy[i] = tenCount;
				}
			}
		}
		return copy;
	}

	public int[] shiftLeft(int[] nums) {
		if (nums.length < 2)
			return nums;

		int firstNum = nums[0];
		int[] leftArray = new int[nums.length];
		for (int i = 0; i < nums.length - 1; i++) {
			leftArray[i] = nums[i + 1];
		}

		leftArray[nums.length - 1] = firstNum;
		return leftArray;
	}

	public boolean tripleUp(int[] nums) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		for (int i = 2; i < nums.length; i++) {
			num1 = nums[i - 2];
			num2 = nums[i - 1];
			num3 = nums[i - 0];
			if (num1 < num2 && num2 < num3 && Math.abs(num2 - num1) < 2
					&& Math.abs(num3 - num2) < 2)
				return true;
		}

		return false;
	}

	public boolean sameEnds(int[] nums, int len) {
		int[] endArray = new int[len];

		int endStart = nums.length - len;
		int count = 0;
		for (int i = endStart; i < nums.length; i++) {
			endArray[count] = nums[i];
			count++;
		}

		for (int i = 0; i < len; i++) {
			if (nums[i] != endArray[i])
				return false;
		}
		return true;
	}

	public boolean twoTwo(int[] nums) {
		if (nums.length == 1 && nums[0] == 2)
			return false;

		if (nums.length < 2)
			return true;

		int num1 = 0;
		int num2 = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			num1 = nums[i];
			num2 = nums[i + 1];
			if (num1 == 2 && num2 == 2) {
				i++;
			}

			if (num1 == 2 && num2 != 2) {
				return false;
			}
		}
		int lastIndex = nums.length;
		int nextToLastNumber = nums[lastIndex - 2];
		int lastNumber = nums[lastIndex - 1];

		if (nextToLastNumber != 2 && lastNumber == 2) {
			return false;
		}
		return true;
	}

	public boolean haveThree(int[] nums) {
		if (nums.length == 0)
			return false;

		int num1 = 0;
		int num2 = 0;
		int count = 0;

		if (nums[0] == 3)
			count++;

		for (int i = 1; i < nums.length; i++) {
			num1 = nums[i - 1];
			num2 = nums[i];

			if (num1 == 3 && num2 == 3)
				return false;

			if (num2 == 3)
				count++;
		}

		if (count == 3)
			return true;

		return false;
	}

	public boolean modThree(int[] nums) {
		int num1;
		int num2;
		int num3;

		for (int i = 2; i < nums.length; i++) {
			num1 = nums[i - 2] % 2;
			num2 = nums[i - 1] % 2;
			num3 = nums[i - 0] % 2;

			if (num1 == num2 && num2 == num3)
				return true;
		}

		return false;
	}

	public boolean has12(int[] nums) {
		int oneIndex = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1 && oneIndex == -1)
				oneIndex = i;

			if (nums[i] == 2 && oneIndex != -1) {
				return true;
			}

		}
		return false;
	}

	public boolean has77(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			int num1 = nums[i - 1];
			int num2 = nums[i];
			if (num1 == 7 && 7 == num2)
				return true;
		}

		for (int i = 2; i < nums.length; i++) {
			int num1 = nums[i - 2];
			int num2 = nums[i];
			if (num1 == 7 && 7 == num2)
				return true;
		}
		return false;
	}

	public int matchUp(int[] nums1, int[] nums2) {
		int sum = 0;
		int num1 = 0;
		int num2 = 0;
		int diff = 0;

		for (int i = 0; i < nums1.length; i++) {
			num1 = nums1[i];
			num2 = nums2[i];
			diff = Math.abs(num1 - num2);
			if (num1 != num2 && diff < 3) {
				sum += 1;
			}
		}
		return sum;
	}

	public boolean either24(int[] nums) {
		if (nums.length == 0)
			return false;

		boolean twotwo = false;
		boolean four4 = false;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == 2 && nums[i - 1] == 2)
				twotwo = true;

			if (nums[i] == 4 && nums[i - 1] == 4)
				four4 = true;
		}

		if (twotwo == true && four4 == true)
			return false;

		if (twotwo == false && four4 == false)
			return false;

		return true;
	}

	public boolean isEverywhere(int[] nums, int val) {
		if (nums.length == 0)
			return true;
		boolean everyWhereCheckEven = true;
		boolean everyWhereCheckOdd = true;
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) { // Even
				if (nums[i] != val)
					everyWhereCheckEven = false;
			} else {
				if (nums[i] != val)
					everyWhereCheckOdd = false;
			}
		}

		if (everyWhereCheckEven == true && everyWhereCheckOdd == false)
			return true;
		if (everyWhereCheckEven == false && everyWhereCheckOdd == true)
			return true;

		return false;
	}

	public boolean no14(int[] nums) {
		boolean num1 = false;
		boolean num4 = false;
		for (int num : nums) {
			if (num == 1)
				num1 = true;

			if (num == 4)
				num4 = true;
		}
		if (num1 && num4)
			return false;

		return true;
	}

	public boolean only14(int[] nums) {

		for (int num : nums) {
			if (!(num == 1 || num == 4)) {
				return false;
			}
		}
		return true;
	}

	public boolean more14(int[] nums) {
		int countOne = 0;
		int count14 = 0;

		for (int num : nums) {
			if (num == 1)
				countOne++;

			if (num == 4)
				count14++;
		}

		return countOne > count14;
	}

	public boolean sum28(int[] nums) {
		int sum = 0;
		for (int num : nums) {
			if (num == 2)
				sum += num;
		}
		return sum == 8;
	}

	public boolean lucky13(int[] nums) {
		boolean hasOne = false;
		boolean hasThree = false;

		for (int num : nums) {
			if (num == 1)
				hasOne = true;

			if (num == 3)
				hasThree = true;
		}
		return !(hasOne || hasThree);
	}

	public boolean has22(int[] nums) {
		boolean see2 = false;

		for (int num : nums) {

			if (see2 == true && num == 2) {
				return true;
			} else
				see2 = false;

			if (num == 2) {
				see2 = true;
			}
		}

		return false;
	}

	public int sum67(int[] nums) {
		if (nums.length == 0)
			return 0;

		int sum = 0;
		boolean after6 = false;
		boolean number7 = false;
		for (int number : nums) {
			if (number == 6 && number7 == false)
				after6 = true;
			if (number == 7 && after6 == true)
				number7 = true;

			if (after6) {
				if (number7) {
					number7 = false;
					after6 = false;
				}
			} else {
				sum += number;
			}
		}
		return sum;
	}

	public int sum13(int[] nums) {
		if (nums.length == 0)
			return 0;

		int sum = 0;
		boolean after13 = false;
		for (int number : nums) {
			if (number == 13) {
				after13 = true;
			} else {
				if (after13) {
					after13 = false;
				} else {
					sum += number;
				}
			}
		}
		return sum;
	}

	public int centeredAverage(int[] nums) {
		Arrays.sort(nums);

		int sum = 0;
		int total = 0;
		for (int i = 1; i < nums.length - 1; i++) {
			sum += nums[i];
			total++;
		}

		return sum / total;
	}

	public int bigDiff(int[] nums) {
		int min = nums[0];
		int max = nums[0];
		for (int number : nums) {
			if (number < min)
				min = number;

			if (number > max)
				max = number;
		}

		return Math.abs(max - min);
	}

	public int countEvens(int[] nums) {

		int evenCount = 0;
		for (int number : nums) {
			if (number % 2 == 0)
				evenCount++;
		}
		return evenCount;
	}
}
