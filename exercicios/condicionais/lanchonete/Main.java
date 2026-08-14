package exercicios.condicionais.lanchonete;

import java.util.Scanner;

public class Main {
    private static final double cachorroQuente = 4.00;
    private static final double xSalada = 4.50;
    private static final double xBacon = 5.00;
    private static final double torradaSimples = 2.00;
    private static final double refrigerante = 1.50;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int codigo = scan.nextInt();
        int qtd = scan.nextInt();
        scan.close();
        double valorUn;

        switch (codigo){
            case 1: valorUn = cachorroQuente;
                break;
            case 2: valorUn = xSalada;
                break;
            case 3: valorUn = xBacon;
                break;
            case 4: valorUn = torradaSimples;
                break;
            case 5: valorUn = refrigerante;
                break;
            default: System.out.println("Produto não cadastrado!");
                return;

        }

        System.out.printf("Total: R$ %.2f", valorUn * qtd);
    }
}
