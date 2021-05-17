package Prototype;

public class GreenColor extends Color {

    public GreenColor() {
        this.colorName = "Green";
    }

    @Override
    void addColor() {
        System.out.println("Green color added");
    }
}
