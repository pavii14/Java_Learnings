package programs_Task_Day2;

public class Grade_to_student_mark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int student_mark=90;
		
		if(student_mark>=40) {
			if(student_mark>=90) {
				
				System.out.println("Student got A grade");
				
			}
			else {
			
				System.out.println("Student got B grade");
			}
		}

		else {
			System.out.print("the Student is Failed the exam ");
		}
	}

}
