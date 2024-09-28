package Program;

import Entities.Employee;
import Entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of emplyees: ");
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<Employee> employeesList = new ArrayList();

        for (int i = 0; i < n; i++) {
            System.out.print("Outsourced?: ");
            String outsourced = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            sc.nextLine();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            sc.nextLine();
            if (outsourced.equals("n")) {
                employeesList.add( new Employee(name, hours, valuePerHour));
            } else if (outsourced.equals("y")) {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                sc.nextLine();
                employeesList.add( new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            }
        }
        for (int i = 0; i < employeesList.size(); i++) {
            System.out.println(employeesList.get(i).getName() + " - $ " + String.format("%.2f", employeesList.get(i).payment()));
        }
    }
}