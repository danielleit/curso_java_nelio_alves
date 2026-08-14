package exercicios.condicionais.duracaojogo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int horaInicial = scan.nextInt();
        int horaFinal = scan.nextInt();
        scan.close();

        int duracao = (horaFinal - horaInicial + 24) % 24;
        if(duracao == 0) duracao = 24;

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}
