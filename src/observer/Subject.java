package observer;

public interface Subject {

    void updateTemperature();

    void addDisplay(WeatherObserver display);

}
