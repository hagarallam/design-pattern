package Mediator;


// MEDIATOR
public interface AirTrafficControl {
    void requestTakeOff(Airplane airplane);
    void requestLanding(Airplane airplane);
}
