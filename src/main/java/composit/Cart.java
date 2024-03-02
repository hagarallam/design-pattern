package composit;

import java.util.ArrayList;
import java.util.List;

public class Cart implements Product {

    private List<Product> products;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public void clearCart(){
        this.products.clear();
    }
    @Override
    public double calculatePrice() {
       double totalPrice = 0;
       for (Product product : products){
           totalPrice += product.calculatePrice();
       }
       return totalPrice;
    }
}
