package Facade;

import java.util.List;

public class Order {

    private String id;
    private List<String> items;
    private double price ;

    private static int ORDER_COUNTER = 0 ;

    public Order(){
        this.id = ++ORDER_COUNTER +"-"+ this.hashCode();
    }
    public Order(List<String> items, double price) {
        this.id = ++ORDER_COUNTER +"-"+ this.hashCode();
        this.items = items;
        this.price = price;
    }

    public String getId() {
        return id;
    }


    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
