package src.Java8Tasks;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Task18 {
    public static void main(String[] args) {


        Set<Employee> employees = new TreeSet<>(Comparator.comparing(Employee::getName));
        employees.add(new Employee("John"));
        employees.add(new Employee("Alice"));
        employees.add(new Employee("Bob"));
        for (Employee emp : employees) {
            System.out.println(emp.getName());
        }
    }
}
