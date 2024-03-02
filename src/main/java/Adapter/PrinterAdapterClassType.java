package Adapter;


// THIS IS THE ADAPTER OBJECT
// ( CLASS ADAPTER TYPE )

public class PrinterAdapterClassType extends OldPrinter implements Printer{
    @Override
    public void print(String word) {
        super.printWord(word);
    }
}
