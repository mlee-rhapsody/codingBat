package javalearning;

public class AP1 {
	public final static AP1 INSTANCE = new AP1();
	private AP1() {
	}
	
	public boolean scoresClump(int[] scores){
		
		for(int i=2; i<scores.length; i++){
			if(scores[i-2]>scores[i-1] || scores[i-1]>scores[i]){
				System.out.println("failed increasing tests");
				return false;
			}
				
			
			if(Math.abs(scores[i-2]-scores[i-1])>=3||Math.abs(scores[i-1]-scores[i])>=3){
				System.out.println("failed differ");
				return false;
			}
		}
		
		return true;
	}
	
	public boolean scores100(int[] scores){
		
		for(int i=1; i<scores.length; i++){
			if(scores[i-1]==100 && scores[i]==100)
				return true;
		}
		
		return false;
	}

	public boolean scoresIncreasing(int[] scores){
		int hiscore = scores[0];
		
		for(int current: scores){
			if(current>=hiscore)
				hiscore = current;
			else
				return false;
		}
		
		return true;
	}
}
