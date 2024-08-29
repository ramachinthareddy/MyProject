package src.CoreJava.HT5;
// Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)
public class Task56 {
    public boolean hasCommonDigit(int a, int b) {
        int leftDigitA = a / 10;
        int rightDigitA = a % 10;
        int leftDigitB = b / 10;
        int rightDigitB = b % 10;

        return (leftDigitA == leftDigitB || leftDigitA == rightDigitB ||
                rightDigitA == leftDigitB || rightDigitA == rightDigitB);
    }
    public static void main(String[] args){
        Task56 task56 = new Task56();
        System.out.println(task56.hasCommonDigit(12,23));
    }
}
