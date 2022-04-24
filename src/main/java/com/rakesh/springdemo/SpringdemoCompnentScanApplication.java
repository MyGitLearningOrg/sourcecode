package com.rakesh.springdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rakesh.componentscan.ComponentDao;

public class SpringdemoCompnentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringdemoCompnentScanApplication.class);

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SpringdemoCompnentScanApplication.class)) {
			ComponentDao componentDao = context.getBean(ComponentDao.class);
			ComponentDao componentDao1 = context.getBean(ComponentDao.class);
			LOGGER.info("{}", componentDao);
			LOGGER.info("{}", componentDao.getComonentJdbcConnection());
			LOGGER.info("{}", componentDao1);
			LOGGER.info("{}", componentDao1.getComonentJdbcConnection());
		}
	}

}
