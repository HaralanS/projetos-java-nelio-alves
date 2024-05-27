import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];

        int nPares = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();

            nPares += ((double)vetor[i] % 2.0 == 0) ? 1 : 0;
        }
        System.out.println();
        System.out.println("NUMEROS PARES:");
        for (int i = 0; i < vetor.length; i++) {
            if ((double)vetor[i] % 2.0 == 0) {
                System.out.print(vetor[i] + " ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + nPares);
    }
}