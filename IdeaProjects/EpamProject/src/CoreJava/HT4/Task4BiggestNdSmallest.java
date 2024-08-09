package CoreJava.HT4;


    public class Task4BiggestNdSmallest {
        public static void main(String[] args) {
            int[] numbers = {5, 10, 2, 8, 3, 1, 7, 6, 9, 4};

            int smallestNumber = findSmallestNumber(numbers);
            int biggestNumber = findBiggestNumber(numbers);

            System.out.println("Smallest number: " + smallestNumber);
            System.out.println("Biggest number: " + biggestNumber);
        }

        public static int findSmallestNumber(int[] numbers) {
            int smallest = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < smallest) {
                    smallest = numbers[i];
                }
            }
            return smallest;
        }

        public static int findBiggestNumber(int[] numbers) {
            int biggest = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > biggest) {
                    biggest = numbers[i];
                }
            }
            return biggest;
        }
    }

