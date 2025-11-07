package object_and_class;

import java.util.Scanner;

public class Blood_Bank_Management_system {

	//static String gender;// intha mari static la kudutha atha change pana mudiyathu and inoru class la iruthu call pani use pana mudiuathu 
	String name;
	int age;
	long phone_number;
	String bloodgroup;
	final int weight=45;// ithu kuduthalum call pani use pana mudium but changes ethuvum um pana mudiyathu
	
	
	public void Options(int a) {
		
		switch (a) {
		case 1:
			getUserdetails();
			break;
			
		case 2: 
			  display_Details();
			  break;
			  
		case 3 : 
			  
			bloodgroupcheck();
			break;
		default:
			System.out.println("please enter a valid option ");
			break;
		}
		
	}
	
	
	public String bloodgroupcheck() {
		String group;
		System.out.println("Enter the blood group you need: ");
		Scanner ss=new Scanner(System.in);
		group= ss.nextLine();
		if (group.equalsIgnoreCase(bloodgroup)) {
			
			System.out.println("Its is avaliable please check for the details in reciption");
		}
		
		else {
			System.out.println("not avaliable please go to other blood bank");
		}
		return bloodgroup;
		
	}
	public void getUserdetails() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		name=sc.next();
		System.out.println("Enter your age : ");
		age=sc.nextInt();
		System.out.println("Enter your phone number : ");
		phone_number=sc.nextLong();
		System.out.println("Enter your Blood group : ");
		bloodgroup=sc.next();
		
		display_Details();
		
	}
	
	public void display_Details() {
		
		
		System.out.println("Name =" + name);
		System.out.println("age =" + age);
		System.out.println("Phone number =" + phone_number);
		System.out.println("Blood group = " + bloodgroup);
	}
}
