package observer;

public class Display implements WeatherObserver{

    private double temperature;
    private String DisplayName;

    public Display(String displayName) {
        DisplayName = displayName;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setDisplayName(String displayName) {
        DisplayName = displayName;
    }

    @Override
    public void tempratureUpdated(double temperature) {
        this.temperature = temperature;
        System.out.println(DisplayName+" : "+ this.temperature);
    }
}
