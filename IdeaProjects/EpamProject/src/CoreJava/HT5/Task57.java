package CoreJava.HT5;

public class Task57 {
    public int sumWithSameDigits(int a, int b) {
        String aString = String.valueOf(a);
        System.out.println(aString.length());
        String sumString = String.valueOf(a + b);
        System.out.println(sumString.length());

        if (sumString.length() == aString.length()) {
            return a + b;
        } else {
            return a;
        }
    }
    public static void main(String[] args)
    {
        Task57 task57 = new Task57();
        System.out.println(task57.sumWithSameDigits(5,9));//5
        System.out.println(task57.sumWithSameDigits(5,2));//7
    }
}
