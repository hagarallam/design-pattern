package Factory;


public enum AnimalEnum {
    DOG("DOG"),
    CAT("CAT") ;

    AnimalEnum(String type) {
        this.type = type;
    }

    private String type ;

    public String getType() {
        return type;
    }
}
