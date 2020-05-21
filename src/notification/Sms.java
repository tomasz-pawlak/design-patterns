package notification;

import order.Order;

public class Sms implements Observer{
    public void update(Order order) {
        System.out.println("Sms - Zmiana statusu zamowienia nr " + order.getOrderNumber() + "na " + order.getOrderStatus());
    }
}
