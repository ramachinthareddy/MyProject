package CoreJava.HT4;

public class Task4RotationStrings {
    public static boolean areRotations(String str1, String str2) {
        // Check if the lengths of the strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Concatenate str1 with itself
        String concatenatedStr = str1 + str1;

        // Check if str2 is a substring of concatenatedStr
        return concatenatedStr.contains(str2);
    }

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "lohel";

        if (areRotations(str1, str2)) {
            System.out.println("The strings are rotations of each other.");
        } else {
            System.out.println("The strings are not rotations of each other.");
        }
    }
}
