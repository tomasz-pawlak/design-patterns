package notification;

import order.Order;

public class Sms {
    public void getOrderStatus(Order order) {
        System.out.println("Sms - Zmiana statusu zamowienia nr " + order.getOrderNumber() + "na " + order.getOrderStatus());
    }
}
