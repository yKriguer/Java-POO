package entities;

public class Employee implements Comparable<Employee> {
    private String Name;
    private Double salary;

    public Employee(String name, Double salary) {
        Name = name;
        this.salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        return -getSalary().compareTo(o.getSalary());
    }
}
