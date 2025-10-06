package programs_Tasks_Day1;

public class SimpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int principle = 850000;
		int rate_of_intrest =5;
		int duration_time =2;
		double simple_intrest;
		
		simple_intrest=(principle * rate_of_intrest * duration_time)/100;
		
		System.out.println("=============================================");
		System.out.println("          Simple Intrest calculator                                  ");

		System.out.println("=============================================");
		
		System.out.println("Principle value=" +principle);
		System.out.println("Rate of intrest =" +rate_of_intrest);
		System.out.println("duration of time =" + duration_time);
		
		System.out.println("Calculated Simple Intrest=" +simple_intrest);
		System.out.println("Total amount they should pay =" + (principle+simple_intrest));

	}

}
