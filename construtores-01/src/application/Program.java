package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product tv = new Product(name, price, quantity);

        System.out.println("Product data: " + tv);
        System.out.print("Enter the number of products to be added in stock: ");
        tv.addProduct(sc.nextInt());
        System.out.println("Updated data: " + tv);
        System.out.print("Enter the number of products to be removed from stock: ");
        tv.removeProduct(sc.nextInt());
        System.out.println("Updated data: " + tv);
        System.out.println(tv);

    }

}
