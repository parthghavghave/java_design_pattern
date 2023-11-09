package Strategy.paymentStratagy;

public class CreditCardPayment implements PaymentStrategy{

	@Override
	public void pay(int amount) {
		System.out.println("Paying Rs."+amount+" with credit card.");
	}

}
