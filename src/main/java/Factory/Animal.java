package Factory;

public abstract class Animal {

    private String name ;
    private double speed ;

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
