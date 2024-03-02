package Iterator;

public class Main {

    public static void main(String[] args) {
        Notification notification1 = new Notification("Notification 1", 10);
        Notification notification2 = new Notification("Notification 2", 15);
        Notification notification3 = new Notification("Notification 3", 20);
        Notification notification4 = new Notification("Notification 4", 30);
        Collection<Notification> notificationCollection = new NotificationCollection();
        notificationCollection.addObject(notification1);
        notificationCollection.addObject(notification2);
        notificationCollection.addObject(notification3);
        notificationCollection.addObject(notification4);
        Iterator<Notification> iterator = notificationCollection.createIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.getNext());
        }
    }
}
