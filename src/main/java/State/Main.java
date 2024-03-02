package State;

public class Main {

    public static void main(String[] args) {

        LightContext lightContext = new LightContext();

        lightContext.turnOn();
        lightContext.turnOff();
        lightContext.turnOff();
        lightContext.turnOn();
        lightContext.turnOff();
    }
}
