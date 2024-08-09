package CoreJava.HT3;

import java.util.Scanner;

public class Task33ForLoopPyramidPatt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pyramid: ");
        int rows = scanner.nextInt();

        System.out.print("Enter X: ");
        int x = scanner.nextInt();

        int num = 0;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + "\t");
                num += x;
            }
            System.out.println();
        }
    }
}
