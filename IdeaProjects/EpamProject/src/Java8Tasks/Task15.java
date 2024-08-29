package src.Java8Tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task15 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);
        Collections.sort(numbers, Comparator.reverseOrder());
        System.out.println(numbers);

    }
}
