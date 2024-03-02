package TemplateMethod;

public class Main {
    public static void main(String[] args) {

        HouseTemplate woodenHouse = new WoodenHouse();
        woodenHouse.build();
        System.out.println("---------------------------------");
        HouseTemplate glassHouse = new GlassHouse();
        glassHouse.build();
    }
}
