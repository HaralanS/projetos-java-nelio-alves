package Program;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import enums.WorkerLevel;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Department department = new Department();

        System.out.print("Enter department's name: ");
        department.setName(sc.nextLine());

        Worker worker = new Worker();

        System.out.println("Enter worker data:");

        System.out.print("Name: ");
        worker.setName(sc.nextLine());

//        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.print("Level: ");
        WorkerLevel level = WorkerLevel.valueOf(sc.nextLine());
        worker.setLevel(level);

        System.out.print("Base salary: ");
        worker.setBaseSalary(sc.nextDouble());

        System.out.print("How many contracts to this worker? ");
        int nContracts = sc.nextInt();

        HourContract[] contracts = new HourContract[nContracts];

        for (int i = 0; i < contracts.length; i++) {
            System.out.println("Enter contract #" + (i + 1) + " data:");
            contracts[i] = new HourContract();
            worker.addContract(contracts[i]);
        }


        sc.nextLine();
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String dateInput = "01/" + sc.nextLine();
        LocalDate localDate = LocalDate.parse(dateInput, fmt01);
        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        double income = worker.getBaseSalary();
        for (int i = 0; i < contracts.length; i++) {

            if (date.getMonth() == contracts[i].getDate().getMonth()) {
                income += contracts[i].totalValue();
            }


        }


        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + department.getName());
        System.out.printf("Income for " + dateInput + ": %.2f", income);


//        ------------------------------------------
//        System.out.println(worker);
//        System.out.println(department);
//        System.out.println();
//
//        for (int i = 0; i < contracts.length; i++) {
//            System.out.println(contracts[i]);
//        }
    }
}
