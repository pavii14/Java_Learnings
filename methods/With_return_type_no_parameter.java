package methods;

public class With_return_type_no_parameter {
	
	public static int Total_mark() {
		
		int tamil =60;
		int english=70;
		int maths=70;
		int science=100;
		int social=90;
		
		System.out.println("English:"+english);
		System.out.println("Tamil:"+tamil);
		System.out.println("Maths:"+maths);
		System.out.println("Science:"+science);
		System.out.println("Social:"+social);
		
		
		int Total_marks=tamil+english+maths+science+social;
		
		return Total_marks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Total Marks obtained by the student is "+Total_mark());
		
		
		

	}

}
