import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorC = new int[n];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite um numero: ");
            vetorA[i] = sc.nextInt();
        }
        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("Digite um numero: ");
            vetorB[i] = sc.nextInt();
        }

        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }
        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.println(vetorC[i]);

        }


    }
}