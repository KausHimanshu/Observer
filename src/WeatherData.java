import java.util.HashSet;
import java.util.Set;

public class WeatherData implements Subject{
    private Set<Observer> observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData(float temp, float humidity, float pressure){
        observers = new HashSet<Observer>();
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update();
        }
    }

    public float getTemperature(){
        return this.temp;
    }
    public float getHumidity(){
        return this.humidity;
    }
    public float getPressure(){
        return this.pressure;
    }

    public void measurementsChanged(){
        this.temp = 44;
        this.humidity = 65;
        this.pressure = 8;
        notifyObservers();
    }
}
