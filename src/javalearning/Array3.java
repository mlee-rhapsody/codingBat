package javalearning;

import java.util.Arrays;

public class Array3 {
	public final static Array3 INSTANCE = new Array3();

	private Array3() {
	}

	public int maxMirror(int[] nums){
		
		if(nums.length==0)
			return 0;
		
		if(nums.length==1)
			return 1;
		
		int[] reverseCopy = new int[nums.length];
		
		int count=0;
		for(int i=nums.length-1; i>=0; i--){
			reverseCopy[count++] = nums[i];
		}
		
		int maxCount = 0;
		boolean find;
		//Grow substring from 0 to n
		for(int i=1; i<=nums.length; i++){
			int[] subarray = getSubArray(reverseCopy, 0, i);
			find = arrayFind(nums, subarray);
			int curCount = subarray.length;
			System.out.printf("%2d %s %d %1$b %n",maxCount, Arrays.toString(subarray),  curCount, find);
			if(find){
				if(curCount>=maxCount){
					maxCount = curCount;
				}
			}
		}
		
		//Grow substring from start=n to lastIndex
		for(int i=nums.length-1; i>=0; i--){
			int[] subarray = getSubArray(reverseCopy, i, nums.length-i);
			find = arrayFind(nums, subarray);
			int curCount = subarray.length;
			System.out.printf("%2d %s %d %1$b %n",maxCount, Arrays.toString(subarray),  curCount, find);
			if(find){
				if(curCount>=maxCount){
					maxCount = curCount;
				}
			}
		}
		
		//Grow substring from start=n to n
		for(int i=0; i< nums.length; i++){
			for(int j=i; j<nums.length; j++){
				System.out.printf("%2d %2d%n", i, j);
			}
		}
		
		
		
		System.out.println("maxCount = "+maxCount);
		return maxCount;
	}
	
	
	public int[] getSubArray(int[] reverseCopy, int offset, int length) {
		int[] copy = new int[length];
		
		for(int i=0; i<length; i++){
			copy[i]=reverseCopy[offset+i];
		}
		return copy;
	}

	public boolean arrayFind(int[] array, int[] sub ){
		boolean search = false;
		
		if(sub.length==0 && array.length>0)
			return false;
		
		if(sub.length > array.length)
			return false;
		
		for(int i=0; i<=array.length-sub.length; i++){
			
			search = true;
			for(int j=0; j<sub.length;j++){
				if(array[i+j]!=sub[j])
					search=false;
			}
			if(search == true)
				return true;
		}
		
		return false;
	}
	
	
	public int[] seriesUp(int n){
		if(n==0)
			return new int[0];
		
		if(n==1){
			int[] oneArray={1};
			return oneArray; 
		}
		
		final int maxSize = n*(n+1)/2;
		int[] output = new int[maxSize];
		int count =0;
		for(int i=1; i<=n; i++){
			for(int j=1;j<=i;j++){
				output[count++] =j;
			}
		}
		
		return output;
	}
	
	public int[] squareUp(int n){
		
		if(n==0)
			return new int[0];
		
		if(n==1){
			int[] oneArray={1};
			return oneArray; 
		}
		
		final int maxSize = n*n;
		int[] output = new int[maxSize];
		
		final int divSize = maxSize / n;
		
		initializeArray(maxSize, output);
		
		int divCounter = 1;
		int secCounter = n;
		int outputCounter = 1;
		boolean zeroFlag = false;
		
		for(int i=maxSize-1; i>= 0; i--){
			if(outputCounter > secCounter)
				zeroFlag = true;
			
			if(zeroFlag)
				output[i] = 0;
			else
				output[i] = outputCounter;
			
			outputCounter++;
			
			if(divCounter>=divSize){
				divCounter = 1;
				secCounter--;
				outputCounter = 1;
				zeroFlag = false;
			}else{
				divCounter++;
			}
		}
		return output;
	}

	private void initializeArray(final int maxSize, int[] output) {
		for(int i=0; i<maxSize; i++){
			output[i]=0;
		}
	}
	
	public boolean linearIn(int[] outer, int[] inner){
		if(inner.length==0)
			return true;
		int innerIndex = 0;
		
		for(int i=0; i<outer.length; i++){
			if(outer[i] == inner[innerIndex]){
				
				if(innerIndex == inner.length-1)
					return true;
				
				innerIndex++;
			}
		}
		
		return false;
	}
	
	public boolean canBalance(int[] nums) {
		int leftToRightSum = 0;
		int rightToLeftSum = 0;
		for (int i = 0; i < nums.length; i++) {
			leftToRightSum = sumLeftToRight(i,nums);
			rightToLeftSum = sumRightToLeft(i, nums);
			if(leftToRightSum == rightToLeftSum)
				return true;
		}

		return false;
	}

	private int sumRightToLeft(int index, int[] nums) {
		int sum=0;
		for(int i= nums.length-1; i>=index; i--)
			sum +=nums[i];
		
		return sum;
	}

	private int sumLeftToRight(int index, int[] nums) {
		int sum =0;
		for(int i=0; i<index; i++)
			sum+=nums[i];
		
		return sum;
	}

	public int[] fix45(int[] nums) {
		if (nums.length < 2)
			return nums;

		// If first element is 5 swap it with next non 4/5 element to simplify
		// subsequent code
		if (nums[0] == 5) {
			for (int i = 1; i < nums.length; i++) {
				if (!(nums[i] == 4 || nums[i] == 5)) {
					nums[0] = nums[i];
					nums[i] = 5;
					break;
				}
			}
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4) {
				int tmp = nums[i + 1];

				for (int j = 1; j < nums.length; j++) {
					if (nums[j] == 5 && nums[j - 1] != 4) {
						nums[j] = tmp;
						nums[i + 1] = 5;
						break;
					}
				}

			}
		}

		return nums;
	}

	public int[] fix34(int[] nums) {
		if (nums.length < 2)
			return nums;

		int fourCount = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4)
				fourCount++;
		}
		// put 4's to the end unless it's a three
		int lastCount = 0;
		for (int j = 0; j < fourCount; j++) {

			for (int i = 0; i < nums.length; i++) {
				int tmp = nums[nums.length - 1 - lastCount];
				if (tmp == 3)
					lastCount++;
				else {
					if (nums[i] == 4) {
						nums[nums.length - 1 - lastCount] = 4;
						nums[i] = tmp;
						lastCount++;
						break;
					}
				}
			}

		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 3) {
				int tmp = nums[i + 1];
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[j] == 4) {
						nums[i + 1] = 4;
						nums[j] = tmp;
						break;
					}
				}
			}
		}
		return nums;
	}

	public int maxSpan(int[] nums) {
		if (nums.length == 0)
			return 0;

		if (nums.length == 1)
			return 1;

		int maxSpan = 0;
		int tmp = 0;
		for (int num : nums) {
			tmp = getMaxSpan(num, nums);
			if (tmp > maxSpan)
				maxSpan = tmp;
		}

		return maxSpan;
	}

	private int getMaxSpan(int targetIndex, int[] nums) {
		int left = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == targetIndex) {
				left = i;
				break;
			}
		}

		int right = -1;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] == targetIndex) {
				right = i;
				break;
			}
		}

		int span = 0;
		if (right > left) {

			for (int i = left; i <= right; i++) {
				span++;
			}
			return span;
		}
		return 1;
	}
}
