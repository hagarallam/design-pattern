package strategy;

public class Animal {


    private String name ;
    private double speed ;

    //private Fly fly;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    /* NOT BEST PRACTICE */
//    public String canAnimalFly() {
//        return fly.isFly();
//    }
//
//    public void setFly(Fly fly) {
//        this.fly = fly;
//    }


    public String isFly(Fly fly){
        return fly.isFly();
    }
}
