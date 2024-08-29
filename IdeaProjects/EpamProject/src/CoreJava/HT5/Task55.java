package src.CoreJava.HT5;

public class Task55 {
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk) {
            return c > b;
        } else {
            return b > a && c > b;
        }
    }
    public  static void main(String[] args){
        Task55 task55 = new Task55();
        System.out.println(task55.inOrder(1, 2, 4, false)); // true
        System.out.println(task55.inOrder(1, 2, 1, false));// false
        System.out.println(task55.inOrder(1, 1, 2, true) );// true
    }
}
