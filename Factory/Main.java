package Factory;

public class Main {

    public static void main(String[] args) {
        OperatingSystemFactory osf = new OperatingSystemFactory() {};
        OS obj = osf.getInstance("Opens"); //Andriod
        obj.specs();

        OS obj1 = osf.getInstance("Close"); //iOS
        obj1.specs();

        OS obj2 = osf.getInstance("mmmm"); // WIndows
        obj2.specs();
    }
}
