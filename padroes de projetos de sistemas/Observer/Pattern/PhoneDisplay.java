public class PhoneDisplay implements Observer{
    private int temp = 0;
    WeatherStation station;

    public PhoneDisplay(WeatherStation station) {
        this.station = station;
    }

    @Override
    public void update() {
        temp = station.getTemperature();
    }
}