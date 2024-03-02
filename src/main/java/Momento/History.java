package Momento;


import java.util.ArrayList;
import java.util.List;

// CareTaker
public class History {

    List<DocumentMemento> documentMementos ;

    public History() {
        documentMementos = new ArrayList<>();
    }

    public void addMemento(DocumentMemento documentMemento){
        this.documentMementos.add(documentMemento);
    }

    public DocumentMemento getDocumentMemento(int index){
        return this.documentMementos.get(index);
    }
}
