package Lessons.lesson_14.logs;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLog4j {
    public static void main(String[] args) {

        PropertyConfigurator.configure("src/main/resources/logs/configs/log4j.properties");

        Logger admin = Logger.getLogger("admin");
        admin.info("info");
        admin.warn("warn");
        admin.trace("trace");
        admin.fatal("fatal");

        Logger file = Logger.getLogger("file");
        file.info("info");
        file.warn("warn");
        file.trace("trace");
        file.fatal("fatal");

        try {
            System.out.println(2 / 0);
        } catch (RuntimeException e) {
            file.error(e.getMessage(), e);
        }

    }

    /**
     * TRACE
     * DEBUG
     * INFO
     * WARN
     * ERROR
     * FATAL
     * OFF
     */
}
