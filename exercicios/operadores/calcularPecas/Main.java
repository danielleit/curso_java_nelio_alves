package exercicios.operadores.calcularPecas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int cod1 = scan.nextInt();
        int qtd1 = scan.nextInt();
        double valor1 = scan.nextDouble();

        int cod2 = scan.nextInt();
        int qtd2 = scan.nextInt();
        double valor2 = scan.nextDouble();
        scan.close();

        int aux = cod2;
        cod2 = cod1;
        cod1 = aux;

        System.out.printf("VALOR A PAGAR: R$ %.2f", (qtd1 * valor1) + (qtd2 * valor2));

    }
}
