package Momento;


// Originator
public class Document {

    private String content ;

    public Document(String content) {
        this.content = content;
    }

    public void write(String content){
        this.content+=content;
    }

    public String getContent() {
        return content;
    }


    public DocumentMemento createMemento(){
        return new DocumentMemento(this.content);
    }

    public void restoreMemento(DocumentMemento documentMemento){
        this.content = documentMemento.getContent();
    }
}
