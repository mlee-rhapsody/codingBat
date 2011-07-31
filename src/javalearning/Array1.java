package javalearning;

import java.util.Arrays;

public class Array1 {

	public static final Array1 INSTANCE = new Array1();

	private Array1() {
	}

	public static void main(String[] args) {
		Array1 tst = Array1.INSTANCE;
		int[] a = {1 ,2,3};
		int[] b = { 7,8,9};
		print(tst.front11(a, b));
	}

	@SuppressWarnings("unused")
	private static void print(int maxTriple) {
		System.out.println(maxTriple);
	}

	@SuppressWarnings("unused")
	private static void print(boolean double23) {
		System.out.println(double23);
	}

	private static void print(int[] is) {
		System.out.println(Arrays.toString(is));
	}

	// ///////////////////////////////////////
	
	public int[] front11(int[] a, int[] b){
		if(a.length==0 && b.length==0){
			int[] copy = {};
			return copy;
		}
		
		if(a.length==0){
			if(b.length!=0){
				int[] copy = {b[0]};
				return copy;
			}
		}
		
		if(b.length==0){
			if(a.length!=0){
				int[] copy = {a[0]};
				return copy;
			}
		}
		
		int[] copy = {a[0], b[0]};
		
		return copy;
		
		
	}
	
	
	public int[] make2(int[] a, int[] b){
		int[] copy = new int[2];
		
		if(a.length >=2){
			copy[0] = a[0];
			copy[1] = a[1];
			
			return copy;
		}
		
		if(a.length==1 && b.length>=1){
			copy[0] = a[0];
			copy[1] = b[0];
			return copy;
		}
		
		if(a.length==1 && b.length==0){
			copy[0] = a[0];
			return copy;
		}
		
		if(a.length==0 && b.length>=2){
			copy[0] = b[0];
			copy[1]	 = b[1];
			return copy;
		}
		
		if(a.length==0 && b.length==1){
			copy[0] = b[0];
			return copy;
		}
		return copy;
	}
	
	
	
	public boolean unlucky1(int[] nums){
		
		if(nums.length ==0)
			return false;
		
		if(nums.length ==1)
			return false;
		
		if(nums.length==2 && nums[0]==1 && nums[1]==3)
			return true;
		
		if(nums.length==3){
			if(nums[0]==1 && nums[1]==3)
				return true;
			
			if(nums[1]==1 && nums[2]==3)
				return true;
		}
		
		
		if(nums.length>=4){
			if(nums[0]==1 && nums[1]==3)
				return true;
			
			if(nums[1]==1 && nums[2]==3)
				return true;
			
			if(nums[nums.length-2]==1 && nums[nums.length-1]==3)
				return true;
		}
		return false;
	}
	
	public int[] frontPiece(int[] nums){
		
		if(nums.length==0 || nums.length==1 || nums.length==2)
			return nums;
		
		int[] copy = {nums[0], nums[1]};
		
		return copy;
	}
	
	
	public int maxTriple(int[] nums){
		if(nums.length==1)
			return nums[0];
		
		int max;
		if(nums.length==2){
			max = nums[0];
			if(nums[1]>max)
				max = nums[1];
			
			return max;
		}
		
		max=nums[0];
		
		
		if(nums[(nums.length-1)/2]>max)
			max = nums[(nums.length-1)/2];
		
		if(nums[nums.length-1]>max)
			max = nums[nums.length-1];
		
		return max;
	}
	
	
	public int[] midThree(int[] nums){
		if(nums.length == 3)
			return nums;
					
		int mid = nums.length/2;
		
		int[] copy = {nums[mid-1], nums[mid], nums[mid+1]};
		
		return copy;
	}
	
	public int[] swapEnds(int[] nums){
		if(nums.length==1)
			return nums;
		
		int tmp = nums[0];
		nums[0] = nums[nums.length-1];
		nums[nums.length-1] = tmp;
		
		return nums;
		
		
	}
	
	
	public int[] plusTwo(int[] a, int[] b){
		
		int[] copy = {a[0], a[1], b[0], b[1]};
		return copy;
	}
	
	
	public int[] makeMiddle(int[] nums){
		
		if(nums.length==2)
			return nums;
		
		int mid = nums.length/2;
		
		int[] copy = {nums[mid-1], nums[mid]};
		
		return copy;
	}
	
	
	public int[] biggerTwo(int[] a, int[] b) {

		int sumA = a[0] + a[1];
		int sumB = b[0] + b[1];

		if (sumA == sumB)
			return a;

		if (sumA > sumB)
			return a;
		else
			return b;
	}

	public int start1(int[] a, int[] b) {

		if (a.length == 0 && b.length == 0)
			return 0;

		if (a.length > 0 && b.length > 0) {
			int oneCount = 0;
			if (a[0] == 1)
				oneCount++;

			if (b[0] == 1)
				oneCount++;

			return oneCount;
		}

		if (a.length == 0 && b.length > 0) {
			if (b[0] == 1)
				return 1;
		}

		if (a.length > 0 && b.length == 0) {
			if (a[0] == 1)
				return 1;
		}

		return 0;
	}

	public int[] fix23(int[] nums) {
		int[] copy = new int[nums.length];
		copy[0] = nums[0];

		if (nums[0] == 2 && nums[1] == 3)
			copy[1] = 0;
		else
			copy[1] = nums[1];

		if (nums[1] == 2 && nums[2] == 3)
			copy[2] = 0;
		else
			copy[2] = nums[2];

		return copy;
	}

	public boolean double23(int[] nums) {

		if (nums.length == 0 || nums.length == 1)
			return false;

		if (nums[0] == 2 && (nums[0] == nums[1]))
			return true;

		if (nums[0] == 3 && (nums[0] == nums[1]))
			return true;

		return false;
	}

	public int[] makeLast(int[] nums) {
		int[] copy = new int[nums.length * 2];

		copy[copy.length - 1] = nums[nums.length - 1];

		return copy;
	}

	public boolean no23(int[] nums) {
		if (nums[0] == 2 || nums[1] == 2)
			return false;

		if (nums[0] == 3 || nums[1] == 3)
			return false;

		return true;
	}

	public boolean has23(int[] nums) {
		if (nums[0] == 2 || nums[1] == 2)
			return true;

		if (nums[0] == 3 || nums[1] == 3)
			return true;

		return false;
	}

	public int[] makeEnds(int[] nums) {
		int[] copy = new int[] { nums[0], nums[nums.length - 1] };
		return copy;
	}

	public int[] middleWay(int[] a, int[] b) {
		int[] copy = new int[] { a[1], b[1] };

		return copy;
	}

	public int sum2(int[] nums) {
		if (nums.length == 0)
			return 0;

		if (nums.length == 1)
			return nums[0];

		if (nums.length >= 2)
			return nums[0] + nums[1];

		return 0;
	}

	public int[] maxEnd3(int[] nums) {
		int max = nums[0];
		if (nums[2] > max)
			max = nums[2];

		int[] copy = { max, max, max };

		return copy;
	}

	public int[] reverse3(int[] nums) {

		int[] copy = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			copy[i] = nums[(nums.length - 1) - i];
		}

		return copy;
	}

	public int[] rotateLeft3(int[] nums) {
		int[] copy = new int[3];

		copy[0] = nums[1];
		copy[1] = nums[2];
		copy[2] = nums[0];

		return copy;
	}

	public int sum3(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}

		return sum;
	}

	public boolean commonEnd(int[] a, int[] b) {

		if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1])
			return true;

		return false;
	}

	public int[] makePi() {
		int[] pi = { 3, 1, 4 };

		return pi;
	}

	public boolean sameFirstLast(int[] nums) {

		if (nums.length == 0)
			return false;

		if (nums.length == 1)
			return true;

		if (nums.length > 1 && (nums[0] == nums[nums.length - 1])) {
			return true;
		}

		return false;
	}

	public boolean firstLast6(int[] nums) {

		if (nums.length == 0)
			return false;

		if (nums[0] == 6 || nums[nums.length - 1] == 6)
			return true;

		return false;
	}
}