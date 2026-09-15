package exercicios.classeabstrata;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exercicios.classeabstrata.entities.Contribuiente;
import exercicios.classeabstrata.entities.PF;
import exercicios.classeabstrata.entities.PJ;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.printf("Enter the number of tax payers: ");
        int n = scan.nextInt();
        scan.nextLine();

        List<Contribuiente> contribuientes = new ArrayList<Contribuiente>();

        for(int i = 0; i < n; i++){
            System.out.println("Tax payer #" + (i+1) + " data:");
            System.out.printf("Individual or company (i/c)? ");
            String iOrC = scan.nextLine();

            System.out.printf("Name: ");
            String name = scan.nextLine();
            System.out.printf("Anual income: ");
            Double anualIncome = scan.nextDouble();

            if(iOrC.equals("i")){
                System.out.printf("Health expendituries: ");
                Double gastoComSaude= scan.nextDouble();
                PF pf = new PF(name, anualIncome, gastoComSaude);
                contribuientes.add(pf);
            }

            if(iOrC.equals("c")){
                System.out.printf("Number of employees: ");
                int qtdFuncionarios = scan.nextInt();
                PJ pj = new PJ(name, anualIncome, qtdFuncionarios);
                contribuientes.add(pj);
            }

            scan.nextLine();
        }

        Double impostoTotal = 0.0;
        System.out.println("TAXES PAID:");
        
        for (Contribuiente contribuiente : contribuientes) {
            System.out.println(contribuiente.getName() + ": " + contribuiente.calcularImposto());
            impostoTotal += contribuiente.calcularImposto();
        }

        System.out.println("TOTAL TAXES: $ " + impostoTotal);
        
        scan.close();
    }
}
