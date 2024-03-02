package Mediator;

public class NewAirplane implements Airplane{

    private AirTrafficControl airTrafficControl;

    public NewAirplane(AirTrafficControl airTrafficControl) {
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
        System.out.println("New News ----->>>>>>> "+message);
    }
}
