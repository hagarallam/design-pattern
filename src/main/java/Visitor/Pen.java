package Visitor;

public class Pen implements Item{
    private String color ;
    private double price ;


    public Pen(String color, double price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double accept(PayCart payCart) {
        return payCart.visit(this);
    }
}
