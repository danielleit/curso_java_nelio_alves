package exercicios.heranca.entities;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct(String name, Double price, Double customsFee){
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double totalPrice(){
        return super.getPrice() + customsFee;
    }

    @Override 
    public String priceTag(){
        return "" + super.getName() + " $ " + this.totalPrice() + " (Customs fee: $ " + this.customsFee + ")";
    }
}
