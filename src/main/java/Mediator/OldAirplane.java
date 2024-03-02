package Mediator;

// Concrete COLLEAGUE
public class OldAirplane implements Airplane{

    private AirTrafficControl airTrafficControl;

    public OldAirplane(AirTrafficControl airTrafficControl) {
        this.airTrafficControl = airTrafficControl;
    }

    @Override
    public void requestTakeOff() {
        this.airTrafficControl.requestTakeOff(this);
    }

    @Override
    public void requestLanding() {
        this.airTrafficControl.requestLanding(this);
    }

    @Override
    public void notifyAirTrafficControl(String message) {
        System.out.println("Attention ::: -> " + message);
    }
}
