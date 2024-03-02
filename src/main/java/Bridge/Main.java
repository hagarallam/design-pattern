package Bridge;

public class Main {

    public static void main(String[] args) {
        Shape shape1 = new Circle(new RedColor());
        shape1.shapeColor();
        Shape shape2 = new Square(new BlueColor());
        shape2.shapeColor();
    }
}
