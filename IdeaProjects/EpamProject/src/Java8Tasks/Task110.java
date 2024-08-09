package Java8Tasks;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Task110 {
    public static void main(String[] args) {
        Map<String, Employee> employees = new TreeMap<>(Comparator.reverseOrder());
        employees.put("John", new Employee("John"));
        employees.put("Alice", new Employee("Alice"));
        employees.put("Bob", new Employee("Bob"));
    }
}
