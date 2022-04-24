package com.rakesh.springdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rakesh.springdemo.xml.XmlPersonDao;

//@Configuration
//@ComponentScan("com.rakesh.springdemo")
public class SpringdemoXmlContextApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringdemoCompnentScanApplication.class);

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml")) {
			LOGGER.info("Beans Loaded-> {}",(Object)context.getBeanDefinitionNames());
			XmlPersonDao personDao = context.getBean(XmlPersonDao.class);
			LOGGER.info("{} {}",personDao,personDao.getXmlJdbcConnection());
		}

	}

}
