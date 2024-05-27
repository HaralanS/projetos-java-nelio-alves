import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Locale.setDefault(Locale.US);
//        System.out.println("Programacao Orientada a Objetos - 01");

        System.out.println("Enter the measures of the triangle X:");
        double txa = sc.nextDouble();
        double txb = sc.nextDouble();
        double txc = sc.nextDouble();
        System.out.println("Enter the measures of the triangle Y:");
        double tya = sc.nextDouble();
        double tyb = sc.nextDouble();
        double tyc = sc.nextDouble();

        double px = (txa + txb + txc) / 2;
        double areaX = Math.sqrt(px * (px - txa) * (px - txb) * (px - txc));
        double py = (tya + tyb + tyc) / 2;
        double areaY = Math.sqrt(py * (py - tya) * (py - tyb) * (py - tyc));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);
        System.out.printf("Larger area: %.4f%n", ((areaX > areaY) ? areaX : areaY));

    }

}