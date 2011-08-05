package javalearning;

public class Recursion2 {
	final static Recursion2 INSTANCE = new Recursion2();
	
	private Recursion2() {
	}
	
	public boolean groupSum(int start, int[] nums, int target){
		// Base case: if there are no numbers left, then there is a
		// solution only if target is 0.
		
		if(start>=nums.length){
			return (target == 0);
		}
		
		// Key idea: nums[start] is chosen or it is not.
		// Deal with nums[start], letting recursion
		// deal with all the rest of the array.
		
		// Recursive call trying the case that nums[start] is chosen --
		// subtract it from target in the call.
		boolean groupSum = groupSum(start + 1, nums, target - nums[start]);
		if(groupSum){
			return true;
		}
		
		boolean groupSum2 = groupSum(start + 1, nums, target);
		if(groupSum2){

			return true;
		}
		
		// If neither of the above worked, it's not possible.
		return false;
	}
}
