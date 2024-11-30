package finalprojecta;

import java.util.LinkedList;

public class OrderManagement {
    private LinkedList<Order> orders;

    public OrderManagement() {
        orders = new LinkedList<>();
    }

    public void createOrder(Order order) {
        orders.add(order);
    }

    public void updateOrderStatus(int orderId, String status) {
        for (Order order : orders) {
            if (order.getOrderId() == orderId) {
                order.setStatus(status);
                break;
            }
        }
    }

    public LinkedList<Order> viewOrders() {
        return new LinkedList<>(orders);
    }
}
