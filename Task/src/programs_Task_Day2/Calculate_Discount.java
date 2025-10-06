package programs_Task_Day2;

public class Calculate_Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int orginal_price=1000;
		int Discount;
		int total_amount;
		
		
		if(orginal_price>=500 && orginal_price<=1000) {
			
			
			Discount=20;
			total_amount=((Discount*orginal_price)/100);
			
			System.out.println("Discount Amount="+total_amount);
		}
		
		
		else if(orginal_price>1000 && orginal_price<=2000) {
			
			
			Discount=50;
			total_amount=((Discount*orginal_price)/100);
			
			System.out.println("Discount Amount="+total_amount);
		}
		
        else if(orginal_price>10000) {
			
			
			Discount=75;
			total_amount=((Discount*orginal_price)/100);
			
			System.out.println("Discount Amount="+total_amount);
		}

	}

}
