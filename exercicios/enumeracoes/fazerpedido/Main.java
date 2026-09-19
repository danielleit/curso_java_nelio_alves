package exercicios.enumeracoes.fazerpedido;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import exercicios.enumeracoes.fazerpedido.entities.Client;
import exercicios.enumeracoes.fazerpedido.entities.Order;
import exercicios.enumeracoes.fazerpedido.entities.OrderItem;
import exercicios.enumeracoes.fazerpedido.entities.Product;
import exercicios.enumeracoes.fazerpedido.entities.enums.OrderStatus;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.printf("Name: ");
        String name = sc.nextLine();
        System.out.printf("Email: ");
        String email = sc.nextLine();   
        System.out.printf("Birth date (DD/MM/YYYY): ");
        Date birthDate = null;
        try {
            birthDate = sdf.parse(sc.nextLine()); 
        } catch (Exception e) {
            System.out.println("Invalid date format. Please use DD/MM/YYYY.");
            sc.close();
            throw new RuntimeException(e);
        }
        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());

        Order order = new Order(new Date(), status, client);

        System.out.println("How many items to this order? ");
        int n = sc.nextInt();   
        for(int i = 0; i < n; i++) {
            System.out.println("Enter #" + (i + 1) + " item data:");
            System.out.printf("Product name: ");
            String productName = sc.nextLine();
            sc.nextLine(); // Consume the remaining newline
            System.out.printf("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.printf("Quantity: ");
            int quantity = sc.nextInt();
            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(quantity, productPrice, product);
            order.addItem(orderItem);
        }

        System.out.println("ORDER SUMMARY: ");
        System.out.printf("Order moment: %s%n", sdf.format(order.getMoment()));
        System.out.printf("Order status: %s%n", order.getStatus());
        System.out.printf("Client: %s (%s) - %s%n", client.getName(), sdf.format(client.getBirthDate()), client.getEmail());
        System.out.println("Order items: ");
        for(OrderItem item : order.getItems()) {
            System.out.printf("%s, $%.2f, Quantity: %d, Subtotal: $%.2f%n", item.getProduct().getName(), item.getProduct().getPrice(), item.getQuantity(), item.subTotal());
        }
        System.out.printf("Total price: $%.2f%n", order.total());
        
        sc.close();
    }
}
