package Prototype;

public class AnimalFactory {

    public static Animal getClone(Animal animal){
        return animal.makeCopy();
    }
}
