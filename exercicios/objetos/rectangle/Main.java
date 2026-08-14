package exercicios.objetos.rectangle;

import exercicios.objetos.rectangle.entities.Rectangle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Rectangle rect = new Rectangle();
        System.out.println("Enter rectangle width and height:");
        rect.width = scan.nextDouble();
        rect.height = scan.nextDouble();

        System.out.printf("AREA = %.2f%n", rect.area());
        System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());

        scan.close();
    }
}
