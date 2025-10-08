package Demo;

//Abstract class
abstract class Payment {
	// Abstract method (no body)
	abstract void pay(int amount);

	// Concrete method
	void showPaymentGateway() {
		System.out.println("Using Secure Payment Gateway...");
	}
}

//Subclass 1
class CreditCardPayment extends Payment {
	@Override
	void pay(int amount) {
		System.out.println("Paid ₹" + amount + " using Credit Card.");
	}
}

//Subclass 2
class UPIPayment extends Payment {
	@Override
	void pay(int amount) {
		System.out.println("Paid ₹" + amount + " using UPI.");
	}
}

//Subclass 3
class CashPayment extends Payment {
	@Override
	void pay(int amount) {
		System.out.println("Paid ₹" + amount + " in Cash.");
	}
}

//Main class (save this file as AbstractionExample.java)
public class AbstractionExample {
	public static void main(String[] args) {
		Payment p1 = new CreditCardPayment();
		Payment p2 = new UPIPayment();
		Payment p3 = new CashPayment();
		p1.showPaymentGateway();
		p1.pay(500);

		p2.showPaymentGateway();
		p2.pay(1000);

		p3.showPaymentGateway();
		p3.pay(200);
	}
}
