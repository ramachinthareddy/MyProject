package src.CoreJava.HT4;

import java.util.HashMap;
import java.util.Map;

public class Task4DuplicateChars {
    public static void main(String[] args) {
        String str = "Ramadevi Chinthareddy";

        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count the occurrences of each character in the string
        for (char c : str.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        // Print the duplicate characters
        System.out.println("Duplicate characters in the string: ");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }

}
