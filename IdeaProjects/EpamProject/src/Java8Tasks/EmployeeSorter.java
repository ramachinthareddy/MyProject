package Java8Tasks;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



    class Employee {
        private String name;

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public class EmployeeSorter {
        public static void main(String[] args) {
            List<Employee> employees = new ArrayList<>();
            employees.add(new Employee("John"));
            employees.add(new Employee("Alice"));
            employees.add(new Employee("Bob"));
            employees.add(new Employee("David"));

            // Sort employees based on their names
            Collections.sort(employees, new Comparator<Employee>() {
                @Override
                public int compare(Employee emp1, Employee emp2) {
                    return emp1.getName().compareTo(emp2.getName());
                }
            });

            // Print the sorted list
            for (Employee emp : employees) {
                System.out.println(emp.getName());
            }
        }
    }

