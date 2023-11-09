package Strategy.paymentStratagy;

public class GooglePayPayment implements PaymentStrategy{

	@Override
	public void pay(int amount) {
		System.out.println("Paying Rs."+amount+" with google pay.");
	}

}
