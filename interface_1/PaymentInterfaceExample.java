package interface_1;

class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}
    class UpiPayment implements Payment {
        public void pay(double amount) {
            System.out.println("Paid ₹" + amount + " using UPI.");
        }
    }
    
    
public class PaymentInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payment p1 = new CreditCardPayment();
        p1.pay(1500);

        Payment p2 = new UpiPayment();
        p2.pay(500);

	}

}
