package Visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Book("Test",10));
        itemList.add(new Pen("red",10));
        itemList.add(new Book("work",10));
        PayCart payCart = new PayCartImpl();
        double total = 0 ;
        for (Item item: itemList) {
            total += item.accept(payCart);
        }
        System.out.println(total);
    }
}
