package programs_Tasks_Day1;

public class Fahrenheit_to_celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fahrenheit =80;
		double celsius= (fahrenheit-32)*5/9;
		
		System.out.println("=============================================");
		System.out.println("          Fahrenheit_to_celsius                                 ");

		System.out.println("=============================================");
		
		System.out.println(" Entered Fahrenheit value is = "+fahrenheit);
		System.out.println("converted celsius value is =" +celsius);
		
		System.out.println("=============================================");
		System.out.println("          celsius_to_Fahrenheit                                ");

		System.out.println("=============================================");
		
		double total_fahrenheit= ((celsius*9)/5)+32;
		System.out.println("the given celsius value is " + celsius);
		
		System.out.println("Total Fahrenheit value = " +total_fahrenheit);
				
		
		
		

	}

}
