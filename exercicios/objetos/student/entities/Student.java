package exercicios.objetos.student.entities;

public class Student {
    
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public void setName(String name){
        this.name = name;
    }

    public void setGrade1(Double grade1){
        this.grade1 = grade1;
    }

    public void setGrade2(Double grade2){
        this.grade2 = grade2;
    }

    public void setGrade3(Double grade3){
        this.grade3 = grade3;
    }

    private double finalGrade() {
        return (grade1 + grade2 + grade3) / 3.0;
    }

    private double missingPoints() {
        if (finalGrade() < 60.0) {
            return 60.0 - finalGrade();
        } else {
            return 0.0;
        }
    }

    public String toString() {
        if (finalGrade() >= 60.0) {
            return "\nSTUDENT: " + name + "\nFINAL GRADE = " + String.format("%.2f", finalGrade()) + "\nPASS";
        } else {
            return "\nSTUDENT: " + name + "\nFINAL GRADE = " + String.format("%.2f", finalGrade()) + "\nFAILED\nMISSING " + String.format("%.2f", missingPoints()) + " POINTS";
        }
    }
}
