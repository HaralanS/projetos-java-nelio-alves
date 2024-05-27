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
        worker.setDepartment(department);

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
        sc.nextLine();


        for (int i = 0; i < nContracts; i++) {
            System.out.println("Enter contract #" + (i + 1) + " data:");
            DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.print("Date (DD/MM/YYYY): ");
            String dateInput = sc.nextLine();
            LocalDate localDate = LocalDate.parse(dateInput, fmt01);
            Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            sc.nextLine();
            HourContract contract = new HourContract(date, valuePerHour, hours);
            worker.addContract(contract);
        }


        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String dateInput = "01/" + sc.nextLine();
        LocalDate localDate = LocalDate.parse(dateInput, fmt01);
        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        int year = date.getYear();
        int month = date.getMonth();

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.printf("Income for " + dateInput + ": %.2f", worker.income(year, month));


//       DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        System.out.print("Date (DD/MM/YYYY): ");
//        String dateInput = sc.nextLine();
//        LocalDate localDate = LocalDate.parse(dateInput, fmt01);
//        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
//        contract.setDate(date);
//        System.out.print("Value per hour: ");
//        double valuePerHour = sc.nextDouble();
//        System.out.print("Duration (hours): ");
//        int hours = sc.nextInt();
//        contract.setValuePerHour(valuePerHour);
//        contract.setHours(hours);
//        sc.nextLine();
//        }
    }
}
