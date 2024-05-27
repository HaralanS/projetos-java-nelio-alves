import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vetor = new double[n];
        double sum = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            sum += vetor[i];
        }
        System.out.println();
        System.out.print("VALORES =");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf(" %.1f", vetor[i]);
        }
        System.out.println();
        System.out.printf("SOMA = %.2f%n", sum);
        System.out.printf("MEDIA = %.2f%n", (sum / vetor.length));

    }
}