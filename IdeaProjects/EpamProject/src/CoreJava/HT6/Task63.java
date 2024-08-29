package src.CoreJava.HT6;
// Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.
public class Task63 {
    public int countClumps(int[] nums) {
        int clumpCount = 0;
        boolean isClump = false;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                if (!isClump) {
                    clumpCount++;
                    isClump = true;
                }
            } else {
                isClump = false;
            }
        }

        return clumpCount;
    }

    public static void main(String[] args){
        Task63 task63 = new Task63();
        int[] nums = {1, 2, 1, 2,2};

        int clumps = task63.countClumps(nums);

        System.out.println("Largest span: " + clumps);
    }
}
