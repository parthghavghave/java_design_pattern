package observer;

import java.util.ArrayList;
import java.util.List;


public class WeatherForecast implements Subject{

    private Double temperature;

    List<WeatherObserver> display = new ArrayList<>();

    public void setTemp(Double temp) {
        this.temperature = temp;
    }

    @Override
    public void addDisplay(WeatherObserver display) {
        this.display.add(display);
    }
    @Override
    public void updateTemperature() {
        for (WeatherObserver display : this.display) {
            display.tempratureUpdated(this.temperature);
        }
        
    }

}
