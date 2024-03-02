package decorator;

public class OldCar extends CarDecorator{
    public OldCar(Car car) {
        super(car);
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Old car features Added ");

    }
}
