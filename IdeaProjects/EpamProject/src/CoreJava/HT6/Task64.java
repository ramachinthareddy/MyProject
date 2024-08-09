package CoreJava.HT6;

public class Task64 {
    public int largestMirrorSection(int[] nums) {
        int largestMirrorSize = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                int mirrorSize = 0;
                int k = i;
                int l = j;

                while (k < nums.length && l >= 0 && nums[k] == nums[l]) {
                    mirrorSize++;
                    k++;
                    l--;
                }

                largestMirrorSize = Math.max(largestMirrorSize, mirrorSize);
            }
        }

        return largestMirrorSize;
    }
    public static void main(String[] args){
        Task64 task64 = new Task64();
        int[] nums = {1, 2, 1, 4};

        int largestMirrorSection = task64.largestMirrorSection(nums);

        System.out.println("Largest span: " + largestMirrorSection);
    }
}
