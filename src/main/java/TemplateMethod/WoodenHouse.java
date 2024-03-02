package TemplateMethod;

public class WoodenHouse extends HouseTemplate{


    @Override
    void addWindows() {
        System.out.println("Simple Wooden Windows are Added !");
    }

    @Override
    void addColors() {
        System.out.println("White Color is Used !");
    }
}
