package programs_Task_Day2;

public class Voter_Age_Learner_Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=8;
		int voting;
		if(age<0) {
			System.out.println("Please enter a valid age Age cant be in negative value");
		}
		else if(age>=18) {
			
			System.out.println("You are eligible for voting");
		}
		else if (age<18) {			
			System.out.println("You are not eligible for voting");
			
			voting=18-age;
			System.out.println("Please Come after " + voting + " years");
			
			
		}
		
		
	}

}
