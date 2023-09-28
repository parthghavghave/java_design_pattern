package observer;

public class Display2 implements WeatherObserver{

    private double temperature;

    public double getTemperature() {
        return temperature;
    }

    @Override
    public void tempratureUpdated(double temperature) {

        this.temperature = temperature;
        System.out.println("Display2: "+ this.temperature);
    }
}
