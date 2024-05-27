import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

//        String nome = "Haralan";
//        double number = 19.994125454;
//        System.out.print("E dai meu");
//        System.out.println(" Tudo certo?");
//        System.out.println("Claro " + nome);
//        System.out.printf("%.2f%n", number);

//        System.out.printf("Digite o seu nome: ");
//        String userName = sc.nextLine();
//        System.out.println("*************");
//        System.out.println("Boa noite senhor " + nome);
//        System.out.printf("O numero double em questao eh o  %.2f%n", number);
//        Math.abs(-5);  <-- valor absoluto, transforma negativo em positivo

        String continuar = "s";
        while (continuar.equals("s")) {
            somar();

            System.out.println("Bem vindo a Calculadora Basica Java");
            System.out.println("*-*-*-*--*-*-*-*-*-*-*");
            System.out.printf("Digite o primeiro numero da operacao: ");
            double firstNumber = sc.nextDouble();
            System.out.printf("Digite o primeiro segundo da operacao: ");
            double secondNumber = sc.nextDouble();
            sc.nextLine();
            System.out.printf("Digite o operador matematico (+ - * / exp raiz): ");
            String operador = sc.nextLine();
            System.out.println("\n*-*-*-*--*-*-*-*-*-*-*");
            switch (operador) {
                case "+":
                    System.out.println("Resultado da soma: " + (firstNumber + secondNumber));
                    continuar = "n";
                    break;
                case "-":
                    System.out.println("Resultado da subtracao: " + (firstNumber - secondNumber));
                    continuar = "n";
                    break;
                case "*":
                    System.out.println("Resultado da multiplicacao: " + (firstNumber * secondNumber));
                    continuar = "n";
                    break;
                case "/":
                    System.out.println("Resultado da divisao: " + (firstNumber / secondNumber));
                    continuar = "n";
                    break;
                case "exp":
                    System.out.println("Resultado da exponenciacao: " + (Math.pow(firstNumber, secondNumber)));
                    continuar = "n";
                    break;
                case "raiz":
                    System.out.println("Resultado da raiz quadrada: " + Math.sqrt(firstNumber) + " e " + Math.sqrt(secondNumber));
                    continuar = "n";
                    break;
                default:
                    System.out.println("Operador invalido");
                    break;
            }
                    System.out.printf("Se quizer tentar novamento digite s, ou qualquer tecla para sair: ");
                    continuar = sc.nextLine();

        }


            sc.close();

    }

    static void somar() {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("O resultado da soma de " + n1 + " e " + n2 + " eh igual a : " + (n1 + n2));
        sc.nextLine();
        sc.close();
    }
}