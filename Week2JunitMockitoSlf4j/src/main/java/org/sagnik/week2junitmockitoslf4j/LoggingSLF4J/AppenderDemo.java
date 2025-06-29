package Week2JunitMockitoSlf4j.src.main.java.org.sagnik.week2junitmockitoslf4j.LoggingSLF4J;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppenderDemo {
    private static final Logger logger = LoggerFactory.getLogger(AppenderDemo.class);

    public static void main(String[] args) {
        logger.debug("Debug message - useful for development");
        logger.info("Info message - general runtime information");
        logger.warn("Warning message - something might be wrong");
        logger.error("Error message - something is definitely wrong");
    }
}
