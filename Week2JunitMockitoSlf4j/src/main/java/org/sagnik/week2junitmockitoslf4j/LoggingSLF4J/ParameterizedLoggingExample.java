package Week2JunitMockitoSlf4j.src.main.java.org.sagnik.week2junitmockitoslf4j.LoggingSLF4J;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {
        String username = "sagnik31";
        int loginAttempts = 5;
        double balance = 1542.75;

        logger.info("User {} has logged in successfully.", username);
        logger.warn("User {} has attempted to login {} times.", username, loginAttempts);
        logger.error("User {} has insufficient balance. Current balance: ${}", username, balance);
    }
}

