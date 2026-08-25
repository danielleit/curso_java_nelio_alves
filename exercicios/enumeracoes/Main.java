package exercicios.enumeracoes;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import exercicios.enumeracoes.entities.Department;
import exercicios.enumeracoes.entities.HourContract;
import exercicios.enumeracoes.entities.Worker;
import exercicios.enumeracoes.entities.enums.WorkerLevel;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner (System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = scan.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = scan.nextLine();
        System.out.print("Lever: ");
        String workerLevel = scan.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = scan.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker? ");
        int numberOfContracts = scan.nextInt();

        for(int i = 0; i < numberOfContracts; i++){
            System.out.println("Enter contract #" + (i+1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(scan.next());
            System.out.print("Value per hour: ");
            Double contractValue = scan.nextDouble();
            System.out.print("Duration (hours): ");
            int contractDuration = scan.nextInt();

            HourContract hourContract = new HourContract(contractDate, contractValue, contractDuration);

            worker.addContract(hourContract);
        }

        System.out.printf("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYEar = scan.next();
        int month = Integer.parseInt(monthAndYEar.substring(0, 2));
        int year = Integer.parseInt(monthAndYEar.substring(3));

        System.out.print("Name: " + worker.getName());
        System.out.print("\nDepartment: " + worker.getDepartment().getName());
        System.out.print("\nIncome for " + monthAndYEar + ": " + worker.income(year, month));

        scan.close();
    }
}
