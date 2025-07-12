package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringLearnApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(SpringLearnApplication.class, args);
		LOGGER.info("START");
		System.out.println("SpringLearnApplication has started successfully.");
		LOGGER.info("END");
	}

}


//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class SpringLearnApplication {
//
//	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
//
//	public static void main(String[] args) {
//
//
//		displayCountry();
//
//
//	}
//
//	public static void displayCountry() {
//		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
//
//		Country c = (Country) context.getBean("country", Country.class);
//
//		LOGGER.debug("Country: {}", c.toString());
//	}
//}
