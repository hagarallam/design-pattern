package composit;

public class Main {

    public static void main(String[] args) {
        Product pen1 = new Pen("red",5);
        Product pen2 = new Pen("blue",15);
        Product book1 = new Pen("12rr",50);

        Cart cart = new Cart();
        cart.addProduct(pen1);
        cart.addProduct(pen2);
        cart.addProduct(book1);

        System.out.println(cart.calculatePrice());

        System.out.println("---------------");

        cart.removeProduct(book1);
        System.out.println(cart.calculatePrice());

        System.out.println("---------------");

        cart.clearCart();
        System.out.println(cart.calculatePrice());

    }
}
