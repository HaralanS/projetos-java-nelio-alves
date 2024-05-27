import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter o vetor? ");
        int n = sc.nextInt();

        double[] vetorA = new double[n];
        double sum = 0;

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite um numero: ");
            vetorA[i] = sc.nextDouble();
            sum += vetorA[i];
        }

        System.out.printf("MEDIA DO VETOR = %.3f%n", (sum / vetorA.length));
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] < (sum / vetorA.length)) {
                System.out.printf("%.1f%n", vetorA[i]);
            }
        }



    }
}