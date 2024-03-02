package State;

public class LightContext {


    private LightState lightState;
    private LightState onState;
    private LightState offState ;


    public LightContext() {
        offState = new OffState();
        onState = new OnState();
        this.lightState = offState;
    }

    void turnOn(){
        lightState.turnOn();
        setLightState(onState);
    }

    void turnOff(){
        lightState.turnOff();
        setLightState(offState);

    }

    public LightState getLightState() {
        return lightState;
    }

    public void setLightState(LightState lightState) {
        this.lightState = lightState;
    }
}
