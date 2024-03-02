package Prototype;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat("ketty","meow",50);

        Animal animal2 = AnimalFactory.getClone(animal);

        System.out.println(animal);
        System.out.println(animal2);

        System.out.println(animal.hashCode());
        System.out.println(animal2.hashCode());

    }
}
