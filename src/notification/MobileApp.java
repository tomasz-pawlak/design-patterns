package notification;

import order.Order;

public class MobileApp {
    public void getOrderStatus(Order order) {
        System.out.println("MobileApp - Zmiana statusu zamowienia nr " + order.getOrderNumber() + "na " + order.getOrderStatus());
    }
}
