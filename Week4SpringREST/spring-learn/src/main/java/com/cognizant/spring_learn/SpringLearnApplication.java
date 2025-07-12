package com.cognizant.spring_learn;



//@SpringBootApplication
//public class SpringLearnApplication {
//
//	public static void main(String[] args) {
//
//		SpringApplication.run(SpringLearnApplication.class, args);
//		System.out.println("SpringLearnApplication has started successfully.");
//	}
//
//}


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {
		LOGGER.info("START");

		displayCountry();

		LOGGER.info("END");
	}

	public static void displayCountry() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

		Country c = (Country) context.getBean("country", Country.class);

		LOGGER.debug("Country: {}", c.toString());
	}
}
