package exercicios.exerciciointerface.solucao2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import exercicios.exerciciointerface.solucao2.entities.CarRental;
import exercicios.exerciciointerface.solucao2.entities.Vehicle;
import exercicios.exerciciointerface.solucao2.services.BrazilTaxService;
import exercicios.exerciciointerface.solucao2.services.RentalService;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter rental data");
        System.out.print("Car model:");
        String carModel = sc.nextLine();
        System.out.print("Pickup (dd/MM/yyyy hh:ss):");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Return (dd/MM/yyyy hh:ss):");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.println("Enter price per hour:");
        double pricePerHour = sc.nextDouble();

        System.out.println("Enter price per day:");
        double pricePerDay = sc.nextDouble();   

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        rentalService.processInvoice(cr);

        System.out.println("INVOICE:");
        System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Total payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

        sc.close();
    }
}
