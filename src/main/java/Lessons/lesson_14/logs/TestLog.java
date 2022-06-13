package Lessons.lesson_14.logs;

import java.io.IOException;
import java.util.Date;
import java.util.logging.*;

public class TestLog {

    private static final Logger logger = Logger.getLogger("testLog");

    public static void main(String[] args) throws IOException {

        logger.setLevel(Level.ALL);

        Handler handler = new FileHandler("src/main/resources/logs/logFromLogger.log");
        logger.addHandler(handler);

        handler.setLevel(Level.ALL);
        //handler.setFormatter(new XMLFormatter());
        handler.setFormatter(new Formatter() {
            @Override
            public String format(LogRecord record) {
                return String.format("%s\t%s\t%s%n", record.getLevel(), new Date(record.getMillis()), record.getMessage());
            }
        });

        logger.log(Level.SEVERE, "Logging S");
        logger.finer("Logging F");
        logger.info("Logging I");
        logger.warning("Logging W");
        logger.config("Logging C");


        //OFF
        //SEVERE
        //WARNING
        //INFO
        //----------
        //CONFIG
        //FINE(3)
        //ALL
    }
}
