package strategy;

public class Main {


    public static void main(String[] args) {
        Animal cat1 = new Cat();
        Animal bird1 = new Bird();

//        System.out.println(cat1.canAnimalFly());
//        System.out.println(bird1.canAnimalFly());

        System.out.println(cat1.isFly(new CantFly()));
        System.out.println(bird1.isFly(new CanFly()));
    }
}
