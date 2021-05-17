package Singleton;

public class Main {

    public static void main(String[] args) {
        AppConfig obj1 = AppConfig.getInstance();
        AppConfig obj2 = AppConfig.getInstance();
    }
}
