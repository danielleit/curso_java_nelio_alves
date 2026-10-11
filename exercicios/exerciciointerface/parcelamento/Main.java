package exercicios.exerciciointerface.parcelamento;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import exercicios.exerciciointerface.parcelamento.entities.Contract;
import exercicios.exerciciointerface.parcelamento.entities.Installment;
import exercicios.exerciciointerface.parcelamento.services.ContractService;
import exercicios.exerciciointerface.parcelamento.services.PayPalService;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.println("Enter contract data:");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Contract value: ");
        double totalValue = sc.nextDouble();

        System.out.print("Enter number of installments: ");
        int numberOfInstallments = sc.nextInt();

        Contract contract = new Contract(number, date, totalValue);
        ContractService contractService = new ContractService();
        contractService.execute(contract, numberOfInstallments, new PayPalService());

        System.out.println("Contract number - " + contract.getNumber());
        System.out.println("Installments:");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment.getDueDate().format(fmt)
                    + " - " + String.format("%.2f", installment.getAmount()));
        }        
        
        sc.close();
    }
}
