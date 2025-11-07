package array;

public class Array_example {
	
	public static void main (String Args[]) {
		
		int [] marks = {80,90,70,100};  // ipadium panalam
		int roll_num []= {10,20,79,60};
		System.out.println("roll number ="+ roll_num[0]);
		System.out.println("marks ="+ roll_num[0]);
		String Course []= {"Java","Linux","Bs","redux","javascript"};
		System.out.println("Display courses:"+ Course[0]);
		Course[0]="Python";
		 String Names[] =new String[3];//new method
		 Names[0]="Sonu";
		 Names[1]="Nachu";
		 Names[2]="Pavi"; 
		
		System.out.println("Display courses:"+ Course[0]);
		
		for (int i =0; i<Course.length;i++) {
			System.out.println("Courses Avaliable are:" + Course[i]);
			
		}
		
		int Total_mark=0;
		for (int i=0;i<marks.length;i++) {
			
			Total_mark+=marks[i];
			
		}
		System.out.println("Totall Mark is ="+Total_mark);
		System.out.println("Average_mark is =" + (Total_mark/ marks.length));
		 
		
		//forEachLoop
		
		for (int newMark : marks) {
			System.out.println("marks:"+ newMark);
		}
		
		
		// 2D array
		
		
		int [][] student_age = {{12,22,34},{14,15,16}};
		System.out.println("");
		System.out.print(" "+student_age[0][0]);
		System.out.print(" "+student_age[0][1]);
		System.out.print(" "+ student_age[0][2]);
		
		System.out.println("");
		System.out.print(" "+student_age[1][0]);
		System.out.print(" "+student_age[1][1]);
		System.out.print(" "+ student_age[1][2]);
		System.out.println("");
		for (int row=0;row<student_age.length;row++) {
			for (int col=0;col<student_age[row].length;col++) {
				
				System.out.println("Matrix["+row+"]["+col+"]="+ student_age[row][col]);
				
				
			}
			
		}	
		
	}
	
	
	
	
	//
	

}
