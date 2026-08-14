package exercicios.objetos.employee;

import java.util.Scanner;

import exercicios.objetos.employee.entities.Employee;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        Employee emp = new Employee();
        System.out.printf("Name: ");
        emp.name = scan.nextLine();
        System.out.printf("Gross Salary: ");
        emp.grossSalary = scan.nextDouble();
        System.out.printf("Tax (as a percentage): ");
        emp.taxPercentage = scan.nextDouble();

        System.out.println("Employee: " + emp.toString());
        System.out.println("Which percentage to increase salary? ");
        double percentage = scan.nextDouble();
        emp.increaseSalary(percentage);
        System.out.println("Updated data: " + emp.toString());

        scan.close();
    }
}
