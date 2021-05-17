package Observer;

public class Test {

    public static void main(String[] s) {
        Circle circle = new Circle(10, 10, 20);
        System.out.println("Created a circle: " + circle);
        circle.addObserver(new Canvas());
        circle.addObserver(new ShapeArchiver());
        System.out.println("Change radius to 50");
        circle.setRadius(50);
        System.out.println("Circle: " + circle);
    }
}
