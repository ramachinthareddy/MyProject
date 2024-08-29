package src.CoreJava.HT7;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
public class Task4 {

        private static final Logger logger = Logger.getLogger(Task4.class.getName());

        public static void main(String[] args) {
            // Configure the logger to log messages in a custom format
            ConsoleHandler consoleHandler = new ConsoleHandler();
            consoleHandler.setFormatter(new CustomFormatter());
            logger.addHandler(consoleHandler);

            // Log some messages
            logger.info("This is an informational message");
            logger.warning("This is a warning message");
            logger.severe("This is a severe message");
        }

        static class CustomFormatter extends Formatter {
            @Override
            public String format(LogRecord record) {
                StringBuilder builder = new StringBuilder();
                builder.append("[")
                        .append(record.getLevel())
                        .append("] ")
                        .append(record.getMessage())
                        .append("\n");
                return builder.toString();
            }
        }
    }

