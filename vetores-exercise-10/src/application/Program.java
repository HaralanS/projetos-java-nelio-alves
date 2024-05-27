package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //    PROBLEMA APROVADOS
        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[n];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
            String name = sc.nextLine();
            double grade1 = sc.nextDouble();
            double grade2 = sc.nextDouble();
            sc.nextLine();
            students[i] = new Student(name, grade1, grade2);
        }

        System.out.println("Alunos aprovados:");
        for (int i = 0; i < students.length; i++) {
            if ((students[i].getGrade1() + students[i].getGrade2()) / 2 >= 6) {
                System.out.println(students[i].getName());
            }
        }

    }
}
