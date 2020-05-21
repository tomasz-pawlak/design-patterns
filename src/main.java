import notification.Email;
import notification.MobileApp;
import notification.Sms;
import order.Order;
import order.OrderStatus;

public class main {
    public static void main(String[] args) {
        Order order = new Order(12L, OrderStatus.ODEBRANE);

        Email email = new Email();
        MobileApp mobileApp = new MobileApp();
        Sms sms = new Sms();

        order.registerObserver(email);
        order.registerObserver(mobileApp);
        order.registerObserver(sms);

        order.notifyObserver();

        System.out.println("------------------");

        order.unregisterObserver(email);

        order.changeOrderStatus(OrderStatus.WYSLANE);
//        order.notifyObserver();

    }
}
