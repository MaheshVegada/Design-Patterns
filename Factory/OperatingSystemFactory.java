package Factory;

public class OperatingSystemFactory {

    public OS getInstance(String str) {
        if (str.equals("Opens")) {
            return new Andriod();
        } else if (str.equals("Close")) {
            return new iOS();
        } else {
            return new Windows();
        }
    }
}
