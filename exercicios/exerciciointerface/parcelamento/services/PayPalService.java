package exercicios.exerciciointerface.parcelamento.services;

import exercicios.exerciciointerface.parcelamento.interfaces.InstallmentService;

public class PayPalService implements InstallmentService{
    @Override
    public double interest(double amount, int installmentNumber) {

        return amount * (0.01 * installmentNumber);
    }

    @Override
    public double paymentFee(double amount) {
        
        return amount * 0.02;
    }
}
