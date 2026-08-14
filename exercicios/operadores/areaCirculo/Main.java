package exercicios.operadores.areaCirculo;

import java.util.Scanner;

public class Main {
    private static final double PI = 3.14159;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double raio = scan.nextDouble();
        scan.close();

        double area = PI * (raio * raio);

        System.out.println("A=" + area);
    }
}
