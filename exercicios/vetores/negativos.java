package exercicios.vetores;

import java.util.Scanner;

public class negativos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Quantos números você deseja inserir?");
        int n = scan.nextInt();
        
        int[] numeros = new int[n];
        int numeroAuxiliar;
	    for (int i=0; i<n; i++) {
	    	System.out.print("Digite um numero: ");
            numeroAuxiliar = scan.nextInt();
            if(numeroAuxiliar > 10){
                scan.close();
                throw new IllegalArgumentException("O número deve ser menor ou igual a 10.");
            }
	        numeros[i] = numeroAuxiliar;
	    }

        System.out.println("NUMEROS NEGATIVOS:");

        for (int i=0; i<n; i++) {
            if (numeros[i] < 0) {
                System.out.println(numeros[i]);
            }
        }

        scan.close();
    }
}