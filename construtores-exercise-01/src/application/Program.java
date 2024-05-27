package application;

import entities.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int numeroDaConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String nomeUsuario = sc.nextLine();
        System.out.print("Is there a initial deposit (y/n)? ");
        String initialDeposit = sc.nextLine();
        while (!initialDeposit.equals("y") && !initialDeposit.equals("n")) {
            System.out.println("Invalid option. Try again.");
            System.out.print("Is there a initial deposit (y/n)? ");
            initialDeposit = sc.nextLine();
        }
        double saldo = 0;
        if (initialDeposit.equals("y")) {
            System.out.print("Enter initial deposit value: ");
            saldo = sc.nextDouble();
        }

        ContaBancaria conta = new ContaBancaria(numeroDaConta, nomeUsuario, saldo);

        System.out.println();

        System.out.println("Account data:");
        System.out.println(conta);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        conta.deposito(sc.nextDouble());
        System.out.println("Updated account data:");
        System.out.println(conta);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        conta.saque(sc.nextDouble());
        System.out.println("Updated account data:");
        System.out.println(conta);


    }
}
