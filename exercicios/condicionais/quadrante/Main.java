package exercicios.condicionais.quadrante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        scan.close();

        if(x == 0 && y == 0){
            System.out.println("Origem");
            return;
        }
        if(x == 0){
            System.out.println("Eixo Y");
            return;
        }
        if(y == 0){
            System.out.println("Eixo X");
            return;
        }
        if(x > 0){
            System.out.println(y > 0 ? "Q1" : "Q4");
        } else {
            System.out.println(y < 0 ? "Q3" : "Q2");
        }

        System.out.println("Entrada inválida");
    }
}
