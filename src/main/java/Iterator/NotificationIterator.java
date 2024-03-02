package Iterator;

import java.util.LinkedHashMap;

public class NotificationIterator implements Iterator<Notification>{


    private LinkedHashMap<String,Notification> notificationMap ;
    private Collection<Notification> collection;
    int index = 0;

    public NotificationIterator(LinkedHashMap<String, Notification> notificationMap,Collection<Notification> collection) {
        this.notificationMap = notificationMap;
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        if(notificationMap.isEmpty()){
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public Notification getNext() {
        String key = (String) notificationMap.keySet().toArray()[0];
        Notification notification = notificationMap.get(key);
        this.collection.removeObject(notification);
        return notification;
    }
}
