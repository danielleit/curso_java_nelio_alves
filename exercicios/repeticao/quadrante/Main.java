package exercicios.repeticao.quadrante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        while(x != 0 && y != 0){
            if(x < 0){
                System.out.println(y < 0 ? "terceiro" : "segundo");
            } else {
                System.out.println(y < 0 ? "quarto" : "primeiro");
            }
            x = scan.nextInt();
            y = scan.nextInt();
        }
        scan.close();
    }
}
