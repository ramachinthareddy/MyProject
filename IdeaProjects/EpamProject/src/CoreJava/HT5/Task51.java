package CoreJava.HT5;
//You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
public class Task51 {
    public int caughtSpeeding(int speed, boolean isBirthday) {
        int maxSpeed = 60;

        if (isBirthday) {
            maxSpeed += 5;
        }

        if (speed <= maxSpeed) {
            return 0;
        } else if (speed <= maxSpeed + 20) {
            return 1;
        } else {
            return 2;
        }
    }
    public static void main(String[] args){
        Task51 task51 =new Task51();
        System.out.println(task51.caughtSpeeding(65,true));
    }
}
