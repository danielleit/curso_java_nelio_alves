package exercicios.vetores;

import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");    
        
        int n = scan.nextInt();
        double[] vetor = new double[n];

        for (int i = 0; i < n ; i++){
            System.out.printf("Digite um numero: ");
            vetor[i] = scan.nextDouble();
        }

        System.out.println("VALORES = ");
        for (int i = 0; i < n ; i++){
            System.out.println(vetor[i]);
        }

        double soma = 0;
        for (int i = 0; i < n ; i++){
            soma += vetor[i];
        }
        System.out.println("SOMA = " + soma);

        System.out.println("MEDIA = " + soma/n);

        scan.close();
    }
}
