package programs_Task_Day2;

public class LargestOfThreeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//School Topper 
		
		System.out.println("~~~~~~~~~School Topper~~~~~~~~~~~~~");
		int student1=100;
		int student2=186;
		int student3=90;
		
		if(student1>student2) {
			if(student1>student3) {
				System.out.println("Student1 is greater");
			}
			
			else {
				if(student2>student3) {
					System.out.println("Student2 is greater");
				}
				
			}
		}
		
		else {
			if(student3>student2) {
				System.out.println("Student3 is greater");
			}
		}
		 
		
		

		

	}

}
