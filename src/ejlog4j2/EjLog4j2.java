package ejlog4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Eduardo on 16/03/2018.
 */
public class EjLog4j2 {
    private static final Logger log = LogManager.getLogger(EjLog4j2.class.getName());
    public static void main (String[] args) {
        log.trace("trace message");
        log.debug("debug message");
        log.warn("warn message");
        log.info("info message");
        log.error("error message");
        log.fatal("fatal message");
    }

}
