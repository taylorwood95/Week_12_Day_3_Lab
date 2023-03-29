package staff;

public abstract class Employee {

    private String name;
    private int niNumber;
    private int salary;

    public Employee(String name, int niNumber, int salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNiNumber() {
        return niNumber;
    }

    public void setNiNumber(int niNumber) {
        this.niNumber = niNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void raiseSalary(double num) {
        if(num > 1){
            this.salary += num;}
    }


    public int payBonus(){
        return this.salary/100;
    }



}
