package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoa serao digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();

        Person[] persons = new Person[n];

        double lowestHeight = 0;
        double greaterHeight = 0;
        double averageWomanHeight = 0;
        double womenHeightSum = 0;
        int womenCount = 0;
        int menCount = 0;

        for (int i = 0; i < persons.length; i++) {
            System.out.print("Altura da 1a pessoa: ");
            double height = sc.nextDouble();
            sc.nextLine();
            System.out.print("Genero da 1a pessoa: ");
            char genre = sc.next().charAt(0);
            sc.nextLine();
            persons[i] = new Person(height, genre);
            lowestHeight = lowestHeight == 0 ? persons[i].getHeight() : lowestHeight;
            lowestHeight = Math.min(lowestHeight, persons[i].getHeight());
            greaterHeight = Math.max(greaterHeight, persons[i].getHeight());
            menCount += persons[i].getGenre() == 'm' ? 1 : 0;
            if (persons[i].getGenre() == 'f') {
                womenCount++;
                womenHeightSum += persons[i].getHeight();
            }
        }

        averageWomanHeight = (double) womenHeightSum / womenCount;

        System.out.printf("Menor altura = %.2f%n", lowestHeight);
        System.out.printf("Maior altura = %.2f%n", greaterHeight);
        System.out.printf("Media das alturas das mulheres = %.2f%n", averageWomanHeight);
        System.out.println("Numero de homens = " + menCount);
    }
}
