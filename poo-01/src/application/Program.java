package application;

import entities.Triangle;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle x = new Triangle();
        Triangle y = new Triangle();

        double areaX = x.calcularAreaInput();
        double areaY = y.calcularAreaInput();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);
        System.out.printf("Larger area: %.4f%n", Math.max(areaX, areaY));
        System.out.println(x);
        System.out.println(y);
    }
}
