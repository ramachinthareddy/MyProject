package src.Java8Tasks;

public class Task11 {
    public boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
public static void main(String[] args){
        Task11 task11 = new Task11();
    System.out.println( task11.isPalindrome("rama"));

    }
}
