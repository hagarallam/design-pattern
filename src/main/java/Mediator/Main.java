package Mediator;

public class Main {
    public static void main(String[] args) {

        AirTrafficControl airTrafficControl  = new AirportAirTrafficControl();

        Airplane airplane1 = new OldAirplane(airTrafficControl);
        Airplane airplane2 = new NewAirplane(airTrafficControl);


        airplane1.requestLanding();
        airplane2.requestTakeOff();


    }
}
