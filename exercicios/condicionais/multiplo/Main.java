package exercicios.condicionais.multiplo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();

        if((num1 % num2) == 0 || (num2 % num1) == 0){
            System.out.println("Sao Multiplos");
            return;
        }

        System.out.println("Nao sao Multiplos");
    }
}
