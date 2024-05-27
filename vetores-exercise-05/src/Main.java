import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        double maiorValor = 0;
        int posicaoMaiorValor = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
                posicaoMaiorValor = i;
            }
        }

        System.out.println();
        System.out.printf("MAIOR VALOR = %.1f%n", maiorValor);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicaoMaiorValor);
    }
}