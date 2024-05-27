package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Emplyoee #" + (i + 1) + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            if(hasId(employees, id)){
                while (hasId(employees, id)) {
                    System.out.println("Este id ja existe. Tente outro.");
                    System.out.print("Id: ");
                    id = sc.nextInt();
                }
            }
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            employees.add(new Employee(id, name, salary));
        }
        System.out.println();
        System.out.print("Enter the employee id that will have salary increase : ");
        int idToIncreaseSalary = sc.nextInt();
        Integer indexToChange = null;

        if (!hasId(employees, idToIncreaseSalary)) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            Employee emp = employees.stream().filter(x -> x.getId() == idToIncreaseSalary).findFirst().orElse(null);

            emp.increaseSalary(percentage);
            System.out.println();
        }

        System.out.println("List of employees:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

    }
    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
