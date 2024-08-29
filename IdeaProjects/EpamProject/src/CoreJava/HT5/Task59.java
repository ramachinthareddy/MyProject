package src.CoreJava.HT5;

public class Task59 {
    public int largestBlockLength(String str) {
        int maxBlockLength = 0;
        int currentBlockLength = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                currentBlockLength++;
            } else {
                maxBlockLength = Math.max(maxBlockLength, currentBlockLength);
                currentBlockLength = 1;
            }
        }

        return Math.max(maxBlockLength, currentBlockLength);
    }
    public static void main(String args []){
        Task59 task59 = new Task59();
        System.out.println(task59.largestBlockLength("raaama"));//3
    }
}
