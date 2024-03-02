package TemplateMethod;

public class GlassHouse extends HouseTemplate{


    @Override
    void buildWalls(){
        System.out.println("Glass Walls are Added !");
    }
    @Override
    void addWindows() {
        System.out.println("Glass Windows are Added !");
    }

    @Override
    void addColors() {
        System.out.println("Pink Color is Used !");
    }
}
