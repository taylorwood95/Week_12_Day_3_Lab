package management;

import staff.Employee;

public class Director extends Employee{

    private int budget;


    public Director(String name, int niNumber, int salary, int budget) {
        super(name, niNumber, salary);
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }

    public int payBonus(){
        return super.getSalary()/100 * 2;

    }
}

