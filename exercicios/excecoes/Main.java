package exercicios.excecoes;

import java.util.Scanner;

import exercicios.excecoes.entities.Account;
import exercicios.excecoes.exceptions.DomainException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data: ");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        double initialBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        Account account = new Account(number, holder, initialBalance, withdrawLimit);

        try{
            System.out.println("Enter amount for withdraw: ");
            Double amount = sc.nextDouble();
            account.withdraw(amount);
            System.out.printf("New balance: %.2f%n", account.getBalance());

        } catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        } catch(RuntimeException e){
            System.out.println("Unexpected error: " + e.getMessage());
        }

        sc.close(); 
    }
    

}
