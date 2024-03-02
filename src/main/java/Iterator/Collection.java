package Iterator;

public interface Collection<ObjectType> {


    Iterator<ObjectType> createIterator();

    void addObject(ObjectType object);
    void removeObject(ObjectType object);

}
