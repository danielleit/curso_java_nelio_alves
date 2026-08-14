package exercicios.listas.funcionario;

import exercicios.listas.funcionario.entities.Funcionario;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.printf("Quantos funcionários deseja cadastrar? ");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            Funcionario f = new Funcionario();
            System.out.printf("Digite o ID do funcionário %d: ", i + 1);
            f.setId(scan.nextInt());
            System.out.printf("Digite o nome do funcionário %d: ", i + 1);
            f.setNome(scan.next());
            System.out.printf("Digite o salário do funcionário %d: ", i + 1);
            f.setSalario(scan.nextDouble());
            funcionarios.add(f);
        }

        System.out.printf("Digite o ID do funcionário que deseja aumentar o salário: ");
        int id = scan.nextInt();

        Funcionario funcionario = findFuncionarioById(funcionarios, id);
        if (funcionario != null) {
            System.out.printf("Digite o valor do aumento: ");
            funcionario.aumentarSalario(scan.nextDouble());
            listaDeFuncionariosToString(funcionarios);
        } else {
            System.out.println("Funcionário não encontrado.");
            listaDeFuncionariosToString(funcionarios);
        }

        scan.close();

    }

    private static Funcionario findFuncionarioById(List<Funcionario> funcionarios, int id) {
        for (Funcionario f : funcionarios) {
            if (f.getId() == id) {
                return f;
            }
        }
        return null;
    }

    private static void listaDeFuncionariosToString(List<Funcionario> funcionarios) {
        System.out.println("Lista de funcionários:");
        for (Funcionario f : funcionarios) {
            System.out.println(f.toString());
        }
    }
}
