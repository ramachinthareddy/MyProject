package CoreJava.HT6;
//Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)
public class Task61 {
    public int largestSpan(int[] nums) {
        int largestSpan = 0;

        for (int i = 0; i < nums.length; i++) {
            int j = nums.length - 1;

            while (j >= i && nums[i] != nums[j]) {
                j--;
            }

            int span = j - i + 1;
            largestSpan = Math.max(largestSpan, span);
        }

        return largestSpan;
    }
    public static void main(String[]args){
        Task61 task61 = new Task61();
        int[] nums = {1, 2, 3, 4};

        int largestSpan = task61.largestSpan(nums);

        System.out.println("Largest span: " + largestSpan);

    }
}
