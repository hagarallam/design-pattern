package Visitor;

public class PayCartImpl implements PayCart{
    @Override
    public double visit(Book book) {
        return book.getPrice() + 10;
    }

    @Override
    public double visit(Pen pen) {
        return pen.getPrice() + 5;
    }
}
