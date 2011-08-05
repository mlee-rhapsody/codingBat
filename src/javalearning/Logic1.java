package javalearning;

public class Logic1 {
	final static Logic1 INSTANCE = new Logic1();

	private Logic1() {
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
