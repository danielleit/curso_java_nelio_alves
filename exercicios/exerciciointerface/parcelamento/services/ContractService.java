package exercicios.exerciciointerface.parcelamento.services;

import exercicios.exerciciointerface.parcelamento.entities.Contract;
import exercicios.exerciciointerface.parcelamento.entities.Installment;
import exercicios.exerciciointerface.parcelamento.interfaces.InstallmentService;

public class ContractService {
    public void execute(Contract contract, int numberOfInstallments, InstallmentService installmentService) {
        double installmentInitialValue = contract.getTotalValue() / numberOfInstallments;
        
        for(int i = 0; i < numberOfInstallments; i++){
            double interest = installmentService.interest(installmentInitialValue, i + 1);
            double fee = installmentService.paymentFee(installmentInitialValue + interest);
            double totalInstallmentValue = installmentInitialValue + interest + fee;

            Installment installment = new Installment(contract.getDate().plusMonths(i + 1), totalInstallmentValue);
            contract.addInstallments(installment);
        }
    }
}
