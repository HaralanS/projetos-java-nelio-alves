package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double sum = 0;

        int n = sc.nextInt();
        sc.nextLine();

        Product[] listaProdutos = new Product[n];

        for (int i = 0; i < listaProdutos.length; i++) {
            String name = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();
            listaProdutos[i] = new Product(name, price);
        }
        for (int i = 0; i < listaProdutos.length; i++) {
            sum += listaProdutos[i].getPrice();
        }

        double average = sum / listaProdutos.length;
        System.out.printf("AVERAGE PRICE = %.2f", average);

    }
}
