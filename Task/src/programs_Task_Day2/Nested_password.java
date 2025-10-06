package programs_Task_Day2;

public class Nested_password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String user_name="Pavi@123";
		String password="123@Pavi";
		
		if( user_name.equals("Pavi@123")) {
			if(password.equals("123@Pavi")) {
				System.out.println("Welcome User");
			}
			else {
				System.out.println("Please check the user name and password");
			}
		}
		else {
			System.out.println("please check the username and try ");
		}
	}

}
