package Adapter;

// THIS IS THE ADAPTER OBJECT
public class PrinterAdapter implements Printer {

    // ( OBJECT ADAPTER TYPE )
    private OldPrinter printer;

    public PrinterAdapter(OldPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void print(String word) {
        printer.printWord(word);
    }
}
