package methods;

import java.util.Scanner;

public class With_returntype_with_parameter {
	
	public static int Largest_of_2_num(int a,int b) {
		
		 int Largest = (a>b)?a:b;
		return Largest;
	}
	public static int Area_of_square(int a) {
		return a*a;
	}
	public static double Celsius_to_faheirheat(int a ) {
		System.out.println("celsius value is :" +a);
		
		double celsius = ((a*9)/5)+32;
		return celsius;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=20;
		int num2=30;
		
		System.out.println("Largest number prg");
		System.out.println("the Largest number is ="+Largest_of_2_num(num1,num2));
		System.out.println("Area of square prg"+Area_of_square(num1));
		System.out.println(" the converted Celsius_to_faheirheat value is :"+ Celsius_to_faheirheat(num2) );

		
		
	}

}
