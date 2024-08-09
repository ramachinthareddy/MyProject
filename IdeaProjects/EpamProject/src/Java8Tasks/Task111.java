package Java8Tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task111 {
    public static void main(String[] args) {


    List<Employee> employees = Arrays.asList(
            new Employee("John"),
            new Employee("Alice"),
            new Employee("Bob")
    );

   Collections.sort(employees, Comparator.comparing(Employee::getName));
        for (Employee emp : employees) {
            System.out.println(emp.getName());
        }
    }

}
