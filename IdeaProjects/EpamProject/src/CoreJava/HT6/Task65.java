package src.CoreJava.HT6;

public class Task65 {
    public boolean linearIn(int[] outer, int[] inner) {
        int outerIndex = 0;
        int innerIndex = 0;

        while (outerIndex < outer.length && innerIndex < inner.length) {
            if (outer[outerIndex] == inner[innerIndex]) {
                innerIndex++;
            }
            outerIndex++;
        }

        return innerIndex == inner.length;
    }
    public static void main(String[] args){
        Task65 task65 = new Task65();
        int[] outer = {1, 2, 1, 4};
        int[]  inner={1,2,1};

        boolean linearIn = task65.linearIn(outer,inner);

        System.out.println("Linear in: " + linearIn);
    }
}
