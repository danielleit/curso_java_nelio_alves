package exercicios.operadores.areaFigurasGeometricas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();
        scan.close();

        System.out.printf("TRIANGULO: %.3f %n", (A * C) / 2);
        System.out.printf("CIRCULO: %.3f %n", 3.14159 * (C * C));
        System.out.printf("TRAPEZIO: %.3f %n", ((A + B) * C) / 2);
        System.out.printf("QUADRADO: %.3f %n", (B * B));
        System.out.printf("RETANGULO: %.3f %n", (A *B));

    }
}
