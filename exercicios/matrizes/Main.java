package exercicios.matrizes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = scan.nextInt();
        int columns = scan.nextInt();
        int[][] matrix = new int[rows][columns];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                matrix[i][j] = scan.nextInt();
            }
        }

        int x = scan.nextInt();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(matrix[i][j] == x){
                    System.out.println("Position " + i + "," + j + ":");
                    if(j > 0){
                        System.out.println("Left: " + matrix[i][j - 1]);
                    }
                    if(i > 0){
                        System.out.println("Up: " + matrix[i - 1][j]);
                    }
                    if(j < columns - 1){
                        System.out.println("Right: " + matrix[i][j + 1]);
                    }
                    if(i < rows - 1){
                        System.out.println("Down: " + matrix[i + 1][j]);
                    }
                }
            }
        }

        scan.close();
    }
}
