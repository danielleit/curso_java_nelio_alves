package exercicios.operadores.calcularSalario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numFunc = scan.nextInt();
        int horasTrabalhada = scan.nextInt();
        double valorHora = scan.nextDouble();
        scan.close();

        System.out.printf("NUMBER = %d %nSALARY = U$ %.2f %n", numFunc, horasTrabalhada * valorHora);
    }
}
