package Prototype;

public class Prototype {

    public static void main(String[] args) throws CloneNotSupportedException {

        ColorStore.getColor("Red").addColor();
        ColorStore.getColor("Black").addColor();
        ColorStore.getColor("Green").addColor();
    }
}
