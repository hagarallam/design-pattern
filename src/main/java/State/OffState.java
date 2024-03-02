package State;

public class OffState implements LightState{
    @Override
    public void turnOn() {
        System.out.println("Light is turned On !");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is already Off !");

    }
}
