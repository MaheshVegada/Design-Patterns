package Singleton;

public class AppConfig 
{
    private AppConfig() {}
    private static AppConfig obj = null;

    public static AppConfig getInstance() 
    {
        if (obj == null) {
            obj = new AppConfig();
        }
        System.out.println(obj);
        return obj;
    }
}
