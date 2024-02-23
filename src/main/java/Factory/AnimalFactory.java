package Factory;

public class AnimalFactory {

    public static Animal getAnimal(AnimalEnum animalEnum){

        switch (animalEnum.getType()){
            case "CAT":
                return new Cat();
            case "DOG" :
                return new Dog();
            default:
                return null ;
        }

    }
}
