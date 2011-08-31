package javalearning;

import java.util.Arrays;

public class Array2 {
	public static final Array2 INSTANCE = new Array2();
	
	private Array2(){
	}
	
	public boolean no14(int[] nums){
		return false;
	}
	
	public boolean only14(int[] nums){
		
		for(int num:nums){
			if(!(num==1||num==4)){
				return false;
			}
		}
		return true;
	}
	
	public boolean more14(int[] nums){
		int countOne=0;
		int count14=0;
		
		for(int num:nums){
			if(num==1)
				countOne++;
			
			if(num==4)
				count14++;
		}
		
		return countOne>count14;
	}
	
	public boolean sum28(int[] nums){
		int sum = 0;
		for(int num:nums){
			if(num==2)
				sum +=num;
		}
		return sum==8;
	}
	
	public boolean lucky13(int[] nums){
		boolean hasOne = false;
		boolean hasThree = false;
		
		for(int num: nums){
			if(num==1)
				hasOne = true;
			
			if(num==3)
				hasThree = true;
		}
		return !(hasOne||hasThree);
	}
	
	public boolean has22(int[] nums){
		boolean see2 = false;
		
		for(int num:nums){
			
			if(see2==true && num==2){
				return true;
			}else
				see2=false;
			
			if(num==2){
				see2=true;
			}
		}
		
		return false;
	}
	
	public int sum67(int[] nums){
		if(nums.length==0)
			return 0;
		
		int sum = 0;
		boolean after6 = false;
		boolean number7 = false;
		for(int number:nums){
			if(number==6&&number7==false)
				after6=true;
			if(number==7 && after6==true)
				number7=true;
			
			if(after6){
				if(number7){
					number7=false;
					after6 = false;
				}
			}else{
				sum +=number;
			}
		}
		return sum;
	}
	
	public int sum13(int[] nums){
		if(nums.length==0)
			return 0;
		
		int sum =0;
		boolean after13 = false;
		for(int number:nums){
			if(number==13){
				after13=true;
			}else{
				if(after13){
					after13=false;
				}else{
					sum += number;
				}
			}
		}
		return sum;
	}
	public int centeredAverage(int[] nums){
		Arrays.sort(nums);
		
		int sum = 0;
		int total = 0;
		for(int i=1; i<nums.length-1; i++){
			sum+=nums[i];
			total++;
		}
		
		return sum/total;
	}
	
	public int bigDiff(int[] nums){
		int min = nums[0];
		int max = nums[0];
		for(int number:nums){
			if(number<min)
				min = number;
			
			if(number>max)
				max = number;
		}
		
		return Math.abs(max - min);
	}
	
	public int countEvens(int[] nums){
		
		int evenCount = 0;
		for(int number: nums){
			if(number%2==0)
				evenCount++;
		}
		return evenCount;
	}
}
