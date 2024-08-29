package src.CoreJava.HT7;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Task1 {
    private static final Logger logger = Logger.getLogger(Task1.class.getName());
public static void main(String[] args){
    logger.info("This is an informational message");
    logger.warning("This is a warning message");
    logger.severe("This is a severe message");
    String name = "John";
    int age = 25;
    logger.log(Level.INFO, "User {0} is {1} years old", new Object[]{name, age});
    try {
        // Some code that may throw an exception
    } catch (Exception e) {
        logger.log(Level.SEVERE, "An error occurred", e);
    }
    Handler consoleHandler = new ConsoleHandler();
    consoleHandler.setLevel(Level.ALL);
    logger.addHandler(consoleHandler);
}


}
