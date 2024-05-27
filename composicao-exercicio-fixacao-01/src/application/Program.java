package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
//        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat fmt2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDate = sc.nextLine();
        System.out.println();
        Client client = new Client(name, email, fmt.parse(birthDate));

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());
        System.out.print("How many items to this order? ");
        int nItems = sc.nextInt();
        sc.nextLine();
        Order order = new Order(status, client);

        for (int i = 0; i < nItems; i++) {
            System.out.println("Enter #" + (i + 1) + " item data:");
            System.out.print("Product name: ");
            String pName = sc.nextLine();
            System.out.print("Product price: ");
            double pPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int pQuantity = sc.nextInt();
            sc.nextLine();

            Product product = new Product(pName, pPrice);
            OrderItem orderItem = new OrderItem(pQuantity, product);
            order.addItem(orderItem);

        }

        System.out.println();

        System.out.println(order);

    }
}
