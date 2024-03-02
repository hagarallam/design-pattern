package composit;

public class Pen implements Product{

    private String color ;
    private double price;

    public Pen(String color, double price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public double calculatePrice() {
        return this.price+5;
    }
}
