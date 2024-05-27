import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        int nPares = 0;
        int somaPares = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();

            nPares += ((double)vetor[i] % 2.0 == 0) ? 1 : 0;
            somaPares += ((double)vetor[i] % 2.0 == 0) ? vetor[i] : 0;
        }

        if (nPares > 0) {
            System.out.printf("MEDIA DOS PARES = %.1f", ((double)somaPares / nPares));
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }

    }
}