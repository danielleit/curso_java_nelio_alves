package exercicios.vetores;

import java.util.Scanner;

public class CalcMediaAltura {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int qtdAlturas = scan.nextInt();
        double[] alturas = new double[qtdAlturas];
        double totalAlturas = 0;

        for(int i = 0; i < qtdAlturas; i++){
            alturas[i] = scan.nextDouble();
            totalAlturas += alturas[i];
        }

        System.out.println("Media de alturas = " + (totalAlturas/qtdAlturas));

        scan.close();
    }
}
