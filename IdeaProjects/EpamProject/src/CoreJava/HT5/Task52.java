package src.CoreJava.HT5;
//The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is  6. Note: the function Math.abs(num) computes the absolute value of a number.
public class Task52 {
    public boolean isTrulyGreat(int a, int b) {
        return (a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6);
    }
    public static void main(String[] args){
        Task52 task52 =new Task52();
        System.out.println(task52.isTrulyGreat(2,5));
    }
}
