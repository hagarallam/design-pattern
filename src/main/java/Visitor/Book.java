package Visitor;

public class Book implements Item{

    private String name ;
    private double price ;


    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double accept(PayCart payCart) {
        return payCart.visit(this);
    }
}
