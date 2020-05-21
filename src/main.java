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

        email.getOrderStatus(order);
        mobileApp.getOrderStatus(order);
        sms.getOrderStatus(order);

    }
}
