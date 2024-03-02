package Flyweight;

public class Circle implements Shape{


    private ColorsEnum color ;
    private double radius ;

    public Circle(ColorsEnum color, double radius) {
        this.color = color;
        this.radius = radius;
    }



    @Override
    public void draw() {
        System.out.println("New Circle with a " +toString());
    }

    @Override
    public String toString() {
        return "{" +
                "color=" + color +
                ", radius=" + radius +
                '}';
    }
}
