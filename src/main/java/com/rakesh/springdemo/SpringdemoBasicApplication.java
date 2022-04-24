package com.rakesh.springdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.rakesh.springdemo.basic.BinarySearchImpl;

@Configuration
@ComponentScan("com.rakesh.springdemo")
public class SpringdemoBasicApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringdemoCompnentScanApplication.class);

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SpringdemoBasicApplication.class)) {
			BinarySearchImpl binarySearch = context.getBean(BinarySearchImpl.class);
			LOGGER.info("{}", binarySearch);
			BinarySearchImpl binarySearch1 = context.getBean(BinarySearchImpl.class);
			LOGGER.info("{}", binarySearch1);

		}

	}

}
