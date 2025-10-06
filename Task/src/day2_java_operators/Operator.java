package day2_java_operators;

public class Operator {

	public static void main(String[] args) {
		// Assignment operator  - used to assign the value to a variable and to avoid 3rd party variable 
		
		int mark1 =100;// normal assignment
		int mark2=90;
		int mark3=100;
		int mark4=99;
		int mark5=90;
		int total_mark=mark1+mark2+mark3+mark4+mark5;// normal calculation with 3rd variable 
		int numberOfDaysPresent=50;
		int totalNoDays=80;
		int noOfStudent=10;
		double fees=10000;
		int punishmentAmount=300;
		
				
		//mark2+=mark1; //mark2=mark2+mark1
		
	    //mark1-=mark2; // mark1=mark1-mark2
		System.out.println("~~~~~~~~~~~~~~Arithemetic operators~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Addition "+"Total marks="+(total_mark));
		System.out.println("Divide "+"Total Average marks of students ="+(total_mark/=5));
		System.out.println("Subraction "+"Total No of days Absent="+(totalNoDays-=numberOfDaysPresent));
		System.out.println("Punishment amount collected by the department"+ (punishmentAmount*= totalNoDays));
		System.out.println("Multiply "+"Total fees collected by the department="+ (noOfStudent*=fees));
		System.out.println("Modulo ="+ (((mark1+mark2+mark2+mark3+mark4+mark5)%5)));
		
		
		// Relational operators
		System.out.println("~~~~~~~~~~~~~~Relational operators~~~~~~~~~~~~~~~~~~~~~~~~");
		int sister1Age=24;
		int sister2Age=22;
		int dad=50;
		int mom=44;
		
		System.out.println("sister1 is greater than sister2="+(sister1Age>sister2Age));
		System.out.println("sister2 is lesser than sister1="+(sister2Age<sister1Age));
		System.out.println("sister1 is greater than or equal to  sister2="+(sister1Age<=sister2Age));
		System.out.println("sister2 is lesser than equal to sister1="+(sister2Age<=sister1Age));
		System.out.println("dad age is equal to mom age =" + (dad==mom));
		System.out.println("dad age and mom age is different =" + (dad!=mom));
		
		//Logical operator
		System.out.println("~~~~~~~~~~~~~~Logical operators~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("And gate :"+( (mom==dad)&& (sister1Age>sister2Age)));
		System.out.println("And gate :"+( (mom<dad)&& (sister1Age>sister2Age)));		
		System.out.println("OR gate :"+( (mom==dad)|| (sister1Age>sister2Age)));
		System.out.println("OR gate :"+( (mom==dad)|| (sister1Age<sister2Age)));		
		System.out.println("NOT gate :"+!(mom==dad));//false but it will come true
		System.out.println("NOT gate :"+!(mom!=dad));//true but it will come as false 
		
		
		
		
		
		
		
		
		//

	}

}
