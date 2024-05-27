import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        int negativeNumbers = 0;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
                negativeNumbers += matriz[i][j] < 0 ? 1 : 0;
            }
        }

        System.out.println("Main diagonal:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println();
        System.out.println("Negative numbers = " + negativeNumbers);



    }
}