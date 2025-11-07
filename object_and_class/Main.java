package object_and_class;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
		Blood_Bank_Management_system bm =new Blood_Bank_Management_system();
		bm.name="Pavithra";
		bm.age=24;
		bm.phone_number=9859858590L;
		bm.bloodgroup="A+";
//		System.out.println(bm.weight);
		
		Blood_Bank_Management_system bm2 =new Blood_Bank_Management_system();		
		bm2.name="Sonu";
		bm2.age=22;
		bm2.phone_number=5459858590L;
		bm2.bloodgroup="O+";
		
		Blood_Bank_Management_system bm3 =new Blood_Bank_Management_system();		
		bm3.name="Krishna";
		bm3.age=22;
		bm3.phone_number=484898696895L;
		bm3.bloodgroup="AB+";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a option which you want : \n1.Registration  \n2.displaying details \n3.Need emergancy Blood ");
    	int user_option =sc.nextInt();
		
    	Blood_Bank_Management_system bm4 =new Blood_Bank_Management_system();
		bm.Options(user_option);
		
		
		
		bm.display_Details();
		System.out.println("-------------------------------------------");
		bm2.display_Details();
		System.out.println("-------------------------------------------");
		bm3.display_Details();
		
		System.out.println("-------------------------------------------");
	
		
	}

}
