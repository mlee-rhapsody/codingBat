package javalearning;

public class Logic1 {
	final static Logic1 INSTANCE = new Logic1();

	private Logic1() {
	}
	
	public int sumLimit(int a, int b){
		int sum = a + b;
		
		String sumString = String.valueOf(sum);
		int sumLength = sumString.length();
		
		String aString = String.valueOf(a);
		int aLength = aString.length();
		
		if(sumLength>aLength)
			return a;
		
		return sum;
	}
	
	public boolean shareDigit(int a, int b){
		int lefta = a/10;
		int righta = a%10;
		
		int leftb = b/10;
		int rightb = b%10;
		
		if(lefta==leftb || lefta==rightb || righta==leftb || righta==rightb)
			return true;
		
		if(leftb==lefta || leftb==righta || rightb==lefta || rightb==righta)
			return true;
		
		return false;
	}
	
	public int blueTicket(int a, int b, int c){
		int ab = a+b;
		int bc = b+c;
		int ac = a+c;
		
		if(ab==10 || bc==10 || ac==10)
			return 10;
		
		if(Math.abs(ab-bc)>=10 || Math.abs(ab-ac)>=10)
			return 5;
		
		return 0;
	}
	
	public int greenTicket(int a, int b, int c){
		if(a==b && b==c)
			return 20;
		
		if(a==b || b==c || a==c)
			return 10;
		
		if(a!=b && c!=a)
			return 0;
		
		return 0;
	}
	
	public int redTicket(int a, int b, int c){
		if(a==2 && b==2 && c==2)
			return 10;
		
		if(a==b && b==c)
			return 5;
		
		if(a!=b && c!=a)
			return 1;
		
		
		return 0;
	}
	
	public int maxMod5(int a, int b){
		int moda = a%5;
		int modb = b%5;
		
		if(a==b)
			return 0;
		
		if(moda == modb)
			return (a<b)?a:b;
		
		return (a>b)?a:b;
	}
	
	
	public int withoutDouble(int die1, int die2, boolean noDoubles){
		if(noDoubles){
			if(die1==6 && die2==6)
				return 1 + die2;
			
			if(die1 == die2)
				return ++die1 + die2;
		}
		
		return die1 + die2;
	}
	
	public boolean lessBy10(int a, int b, int c){
		if(Math.abs(a-b)>=10 || Math.abs(a-c)>=10)
			return true;
		
		if(Math.abs(b-a)>=10 || Math.abs(b-c)>=10)
			return true;
		
		if(Math.abs(c-a)>=10 || Math.abs(c-b)>=10)
			return true;
		
		return false;
	}
	
	public boolean lastDigit(int a, int b, int c){
		int moda = a%10;
		int modb = b%10;
		int modc = c%10;
		
		if(moda==modb || moda==modc)
			return true;
		
		if(modb==moda || modb==modc)
			return true;
		
		if(modc==moda || modc==modb)
			return true;
		
		return false;
	}
	
	
	public boolean inOrderEqual(int a, int b, int c, boolean equalOk){
		if(equalOk){
			if(a<=b && b<=c)
				return true;
		}else{
			if(a<b && b<c)
				return true;
		}
		
		return false;
	}
	
	public boolean inOrder(int a, int b, int c, boolean bOk){
		if(bOk==true && c>b)
			return true;
		
		if((b>a && c>b) && bOk==false)
			return true;
		
		return false;
	}
	
	public boolean twoAsOne(int a, int b, int c){
		if(a==0 && b==0 && c==0)
			return true;
		
		if((a-b-c)==0 || (b-a-c)==0 || (c-a-b)==0) 
			return true;
		
		return false;
	}
	
	public int teaParty(int tea, int candy){
		if(tea<5 || candy<5)
			return 0;
		
		if(candy>=(2*tea) || tea>=(2*candy))
			return 2;
		
		return 1;
	}
	
	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep){
		if(isAsleep)
			return false;
		
		if(isMorning && isMom)
			return true;
		else if(isMorning)
			return false;
		
		return true;
	}
	
	public int teenSum(int a, int b){
		if((a>=13 && a<=19) || (b>=13 && b<=19))
			return 19;
		
		return a+b;
	}
	
	public boolean nearTen(int num){
		int proximity = num%10;
		return (proximity<=2 || proximity>=8);
	}

	public boolean in1To10(int n, boolean outsideMode){
		
		if(outsideMode==true){
			return (n<=1 || n>=10);
		}else
			return (n>=1 && n<=10);
		
	}
	
	public boolean love6(int a, int b) {
		int sum = a + b;
		int dif = Math.abs(a - b);

		return ((sum == 6) || (dif == 6) || (a == 6) || (b == 6));
	}

	public String alarmClock(int day, boolean vacation) {
		if ((day == 6 || day == 0) && vacation == false)
			return "10:00";
		else if ((day == 6 || day == 0) && vacation == true)
			return "off";

		if (vacation)
			return "10:00";

		return "7:00";
	}

	public int sortaSum(int a, int b) {
		int sum = a + b;
		if (sum >= 10 && sum <= 19)
			return 20;
		else
			return sum;
	}

	public int caughtSpeeding(int speed, boolean isBirthday) {

		int bdayLimit = 5;

		int noTicketCap = (isBirthday) ? 60 + bdayLimit : 60;
		if (speed <= noTicketCap)
			return 0;

		int smallTicketCapMin = isBirthday ? 61 + bdayLimit : 61;
		int smallTicketCapMax = isBirthday ? 80 + bdayLimit : 80;
		if (speed >= smallTicketCapMin && speed <= smallTicketCapMax)
			return 1;

		return 2;
	}

	public boolean squirrelPlay(int temp, boolean isSummer) {

		if (isSummer) {
			return (temp >= 60 && temp <= 100);
		} else {
			return (temp >= 60 && temp <= 90);
		}
	}

	public int dateFashion(int you, int date) {

		if (you >= 8 || date >= 8) {
			if (you <= 2 || date <= 2) {
				return 0;
			}
			return 2;
		}

		if (you < 8 || date < 8) {
			if (you <= 2 || date <= 2) {
				return 0;
			}
			return 1;
		}

		return 0;
	}

	public boolean cigarParty(int cigars, boolean isWeekend) {

		if ((cigars >= 40 && cigars <= 60) && !isWeekend) {
			return true;
		}
		if (cigars >= 40 && isWeekend)
			return true;

		return false;
	}

}
