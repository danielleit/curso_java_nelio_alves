package exercicios.enumeracoes.fazerpedido.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import exercicios.enumeracoes.fazerpedido.entities.enums.OrderStatus;

public class Order {
    private Date moment;
    private OrderStatus status;
    private List<OrderItem> items = new ArrayList<>();
    private Client client;
    
    public void addItem(OrderItem item) {
        this.items.add(item);
    }

    public void removeItem(OrderItem item) {
        this.items.remove(item);
    }

    public Double total() {
        Double total = 0.0;
        
        for(OrderItem item : items) {
            total += item.subTotal();
        }

        return total;
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return this.moment;
    }

    public OrderStatus getStatus() {
        return this.status;
    }

    public List<OrderItem> getItems() {
        return this.items;
    } 
}
