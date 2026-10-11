package exercicios.exerciciointerface.parcelamento.entities;

import java.time.LocalDate;

public class Installment {
    private LocalDate dueDate;
    private double amount;

    public Installment(LocalDate dueDate, double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }
}
