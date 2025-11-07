package encapsulation;

public class Student {

	private int  studentId;
	private String name;
	private float qualifyingExamMarks;
	private char residentialStatus;
	private int yearOfEngg;
	
	public void setStudentId(int Id) {		
		studentId=Id;		
		} 
	
	public int getStudentId() {
		return studentId;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
   public void setQualifingExamMark( float qualifyingExamMarks) {
		this.qualifyingExamMarks =  qualifyingExamMarks;
	}
   public float getQualifingExamMark() {
		return qualifyingExamMarks;
	}
   
   public void setresidentialStatus(char residentialStatus) {
		this.residentialStatus=residentialStatus;
		
		
		
	}
	public char getresidentialStatus() {
		return residentialStatus;
	}
	
	public void setyearOfEngg(int yearOfEngg) {
		this.yearOfEngg= yearOfEngg;
	}
	public int getyearOfEngg() {
		return yearOfEngg;
	}


}

