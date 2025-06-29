package Week2JunitMockitoSlf4j.src.main.java.org.sagnik.week2junitmockitoslf4j.LoggingSLF4J;

package com.example.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        logger.error("This is an error message");
        logger.warn("This is a warning message");
    }
}
