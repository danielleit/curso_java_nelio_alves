package exercicios.objetos.contabancaria;

import java.util.Scanner;

import exercicios.objetos.contabancaria.entities.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroConta;
        String nomeTitular;
        double saldoInicial;

        System.out.printf("Enter account number: ");
        numeroConta = scan.nextInt();
        System.out.printf("Enter account holder name: ");
        nomeTitular = scan.next();
        System.out.printf("Enter initial balance: ");
        scan.nextLine(); // consume the remaining newline
        saldoInicial = scan.nextDouble();

        ContaBancaria conta = new ContaBancaria(numeroConta, saldoInicial, nomeTitular);
        int aux = 0;
        while (aux != 3) {
            System.out.println("\n\n\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            System.out.printf("Choose an option: ");
            aux = scan.nextInt();

            switch (aux) {
                case 1:
                    System.out.printf("Enter amount to deposit: ");
                    conta.depositar(scan.nextDouble());
                    break;
                case 2:
                    System.out.printf("Enter amount to withdraw: ");
                    conta.sacar(scan.nextDouble());
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scan.close();
    }
}
