package exercicios.listas.funcionario.entities;

public class Funcionario {
    int id;
    String nome;
    double salario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double valor) {
        salario += valor;
    }

    public Funcionario() {
    }

    public String toString() {
        return id + ", " + nome + ", " + String.format("%.2f", salario);
    }
}
