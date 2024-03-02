package Prototype;

import java.util.Objects;

public class Cat implements Animal{

    private String name ;
    private String sound ;
    private double speed ;

    public Cat(String name, String sound, double speed) {
        this.name = name;
        this.sound = sound;
        this.speed = speed;
    }

    @Override
    public Animal makeCopy() {
        Animal newAnimal ;
        try {
            newAnimal = (Animal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        return newAnimal;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", sound='" + sound + '\'' +
                ", speed=" + speed +
                '}';
    }
}
