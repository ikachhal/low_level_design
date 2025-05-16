package lld.composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
    private String name;
    private double salary;
    private List<Employee> subordinates;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    public void add(Employee employee) {
        subordinates.add(employee);
    }

    public void remove(Employee employee) {
        subordinates.remove(employee);
    }

    @Override
    public void showDetails() {
        System.out.println("Manager: " + name + ", Salary: " + salary);
        for (Employee employee : subordinates) {
            employee.showDetails();
        }
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
