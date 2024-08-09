package CollectionsHT6;
import java.util.LinkedHashMap;
public class LinkedHashMapDemo {


        public static void main(String[] args) {
            LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

            map.put(1, "Apple");
            map.put(2, "Banana");
            map.put(3, "Orange");

            System.out.println("LinkedHashMap: " + map);
        }
    }

