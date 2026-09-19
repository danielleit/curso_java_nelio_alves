package exercicios.enumeracoes.fazerpedido.entities;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product product;

    public Double subTotal() {
        return this.price * quantity;
    }

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Product getProduct() {
        return this.product;
    }

    public Integer getQuantity() {
        return this.quantity;
    }
    
}
