package methods;

import java.util.Scanner;

public class NoReturnType_with_parameter {

	public static void Tables(int a) {
		
		for(int i=1;i<=10;i++) {			
			System.out.println(a+"*"+i +"="+(i*a));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Printing Tables");
		System.out.println("enter a number :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		Tables(num);
		
		

	}

}
