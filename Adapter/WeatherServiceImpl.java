package Adapter;

public class WeatherServiceImpl implements WeatherService
{
    @Override
    public float temperature(){
        return 15.5f;
    }
    @Override
    public float humidity(){
        return 65.8f;
    }
}