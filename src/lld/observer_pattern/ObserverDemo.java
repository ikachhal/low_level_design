package lld.observer_pattern;

public class ObserverDemo {
    public static void run() {
        WeatherStation weatherStation = new WeatherStation();
        TemperatureDisplay display1 = new TemperatureDisplay("Display 1");
        TemperatureDisplay display2 = new TemperatureDisplay("Display 2");

        weatherStation.registerObserver(display1);
        weatherStation.registerObserver(display2);

        weatherStation.setTemperature(25.0f);
        weatherStation.setTemperature(30.0f);

        weatherStation.removeObserver(display1);

        weatherStation.setTemperature(35.0f);
    }
}
