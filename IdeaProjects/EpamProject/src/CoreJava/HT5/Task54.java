package src.CoreJava.HT5;
// You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab, bc, and ac. Consider the sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10. Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0.
public class Task54 {
    public int blueTicket(int a, int b, int c) {
        int abSum = a + b;
        int bcSum = b + c;
        int acSum = a + c;

        if (abSum == 10 || bcSum == 10 || acSum == 10) {
            return 10;
        } else if (abSum - bcSum == 10 || abSum - acSum == 10) {
            return 5;
        } else {
            return 0;
        }
    }
}
