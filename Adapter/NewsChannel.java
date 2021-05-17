package adapter;

public class NewsChannel 
{
    public static void main(String[] args) {
        WeatherServiceAdapter weatherService=new WeatherServiceAdapterImpl(new WeatherServiceImpl());
        System.out.println("Temperature = "+weatherService.getTemperature());
        System.out.println("Humidity = "+weatherService.getHumidity());
    }
}