package adapter;

public class WeatherServiceAdapterImpl implements WeatherServiceAdapter 
{
    WeatherService weatherService;
    public WeatherServiceAdapterImpl(WeatherService weatherService) {
        this.weatherService = weatherService;
    }
    @Override
    public float getTemperature() {
        return weatherService.temperature();
    }
    @Override
    public float getHumidity() {
        return weatherService.humidity();
    }
}