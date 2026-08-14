package exercicios.operadores.soma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();

        System.out.println("SOMA = " + num1 + num2);
    }
}
