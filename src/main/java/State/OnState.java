package State;

public class OnState implements LightState{
    @Override
    public void turnOn() {
        System.out.println("Light already On !");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is turned Off !");
    }
}
