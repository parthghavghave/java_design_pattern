import observer.Display;
import observer.Display2;
import observer.WeatherForecast;

public class Main {
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



//        int a = 3;
//        int b = 2;
//
//        System.out.println("div: "+clacabstract.div(a,b));
//
//        calc calcy = new calc();
//
//        System.out.println("add: "+calcy.add(a,b));
//        System.out.println("sub: "+calcy.sub(a,b));
//        System.out.println("mul: "+calcy.mul(a,b));
//
//        advanceCalc advancecalcy = new advanceCalc();
//
//        System.out.println("Mod: "+advancecalcy.mod(a,b));
//
//        Singleton abc = Singleton.getInstance();
//        abc.setX(2);
//        System.out.println(abc.getX());
//
//        Singleton bca = Singleton.getInstance();
//        bca.setX(3);
//        System.out.println(bca.getX());
//        System.out.println(abc.getX());
//
//        System.out.println(abc == bca);

    }
}

