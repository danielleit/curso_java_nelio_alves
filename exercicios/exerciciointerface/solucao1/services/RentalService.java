package exercicios.exerciciointerface.solucao1.services;

import exercicios.exerciciointerface.solucao1.entities.CarRental;
import exercicios.exerciciointerface.solucao1.entities.Invoice;

public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;
    private BrazilTaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {
        long t1 = carRental.getStart().getHour();
        long t2 = carRental.getFinish().getHour();
        double hours = (double) (t2 - t1);
        
        double basicPayment;
        if (hours <= 12.0) {
            basicPayment = pricePerHour * Math.ceil(hours);
        } else {
            basicPayment = pricePerDay * Math.ceil(hours / 24.0);
        }
        
        double tax = taxService.tax(basicPayment);
        
        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
