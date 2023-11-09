import Prototype.NetworkConnection;
import Strategy.ShoppingCart;
import Strategy.paymentStratagy.CreditCardPayment;
import Strategy.paymentStratagy.DebitCardPayment;
import Strategy.paymentStratagy.GooglePayPayment;
import Strategy.paymentStratagy.PaymentStrategy;
import builder.User;

public class Application {
	public static void main(String[] args) throws InterruptedException {
		
//		------Strategy design pattern--------

		PaymentStrategy creditCardPayment = new CreditCardPayment();
		ShoppingCart cart1 = new ShoppingCart(creditCardPayment);
		cart1.checkout(2000);
		
		PaymentStrategy debitCardPayment = new DebitCardPayment();
		ShoppingCart cart2 = new ShoppingCart(debitCardPayment);
		cart2.checkout(5000);
		
		PaymentStrategy googlePayPaymrnt = new GooglePayPayment();
		ShoppingCart cart3 = new ShoppingCart(googlePayPaymrnt);
		cart3.checkout(10000);
		
//		------Prototype design pattern--------

//		System.out.println("Creating obj using prototype design pattern");
//		
//		NetworkConnection networkConnection = new NetworkConnection();
//		networkConnection.setIp("192.168.01.01");
//		networkConnection.loadVeryImportantData();
//		
//		System.out.println(networkConnection);
//		
//		try {
//			NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();;
//			System.out.println(networkConnection2);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
//		------Builder design pattern--------

//		User user = new User.UserBuilder()
//				.setEmailId("parth@dev.in")
//				.setId("24")
//				.setUserName("Parth")
//				.Build();
//		
//		System.out.println(user);
		
//		------Abstract design pattern--------

//		Employee e1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
//		e1.name();
//		int sal1 = e1.Salary();
//		System.out.println(sal1);
//		
//		Employee e2 = EmployeeFactory.getEmployee(new WebDevFactory());
//		e2.name();
//		int sal2 = e2.Salary();
//		System.out.println(sal2);

//		------Factory design pattern--------

		// Employee employee = EmployeeFactory.getEmployee("fe");
		// int sal = employee.Salary();
		// System.out.println(sal);
		
		// Employee employee1 = EmployeeFactory.getEmployee("be");
		// int sal1 = employee1.Salary();
		// System.out.println(sal1);
		
//		------Observer design pattern--------

		// WeatherForecast Forecast = new WeatherForecast();

		// Display display1 = new Display("Display 1");
		// Display display2 = new Display("Display 2");

		// Forecast.addDisplay(display1);
		// Forecast.addDisplay(display2);

		// Forecast.setTemp(20.50);
		// Forecast.updateTemperature();

		// Forecast.setTemp(50.2);
		// Forecast.updateTemperature();

//		------Singleton design pattern--------
		
		// Singleton abc = Singleton.getInstance();
		// abc.setX(2);
		// System.out.println(abc.getX());

		// Singleton bca = Singleton.getInstance();
		// bca.setX(3);
		// System.out.println(bca.getX());
		// System.out.println(abc.getX());

		// System.out.println(abc == bca);

		// System.out.println("Hash code of object abc:" + abc.hashCode());
		// System.out.println("Hash code of object bca:" + bca.hashCode());

	}
}
