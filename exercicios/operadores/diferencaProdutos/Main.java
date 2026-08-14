package exercicios.operadores.diferencaProdutos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int num4 = scan.nextInt();
        scan.close();

        System.out.println("DIFERENCA = " + ((num1 * num2) - (num3 * num4)));
    }
}
