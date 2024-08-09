package Java8Tasks;

import java.util.Arrays;
import java.util.List;

public class Task12 {
    public int findSecondLargest(List<Integer> numbers) {
        int largest = Integer.MIN_VALUE;

        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
    public static void main(String args[]){
        List<Integer> numbers= Arrays.asList(1,3,7,9);
        System.out.println(new Task12().findSecondLargest(numbers));
    }

}
