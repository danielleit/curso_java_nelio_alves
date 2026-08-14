package exercicios.condicionais.imposto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double salario = scan.nextDouble();
        scan.close();
        double imposto = 0;

        if (salario > 4500){
            imposto += (salario - 4500) * 0.28;
            imposto += 1500 * 0.18;
            imposto += 1000 * 0.08;
        } else if (salario > 3000){
            imposto += (salario - 3000) * 0.18;
            imposto += 1000 * 0.08;
        } else if (salario > 2000){
            imposto += (salario - 2000) * 0.08;
        } else {
            System.out.println("Isento");
            return;
        }

        System.out.printf("R$ %.2f", imposto);
    }
}
