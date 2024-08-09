package Java8Tasks;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Task17 {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>(Comparator.reverseOrder());
        numbers.add(5);
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);
        System.out.println(numbers);

    }

}
