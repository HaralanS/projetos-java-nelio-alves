package entities;

import enums.WorkerLevel;


import java.util.ArrayList;

import java.util.List;


public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;

    private List<HourContract> contracts = new ArrayList<>();


// GETTERS SETTERS
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

    public Department getDepartment() {
        return department;
    }



    public void setDepartment(Department department) {
        this.department = department;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }
    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }
    public double income(int year, int month) {
        double sum = baseSalary;
        for(HourContract c: contracts) {
            if (c.getDate().getYear() == year && c.getDate().getMonth() == month) {
                sum += c.totalValue();
            }

        }
        return sum;
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
