package applications;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        int[] ages = new int[n];

        int maiorIdade = 0;
        String pessoaMaisVelha = "";


        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            names[i] = sc.nextLine();
            System.out.print("Idade: ");
            ages[i] = sc.nextInt();
            sc.nextLine();
            if(maiorIdade < ages[i]) {
                maiorIdade = ages[i];
                pessoaMaisVelha = names[i];
            }
        }
//        System.out.println(maiorIdade);
        System.out.println("PESSOA MAIS VELHA: " + pessoaMaisVelha);
    }

}
