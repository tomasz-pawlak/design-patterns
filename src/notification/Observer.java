package notification;

import order.Order;

public interface Observer {

    public void update(Order order);
}
