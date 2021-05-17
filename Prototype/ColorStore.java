package Prototype;

import java.util.HashMap;
import java.util.Map;

class ColorStore {

    private static Map<String, Color> colorMap = new HashMap<String, Color>();

    static {
        colorMap.put("Red", new RedColor());
        colorMap.put("Black", new BlackColor());
        colorMap.put("Green", new GreenColor());
    }

    public static Color getColor(String colorName) throws CloneNotSupportedException {
        return (Color) colorMap.get(colorName).clone();
    }
}
