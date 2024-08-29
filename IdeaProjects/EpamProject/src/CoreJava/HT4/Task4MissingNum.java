package src.CoreJava.HT4;

public class Task4MissingNum {

        public static void main(String[] args) {
            int[] numbers = new int[100];
            for (int i = 0; i < 100; i++) {
                numbers[i] = i + 1;
            }
            numbers[36] = 0; // Assuming 38 is the missing number

            int missingNumber = findMissingNumber(numbers);
            System.out.println("The missing number is: " + missingNumber);
        }

        public static int findMissingNumber(int[] numbers) {
            int expectedSum = 100 * (100 + 1) / 2; // Sum of numbers from 1 to 100
            int actualSum = 0;
            for (int number : numbers) {
                actualSum += number;
            }
            return expectedSum - actualSum;
        }
    }

