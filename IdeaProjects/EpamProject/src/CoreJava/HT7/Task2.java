package src.CoreJava.HT7;

import java.util.logging.Logger;
import java.util.logging.Level;
public class Task2 {

        private static final Logger logger = Logger.getLogger(Task2.class.getName());

        public static void main(String[] args) {
            divideNumbers(10, 2);
            divideNumbers(10, 0);
        }

        public static void divideNumbers(int dividend, int divisor) {
            try {
                int result = dividend / divisor;
                logger.log(Level.INFO, "Division result: {0}", result);

            } catch (ArithmeticException e) {
                logger.log(Level.WARNING, "Error occurred while dividing", e);
            }
        }
    }

