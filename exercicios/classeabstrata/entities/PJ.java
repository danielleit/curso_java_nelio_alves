package exercicios.classeabstrata.entities;

public class PJ extends Contribuiente {
    private int qtdFuncionarios;
    
    public PJ(String name, Double anualIncome, int qtdFuncionarios){
        super(name, anualIncome);
        this.qtdFuncionarios = qtdFuncionarios;
    }

    public Double calcularImposto(){
        if(this.qtdFuncionarios < 10){
            return super.getAnualIncome() * 0.16;
        }

        return super.getAnualIncome() * 0.14;

    }
 
}
