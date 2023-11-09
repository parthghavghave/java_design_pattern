import Prototype.NetworkConnection;
import builder.User;

public class Application {
	public static void main(String[] args) {
		
//		------Prototype design pattern--------

		System.out.println("Creating obj using prototype design pattern");
		
		NetworkConnection networkConnection = new NetworkConnection();
		networkConnection.setIp("192.168.01.01");
		networkConnection.loadVeryImportantData();
		
		
		
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
