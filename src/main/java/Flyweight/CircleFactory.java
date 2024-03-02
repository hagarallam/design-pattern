package Flyweight;

import java.util.HashMap;
import java.util.Objects;

public class CircleFactory {


    private static HashMap<ColorsEnum,Shape> shapes = new HashMap<>();

    static Shape getCircleInstance(ColorsEnum color,double radius){
        Circle circle = (Circle) shapes.get(color);
        if(Objects.isNull(circle)){
            circle = new Circle(color,radius);
            shapes.put(color,circle);
        }
        return circle;
    }

}
