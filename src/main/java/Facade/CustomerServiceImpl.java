package Facade;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService{


    private OrderChecker orderChecker;

    public CustomerServiceImpl() {
        this.orderChecker = new OrderChecker();
    }

    @Override
    public void makeOrder(Order order) {
        if(!ItemChecker.checkIfAllItemExists(order.getItems())){
            ItemChecker.removeNonExistenceItem(order.getItems());
        }

        if(PriceCalculator.checkIfValidPurchase(order.getPrice())){
            System.out.println("Order with id "+ order.getId() +" Confirmed for items : ");
            order.getItems().stream().forEach(item -> System.out.println(item));
            orderChecker.addOrder(order);
            ItemChecker.removeItemFromStock(order.getItems());
            PriceCalculator.decreaseUserTotal(order.getPrice());
            return;
        }

        System.out.println("Can not make this order "+order.getId());

    }

    @Override
    public void cancelOrder(String id) {
        System.out.println("ORDER CANCEL");
        if(OrderChecker.checkIfOrderExists(id)){
            Order order = OrderChecker.getOrder(id);
            orderChecker.removeOrder(order);
            ItemChecker.returnItemToStock(order.getItems());
            PriceCalculator.increaseUserTotal(order.getPrice());
        }

    }
}
