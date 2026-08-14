package exercicios.objetos.employee.entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double taxPercentage;

    public double netSalary() {
        return grossSalary - (taxPercentage / 100 * grossSalary);
    }

    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * (percentage / 100);
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", netSalary());
    }
}
