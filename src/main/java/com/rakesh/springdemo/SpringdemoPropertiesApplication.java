package com.rakesh.springdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.rakesh.springdemo.properties.SomeExternalService;

@Configuration
@ComponentScan("com.rakesh.springdemo")
@PropertySource("classpath:app.properties")
public class SpringdemoPropertiesApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringdemoCompnentScanApplication.class);

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SpringdemoPropertiesApplication.class)) {
			SomeExternalService service = context.getBean(SomeExternalService.class);
			LOGGER.info("{}", service.returnServiceUrl());

		}

	}

}
