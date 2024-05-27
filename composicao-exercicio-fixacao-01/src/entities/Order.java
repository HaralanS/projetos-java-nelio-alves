package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private static SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
    private static SimpleDateFormat fmt2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatus status;
    private List<OrderItem> orderItems = new ArrayList<>();

    private Client client;

    public Order(OrderStatus status, Client client) {
        this.client = client;
        this.moment = new Date();
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item) {
        orderItems.add(item);
    }
    public void removeItem(OrderItem item) {
        orderItems.remove(item);
    }

    public Double total() {
        Double total = 0.0;
        for (OrderItem order: orderItems) {
            total += order.subTotal();
        }

        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY:\n");
        sb.append("Order moment: " + fmt2.format(moment) + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append("Client: " + client.getName());
        sb.append(" (" + fmt.format(client.getBirthDate()) + ") - ");
        sb.append(client.getEmail() + "\n");
        sb.append("Order items: \n");
        Double sum = 0.0;
        for (OrderItem oItem: orderItems) {
            sb.append(oItem.getProduct().getName() + ", $" + String.format("%.2f", oItem.getProduct().getPrice()));
            sb.append(", Quantity: " + oItem.getQuantity());
            sb.append(", Subtotal: $" + String.format("%.2f", oItem.subTotal()));
            sb.append("\n");
            sum += oItem.subTotal();
        }
        sb.append("Total price: $" + String.format("%.2f", sum));

        return sb.toString();
    }
}
