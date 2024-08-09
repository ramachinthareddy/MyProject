package Java8Tasks;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Task19 {
    public static void main(String[] args) {

        Map<Integer, String> values = new TreeMap<>(Comparator.reverseOrder());
        values.put(1, "One");
        values.put(2, "Two");
        values.put(3, "Three");
        System.out.println(values);

    }
}
