package Momento;

public class Main {

    public static void main(String[] args) {
        Document document = new Document("New File : \n");
        document.write("Additional content \n");
        History history = new History();
        history.addMemento(document.createMemento());
        document.write("Change Content");
        history.addMemento(document.createMemento());
        document.restoreMemento(history.getDocumentMemento(0));
        System.out.println(document.getContent());
        System.out.println("----------------------------------------------------");
        document.restoreMemento(history.getDocumentMemento(1));
        System.out.println(document.getContent());

    }
}
