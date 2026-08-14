package exercicios.repeticao.senha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        while(scan.nextInt() != 2002){
            System.out.println("Senha Invalida");
        }
        System.out.println("Acesso Permitido");
        scan.close();
    }
}
