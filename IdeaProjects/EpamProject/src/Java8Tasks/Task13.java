package Java8Tasks;

public class Task13 {
    public boolean areRotations(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        String concatenated = str1 + str1;
        return concatenated.contains(str2);

    }
    public static void main(String[] args){
        System.out.println(new Task13().areRotations("rama","chin"));
    }
}