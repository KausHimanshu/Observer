public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;
    private float temperature;
    private float humidity;
    private float pressure;
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }
    @Override
    public void display() {
        System.out.println("Current Conditions Display");
        System.out.println("Temperature: " + temperature);
        System.out.println("Humidity: " + humidity);
        System.out.println("Pressure: " + pressure);
    }

    @Override
    public void update() {
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        this.temperature = weatherData.getTemperature();
    }

    public void observe() {
        weatherData.registerObserver(this);
    }
    public void unobserve() {
        weatherData.removeObserver(this);
    }
}
