package exercicios.heranca;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.PlainDocument;

import exercicios.heranca.entities.ImportedProduct;
import exercicios.heranca.entities.Product;
import exercicios.heranca.entities.UsedProduct;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.printf("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Product> products = new ArrayList<Product>();

        for(int i = 0; i < n; i++){
            System.out.printf("Product #" + (i+1) + " data: \n");
            System.out.printf("Common, used or imported (c/u/i)? ");
            String productType = sc.nextLine();
            System.out.printf("Name: ");
            String productName = sc.nextLine();
            System.out.printf("Price: ");
            Double productPrice = sc.nextDouble();
            sc.nextLine();
            switch(productType){
                case "c": 
                    Product productC = new Product(productName, productPrice);
                    products.add(productC);

                    break;

                case "i":
                    System.out.printf("Customs fee: ");
                    Double productCustomsFee = sc.nextDouble();
                    sc.nextLine();
                    ImportedProduct productI = new ImportedProduct(productName, productPrice, productCustomsFee);
                    products.add(productI);
  
                    break;

                case "u":
                    Date productManufactureDate = null;
                    System.out.printf("Manufacture date (DD/MM/YYYY): ");
                    try {
                        productManufactureDate = sdf.parse(sc.next());
                    } catch (Exception e) {
                        System.out.println("Data não compatível com formato.");
                        return;
                    }

                    UsedProduct productU = new UsedProduct(productName, productPrice, productManufactureDate);

                    products.add(productU);
                    
                    break;

                default:
                    System.out.println("Caracter não aceito.");
                    return;
            }
        }

        System.out.printf("PRICE TAGS: \n");
        for (Product product : products) {
            System.out.println(product.priceTag());
        }

        sc.close();
    }


}
