package notification;

import order.Order;

public class Email implements Observer{

    public void update(Order order) {
        System.out.println("Email - Zmiana statusu zamowienia nr " + order.getOrderNumber() + "na " + order.getOrderStatus());
    }
}
