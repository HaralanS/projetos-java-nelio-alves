package application;

import entities.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        student.name = sc.nextLine();
        student.nota1 = sc.nextDouble();
        student.nota2 = sc.nextDouble();
        student.nota3 = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
        if(student.finalGrade() < 60) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f%n", (60 - student.finalGrade()));
        } else {
            System.out.println("PASS");
        }
    }
}
