package Facade;

public interface CustomerService {
    void makeOrder(Order order);
    void cancelOrder(String id);

}
