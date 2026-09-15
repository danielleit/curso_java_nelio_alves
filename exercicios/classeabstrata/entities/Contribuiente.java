package exercicios.classeabstrata.entities;

public abstract class Contribuiente {
    private String name;
    private Double anualIncome;

    public Contribuiente(String name, Double anualIncome){
        this.name = name;
        this.anualIncome = anualIncome;
    }
    public String getName(){
        return this.name;
    }

    public Double getAnualIncome(){
        return this.anualIncome;
    }
    public abstract Double calcularImposto();
}
