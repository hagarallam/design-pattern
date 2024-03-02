package Visitor;

public interface PayCart {
    double visit(Book book);
    double visit(Pen pen);
}
