package lld.observer_pattern;

public class TemperatureDisplay implements Observer{
    private String name;

    public TemperatureDisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature) {
        System.out.println(name + " received temperature update: " + temperature);
    }
}
