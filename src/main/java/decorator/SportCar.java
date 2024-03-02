package decorator;

public class SportCar extends CarDecorator{
    public SportCar(Car car) {
        super(car);
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Sport car features Added");
    }
}
