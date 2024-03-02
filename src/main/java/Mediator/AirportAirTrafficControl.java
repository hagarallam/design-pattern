package Mediator;


// Concrete MEDIATOR
public class AirportAirTrafficControl implements AirTrafficControl{

    @Override
    public void requestTakeOff(Airplane airplane) {
        airplane.notifyAirTrafficControl("Take Off Request is Done !");
    }

    @Override
    public void requestLanding(Airplane airplane) {
        airplane.notifyAirTrafficControl("Landing Request is Done !");
    }
}
