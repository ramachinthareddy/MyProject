package CoreJava.HT5;
// Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
public class Task510
{
    public int sumNumbers(String str) {
        int sum = 0;
        String currentNumber = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c)) {
                currentNumber += c;
            } else {
                if (!currentNumber.isEmpty()) {
                    sum += Integer.parseInt(currentNumber);
                    currentNumber = "";
                }
            }
        }

        if (!currentNumber.isEmpty()) {
            sum += Integer.parseInt(currentNumber);
        }

        return sum;
    }
    public static void main(String[] args){
        Task510 task510 = new Task510();
        System.out.println(task510.sumNumbers("abc112ra"));//112
        System.out.println(task510.sumNumbers("abc11rj22"));//11+22=33
        System.out.println(task510.sumNumbers("7 23"));//30
    }
}
