package exercicios.condicionais.negativo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        if(num < 0){
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NAO NEGATIVO");
        }
    }
}
