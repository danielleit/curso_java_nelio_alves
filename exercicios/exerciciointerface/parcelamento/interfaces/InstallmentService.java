package exercicios.exerciciointerface.parcelamento.interfaces;

public interface InstallmentService {
    double interest(double amount, int installmentNumber);
    double paymentFee(double amount);
}
