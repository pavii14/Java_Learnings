package encapsulation;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student ss=new Student();
		ss.setName("Pavithra");
		ss.setStudentId(1155441);
		ss.setQualifingExamMark(99);
		ss.setresidentialStatus('H');
		ss.setyearOfEngg(2);
		
		System.out.println("Student Name       : "+ ss.getName());
		System.out.println("Student Id         : "+ ss.getStudentId());
		System.out.println("Qualifying mark    : "+ss.getQualifingExamMark());
		System.out.println("Year of Engineering: "+ss.getyearOfEngg());
		
		if(ss.getresidentialStatus()=='D'||ss.getresidentialStatus()=='d') {
			
	    System.out.println("Residential status : Day Scholar" );
	    
		}
		else if (ss.getresidentialStatus()=='H'||ss.getresidentialStatus()=='h'){
		System.out.println("Residential status : Hostellers" );	
		}
		
		
		System.out.println("-------------------------------------");
		
		Student ss1=new Student();
		ss1.setName("Raghul");
		ss1.setStudentId(1155442);
		ss1.setQualifingExamMark(100);
		ss1.setresidentialStatus('D');
		ss1.setyearOfEngg(3);
		
		System.out.println("Student Name       : "+ ss1.getName());
		System.out.println("Student Id         : "+ ss1.getStudentId());
		System.out.println("Qualifying mark    : "+ss1.getQualifingExamMark());
		System.out.println("Year of Engineering: "+ss1.getyearOfEngg());
		
		if(ss1.getresidentialStatus()=='D'||ss1.getresidentialStatus()=='d') {
			
	    System.out.println("Residential status : Day Scholar" );
	    
		}
		else if (ss1.getresidentialStatus()=='H'||ss1.getresidentialStatus()=='h'){
		System.out.println("Residential status : Hostellers" );	
		}

	}

}
