package exercicios.enumeracoes.calcularsalario.entities;

import exercicios.enumeracoes.calcularsalario.entities.enums.WorkerLevel;
import exercicios.enumeracoes.calcularsalario.entities.Department;
import exercicios.enumeracoes.calcularsalario.entities.HourContract;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public Double income(Integer year, Integer month){
        double sum = this.baseSalary;
        Calendar calendar = Calendar.getInstance();

        for(HourContract c : contracts){
            calendar.setTime(c.getDate());
            if(calendar.get(Calendar.YEAR) == year && (calendar.get(Calendar.MONTH) + 1) == month){
                sum += c.totalValue();
            }
        }
        return sum;
    }

    public Worker(){
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName(){
        return this.name;
    }

    public Department getDepartment(){
        return this.department;
    }
}