package src.CoreJava.HT6;
//Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
public class Task62 {
    public boolean canSplitArray(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        // Calculate the total sum of all elements in the array
        for (int num : nums) {
            totalSum += num;
        }

        // Iterate through the array and check if the left sum is equal to the right sum
        for (int i = 0; i < nums.length; i++) {
            leftSum += nums[i];
            int rightSum = totalSum - leftSum;

            if (leftSum == rightSum) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args){
        Task62 task62 = new Task62();
        int[] nums = {1, 2, 1, 2};

        boolean canSplitArray = task62.canSplitArray(nums);

        System.out.println("Largest span: " + canSplitArray);
    }
}
