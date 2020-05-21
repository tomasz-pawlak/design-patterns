package order;

import notification.Observer;

public interface Observable {
     void registerObserver(Observer observer);
     void unregisterObserver(Observer observer);
     void notifyObserver();

}
