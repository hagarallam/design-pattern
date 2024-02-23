package strategy;

public class CantFly implements Fly {
    @Override
    public String isFly() {
        return "Can not fly !!!";
    }
}
