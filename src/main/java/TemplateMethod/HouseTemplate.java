package TemplateMethod;

public abstract class HouseTemplate {


    final void build(){
        buildWalls();
        addWindows();
        addDoors();
        addColors();
    }

    void buildWalls() {
        System.out.println("Welles are Added ");
    }
    void addDoors(){
        System.out.println("Wooden doors Added !");
    }

    abstract void addWindows() ;
    abstract void addColors();



}
