//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(33,55,6);
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        currentConditionsDisplay.observe();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        statisticsDisplay.observe();
        weatherData.notifyObservers();
        currentConditionsDisplay.display();
        statisticsDisplay.display();
        weatherData.measurementsChanged();
        currentConditionsDisplay.display();
        statisticsDisplay.display();
    }
}