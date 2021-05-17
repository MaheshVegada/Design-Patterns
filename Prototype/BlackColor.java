package Prototype;

public class BlackColor extends Color {

    public BlackColor() {
        this.colorName = "Black";
    }

    @Override
    void addColor() {
        System.out.println("Black color added");
    }
}
