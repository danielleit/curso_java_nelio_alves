package exercicios.condicionais.parimpar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        if(num % 2 == 0){
            System.out.println("PAR");
            return;
        }

        System.out.println("IMPAR");
    }
}
