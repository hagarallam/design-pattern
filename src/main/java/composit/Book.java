package composit;

public class Book implements Product{

    private String isbn ;
    private double price;

    public Book(String isbn, double price) {
        this.isbn = isbn;
        this.price = price;
    }

    @Override
    public double calculatePrice() {
        return this.price+10;
    }
}
