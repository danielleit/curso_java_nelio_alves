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

        Funcionario funcionario1 = findFuncionarioByIdMethod1(funcionarios, id);
        if (funcionario1 != null) {
            System.out.printf("Digite o valor do 1º aumento do funcionário %s: ", funcionario1.getNome());
            funcionario1.aumentarSalario(scan.nextDouble());
            listaDeFuncionariosToString(funcionarios);
        } else {
            System.out.println("Funcionário não encontrado.");
            listaDeFuncionariosToString(funcionarios);
        }

        Integer index = findFuncionarioByIdMethod2(funcionarios, id);
        if (index != null) {
            System.out.printf("Digite o valor do 2º aumento do funcionário %s: ", funcionarios.get(index).getNome());
            funcionarios.get(index).aumentarSalario(scan.nextDouble());
            listaDeFuncionariosToString(funcionarios);
        }

        Funcionario funcionario2 = findFuncionarioByIdMethod3(funcionarios, id);
        if (funcionario2 != null) {
            System.out.printf("Digite o valor do 3º aumento do funcionário %s: ", funcionario2.getNome());
            funcionario2.aumentarSalario(scan.nextDouble());
            listaDeFuncionariosToString(funcionarios);
        }

        scan.close();

    }

    private static Funcionario findFuncionarioByIdMethod1(List<Funcionario> funcionarios, int id) {
        for (Funcionario f : funcionarios) {
            if (f.getId() == id) {
                return f;
            }
        }
        return null;
    }

    private static Integer findFuncionarioByIdMethod2(List<Funcionario> funcionarios, int id) {
        for (int i = 0; i < funcionarios.size();i++) {
            if(funcionarios.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    private static Funcionario findFuncionarioByIdMethod3(List<Funcionario> funcionarios, int id) {
        return funcionarios.stream().filter(f -> f.getId() == id).findFirst().orElse(null);
    }    

    private static void listaDeFuncionariosToString(List<Funcionario> funcionarios) {
        System.out.println("Lista de funcionários:");
        for (Funcionario f : funcionarios) {
            System.out.println(f.toString());
        }
    }
}
