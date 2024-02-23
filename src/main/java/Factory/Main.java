package Factory;

public class Main {
    public static void main(String[] args) {

        Animal animal = AnimalFactory.getAnimal(AnimalEnum.CAT);
        System.out.println(animal.toString());

        Animal animal2 = AnimalFactory.getAnimal(AnimalEnum.DOG);
        System.out.println(animal2.toString());
    }
}
