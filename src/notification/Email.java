package notification;

import order.Order;

public class Email {

    public void getOrderStatus(Order order) {
        System.out.println("Email - Zmiana statusu zamowienia nr " + order.getOrderNumber() + "na " + order.getOrderStatus());
    }
}
