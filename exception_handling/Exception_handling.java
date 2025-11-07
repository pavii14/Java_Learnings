package exception_handling;

public class Exception_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a=9;
			int b=0;
			int c;
			c=a/b;
			System.out.println("Result="+c);
		}
		catch(ArithmeticException e) {
			 System.out.println("Error: Division by zero not allowed!");
		}
	}

}
