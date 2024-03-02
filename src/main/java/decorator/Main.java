package decorator;

public class Main {
    public static void main(String[] args) {
        Car car = new SportCar(new OldCar(new BasicCar()));
        car.describe();
    }
}
