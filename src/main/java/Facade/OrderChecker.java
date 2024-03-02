package Facade;

import java.util.ArrayList;
import java.util.List;

public class OrderChecker {

    private static List<Order> orderList = new ArrayList<>();
    public static boolean checkIfOrderExists(String id){
        return orderList.stream().anyMatch(order -> order.getId().equals(id));
    }

    public void addOrder(Order order){
        orderList.add(order);
        System.out.println("Order Added");

    }

    public void removeOrder(Order order){
        orderList.remove(order);
        System.out.println("Order removed");
    }

    public static Order getOrder(String id){
        return orderList.stream().filter(order -> order.getId().equals(id)).findAny().get();
    }
}
