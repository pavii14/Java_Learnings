package programs_Task_Day2;

public class Student_grade_system_ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mark=60;
		
		if(mark>=90 && mark<=100) {
			System.out.println("Grade A");
		}
		else if (mark>=70 && mark<90) {
			
			System.out.println("Grade B");
			
		}
		else if (mark>=60 && mark<70) {
			System.out.println("Grade c");
			
		}
		
		else if (mark>=35 && mark<60) {
			System.out.println("Grade D");
			
		}
		
		else {
			System.out.println("Please pass the exam");
		}
		
	}

}
