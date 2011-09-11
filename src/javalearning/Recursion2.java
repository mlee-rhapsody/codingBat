package javalearning;

public class Recursion2 {
	final static Recursion2 INSTANCE = new Recursion2();
	
	private Recursion2() {
	}
	
	public boolean groupSum5(int start, int[] nums, int target){
		if(start>=nums.length)
			return (target==0);
		
		if(groupSum5(start+1, nums, target-nums[start]))
			return true;
		if(nums[start]!=5){
			if(groupSum5(start+1, nums, target))
				return true;
		}
		
		return false;
	}
	
	public boolean groupNoAdj(int start, int[] nums, int target){
		if(start >= nums.length)
			return (target == 0);
		
		if(groupNoAdj(start+2, nums, target-nums[start]))
			return true;
		
		if(groupNoAdj(start+1, nums, target))
			return true;
		
		return false;
	}
	
	public boolean groupSum6(int start, int[] nums, int target){
		
		if(start>=nums.length){
			return (target == 0);
		}
		
		boolean groupSum6 = groupSum6(start + 1, nums, target - nums[start]);
		if(groupSum6){
			return true;
		}
		
		if(nums[start]!=6){
			boolean groupSum26 = groupSum6(start + 1, nums, target);
			if(groupSum26){
				
				return true;
			}
		}
		
		return false;
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
	
	
	// Utilities: ToDo move out.. keeping around as it might be helpful for other
	// projects.
	
	@SuppressWarnings("unused")
	private void moveTargetIndexToFrontofArray(int[] nums, int targetIndex) {
		int index = 0;
		int tmp = nums[index];
		for(int i=0; i< nums.length; i++){
			if(nums[i]==targetIndex){
				nums[i]=tmp;
				nums[index]=targetIndex;
				index++;
			}
		}
	}
}
