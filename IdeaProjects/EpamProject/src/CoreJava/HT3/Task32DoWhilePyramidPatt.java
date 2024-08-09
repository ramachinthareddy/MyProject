package CoreJava.HT3;
import java.util.Scanner;
public class Task32DoWhilePyramidPatt {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of rows for the pyramid: ");
            int rows = scanner.nextInt();

            System.out.print("Enter X: ");
            int x = scanner.nextInt();

            int i = 1;
            int num = 0;
            do {
                int j = 1;
                do {
                    System.out.print(num + "\t");
                    num += x;
                    j++;
                } while (j <= i);

                System.out.println();
                i++;
            } while (i <= rows);
        }
    }

