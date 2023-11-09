package Strategy.paymentStratagy;

public class DebitCardPayment implements PaymentStrategy{

	@Override
	public void pay(int amount) {
		System.out.println("Paying Rs."+amount+" with debit card.");
	}

}
