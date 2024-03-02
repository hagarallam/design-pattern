package decorator;

public class BasicCar implements Car{
    @Override
    public void describe() {
        System.out.println("Normal Basic car ");
    }
}
