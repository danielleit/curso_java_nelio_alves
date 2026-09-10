package exercicios.heranca.entities;

public class Product {
    private String name;
    private Double price;

    public Product(){
    }

    public Double getPrice(){
        return this.price;
    }

    public String getName(){
        return this.name;
    }

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public String priceTag(){
        return "" + this.name + " $ " + this.price;
    }
}
