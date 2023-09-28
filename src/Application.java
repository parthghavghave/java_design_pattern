import Singleton.Singleton;
import observer.Display;
import observer.WeatherForecast;

public class Application {
	public static void main(String[] args) {

		WeatherForecast Forecast = new WeatherForecast();

		Display display1 = new Display("Display 1");
		Display display2 = new Display("Display 2");

		Forecast.addDisplay(display1);
		Forecast.addDisplay(display2);

		Forecast.setTemp(20.50);
		Forecast.updateTemperature();

		Forecast.setTemp(50.2);
		Forecast.updateTemperature();

//		Singleton design pattern
		
//		Singleton abc = Singleton.getInstance();
//		abc.setX(2);
//		System.out.println(abc.getX());
//
//		Singleton bca = Singleton.getInstance();
//		bca.setX(3);
//		System.out.println(bca.getX());
//		System.out.println(abc.getX());
//
//		System.out.println(abc == bca);
//
//		System.out.println("Hash code of object abc:" + abc.hashCode());
//		System.out.println("Hash code of object bca:" + bca.hashCode());

	}
}
