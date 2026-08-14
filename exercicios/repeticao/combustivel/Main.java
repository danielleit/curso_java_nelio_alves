package exercicios.repeticao.combustivel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        final int ALCOOL = 1;
        final int GASOLINA = 2;
        final int DIESEL = 3;
        final int FIM = 4;

        int qtdAlcool = 0;
        int qtdDiesel = 0;
        int qtdGasolina = 0;

        int codigo;

        while((codigo = scan.nextInt())!= FIM){
            switch (codigo) {
                case ALCOOL: qtdAlcool += 1; break;
                case GASOLINA: qtdGasolina += 1; break;
                case DIESEL: qtdDiesel += 1; break;
            }
        }
        scan.close();
        System.out.printf("MUITO OBRIGADO%nAlcool: %d%nGasolina: %d%nDiesel: %d%n", qtdAlcool, qtdGasolina, qtdDiesel);
    }
}
