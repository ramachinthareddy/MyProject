package src.Java8Tasks;


    public class Task14 implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        }

        public static void main(String[] args) {
            Thread thread = new Thread(new Task14());
            thread.start();

        }
    }
