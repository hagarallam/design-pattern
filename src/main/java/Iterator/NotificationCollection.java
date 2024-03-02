package Iterator;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class NotificationCollection implements Collection<Notification>{

    LinkedHashMap<String,Notification> notificationMap = new LinkedHashMap<>();


    @Override
    public void removeObject(Notification notification) {
        notificationMap.remove(notification.getName());

    }

    @Override
    public void addObject(Notification notification) {
        notificationMap.put(notification.getName(),notification);
    }


    @Override
    public Iterator createIterator() {
        return new NotificationIterator(notificationMap,this);
    }
}
