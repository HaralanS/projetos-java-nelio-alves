package application;
import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;



public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        sc.nextLine();
        Pessoa[] vetor = new Pessoa[n];
        double sum = 0;
        double menores16 = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            sc.nextLine();
            vetor[i] = new Pessoa(name, age, height);
            sum += vetor[i].getHeight();
            menores16 += (vetor[i].getAge() < 16) ? 1 : 0;

        }
        System.out.println();

        double percent = 100 / vetor.length * menores16;

        System.out.printf("Altura media: %.2f%n", (sum / vetor.length));
        System.out.printf("Pessoas com menos de 16 anos: %.2f%n", percent);
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getAge() < 16) {
                System.out.println(vetor[i].getName());
            }
        }

    }
}
