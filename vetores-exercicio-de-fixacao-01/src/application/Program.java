package application;

import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] rents = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Rent #" + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            if (rents[room] != null) {
                while (rents[room] != null) {
                    System.out.println("Quarto ocupado, selecione outro:");
                    System.out.print("Room: ");
                    room = sc.nextInt();
                }
            }

            sc.nextLine();
            rents[room] = new Rent(name, email, room);

        }

        System.out.println("Busy rooms:");
        for (int i = 0; i < rents.length; i++) {
            if (rents[i] != null) {
                System.out.println(rents[i]);

            }
        }

    }
}
