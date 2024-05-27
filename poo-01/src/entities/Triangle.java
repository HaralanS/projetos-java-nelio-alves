package entities;

import java.util.Scanner;

public class Triangle {

    Scanner sc = new Scanner(System.in);
    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double calcularAreaInput() {
        System.out.println("Digite os 3 lados do triangulo");
        this.a = sc.nextDouble();
        this.b = sc.nextDouble();
        this.c = sc.nextDouble();

        double px = (a + b + c) / 2;
        return Math.sqrt(px * (px - a) * (px - b) * (px - c));
    }

    public double calcularArea() {
        double px = (a + b + c) / 2;
        return Math.sqrt(px * (px - a) * (px - b) * (px - c));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
