package exercicios.objetos.contabancaria.entities;

public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public String getNomeTitular() {
        return this.nomeTitular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
        System.out.println("\n" + this.toString());
    }

    public void sacar(double valor) {
        if (valor + 5.0 > this.saldo) {
            System.out.println("Saldo insuficiente para saque. Saldo atual: " + this.saldo);
            return;
        } 

        this.saldo -= valor + 5.0;
        System.out.println("Saque realizado com sucesso!");
        System.out.println("\n" + this.toString());

    }

    public ContaBancaria(int numeroConta, double saldoInicial, String nomeTitular) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("Saldo inicial não pode ser negativo.");
        }

        this.saldo = saldoInicial;
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
    }

    public ContaBancaria() {
    }

    public String toString() {
        return "Numero da Conta: " + this.numeroConta + '\n'
                + "Nome do Titular: " + this.nomeTitular + '\n'
                + "Saldo = " + String.format("%.2f", this.saldo);
    }

}
