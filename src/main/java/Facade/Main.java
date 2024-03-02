package Facade;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Order order = new Order();
        order.setPrice(50);
        order.setItems(new ArrayList<>(List.of(new String[]{"BOOK", "PEN"})));
        CustomerService customerService = new CustomerServiceImpl();
        customerService.makeOrder(order);


        customerService.cancelOrder(order.getId());
    }
}
