package Adapter;

// THIS IS THE CLIENT OBJECT
public class Main {
    public static void main(String[] args) {
        // Object Adapter Type
        OldPrinter oldPrinter = new OldPrinter();
        Printer printer = new PrinterAdapter(oldPrinter);
        printer.print("Hagar");

        // Class Adapter Type
        Printer printer2 = new PrinterAdapterClassType();
        printer2.print("Khaled");

    }
}
