import java.util.ArrayList;

public class WeatherStation implements Observable {
    private ArrayList<Observer> observers = new ArrayList<>();
    private int temperature = 0;
    @Override
    public void add(Observer o) {
        observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifying() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update();
        }
    }

    public int getTemperature() {
        return temperature;
    }
}