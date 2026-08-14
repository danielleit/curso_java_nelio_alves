package exercicios.condicionais.intervalo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        scan.close();

        if (0 < num && num <= 25) {
            System.out.println("Intervalo (0,25]");
            return;
        }

        if (25 < num && num <= 50) {
            System.out.println("Intervalo (25,50]");
            return;
        }

        if (50 < num && num <= 75) {
            System.out.println("Intervalo (50,75]");
            return;
        }

        if (75 < num && num <= 100) {
            System.out.println("Intervalo (75,100]");
            return;
        }

        System.out.println("Fora do intervalo");
    }
}
