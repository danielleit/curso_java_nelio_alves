package exercicios.excecoes.entities;

import exercicios.excecoes.exceptions.DomainException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Double getBalance() {
        return this.balance;
    }

    public void deposit(Double amount){
        balance += amount;
    }

    public void withdraw(Double amount) throws DomainException {
        if(amount > withdrawLimit){
            throw new DomainException("The amount exceds withdraw limit");
        }
        if(amount > balance){
            throw new DomainException("Not enough balance");
        }
        balance -= amount;
    }
}
