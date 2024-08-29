package src.CoreJava.HT7;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.io.IOException;

public class Task3 {

    private static final Logger logger = Logger.getLogger(Task3.class.getName());

        public static void main(String[] args) {
            try {
                // Configure the logger to log messages to a file
                FileHandler fileHandler = new FileHandler("logs.log");
                fileHandler.setFormatter(new SimpleFormatter());
                logger.addHandler(fileHandler);

                // Log some messages
                logger.info("This is an informational message");
                logger.warning("This is a warning message");
                logger.severe("This is a severe message");
            } catch (IOException e) {
                logger.log(Level.SEVERE, "Error occurred while configuring logger", e);
            }
        }
    }

