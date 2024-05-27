import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int nRows = sc.nextInt();
        int nCols = sc.nextInt();
        int[][] mat = new int[nRows][nCols];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
                
            }
        }
        int n = sc.nextInt();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == n) {
                    System.out.println("Position " + i + "," + j);
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if (j < nRows - 1) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if (i < nCols - 1) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    }

                }

            }
        }
        


    }
}