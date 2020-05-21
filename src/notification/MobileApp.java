package notification;

import order.Order;

public class MobileApp implements Observer{
    public void update(Order order) {
        System.out.println("MobileApp - Zmiana statusu zamowienia nr " + order.getOrderNumber() + "na " + order.getOrderStatus());
    }
}
