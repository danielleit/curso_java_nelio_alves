package exercicios.objetos.student;

import exercicios.objetos.student.entities.Student;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        Student student = new Student();
        System.out.printf("Enter student name: ");
        student.setName(scan.nextLine());

        int grades = 3;

        while (grades > 0) {
            System.out.printf("Enter grade %d: ", 4 - grades);
            double grade = scan.nextDouble();

            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
                scan.nextLine();
                continue;
            }


            switch(grades){
                case 4:
                    student.setGrade1(grade);
                    break;
                case 3:
                    student.setGrade2(grade);
                    break;
                case 2:
                    student.setGrade3(grade);
                    break;
                default:
                    System.out.println("Invalid grade number.");
            }
            
            grades--;
        }
        System.out.println(student.toString()); 

        scan.close();
    }
}
