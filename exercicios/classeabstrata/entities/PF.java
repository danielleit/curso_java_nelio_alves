package exercicios.classeabstrata.entities;

public class PF extends Contribuiente {
    private Double gastoComSaude;
    
    public PF(String name, Double anualIncome, Double gastoComSaude){
        super(name, anualIncome);
        this.gastoComSaude = gastoComSaude;
    }

    public Double calcularImposto(){
        if(this.gastoComSaude > 0){
            return (super.getAnualIncome() * 0.25) - (this.gastoComSaude * 0.50);
        }

        return super.getAnualIncome() * 0.14;

    }
}
