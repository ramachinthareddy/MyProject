package CoreJava.HT3;
import java.util.Scanner;
public class Task31WhilePyramidPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pyramid: ");
        int rows = scanner.nextInt();

        System.out.print("Enter X: ");
        int x = scanner.nextInt();

        int i = 1;
        int num = 0;
        while (i <= rows) {
            int j = 1;
            while (j <= rows - i) {
                System.out.print("");
                j++;
            }

            int k = 1;
            while (k <= i) {
                System.out.print(num + "\t");
                num++;
                k++;
            }

            System.out.println();
            i++;
        }
    }
}
