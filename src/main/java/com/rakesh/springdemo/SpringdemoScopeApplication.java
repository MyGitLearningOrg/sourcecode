package com.rakesh.springdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rakesh.springdemo.scope.PersonDao;

public class SpringdemoScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringdemoScopeApplication.class);

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SpringdemoScopeApplication.class)) {
			PersonDao personDao = context.getBean(PersonDao.class);
			PersonDao personDao1 = context.getBean(PersonDao.class);
			LOGGER.info("{}", personDao);
			LOGGER.info("{}", personDao.getJdbcConnection());
			LOGGER.info("{}", personDao1);
			LOGGER.info("{}", personDao1.getJdbcConnection());
		}
	}

}
