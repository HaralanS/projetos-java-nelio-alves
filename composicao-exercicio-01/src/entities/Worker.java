package entities;

import enums.WorkerLevel;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Worker {

    Scanner sc = new Scanner(System.in);
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void addContract(HourContract contract) {
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print("Date (DD/MM/YYYY): ");
        String dateInput = sc.nextLine();
        LocalDate localDate = LocalDate.parse(dateInput, fmt01);
        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        contract.setDate(date);
        System.out.print("Value per hour: ");
        double valuePerHour = sc.nextDouble();
        System.out.print("Duration (hours): ");
        int hours = sc.nextInt();
        contract.setValuePerHour(valuePerHour);
        contract.setHours(hours);
        sc.nextLine();
    }

    @Override
    public String toString() {
        return "Worker{" +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
