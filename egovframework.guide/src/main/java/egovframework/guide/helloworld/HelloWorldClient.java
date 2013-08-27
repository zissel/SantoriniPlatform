package egovframework.guide.helloworld;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldClient {
	
	private static Log logger = LogFactory.getLog(HelloWorldClient.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
				
		String configLocation = "context-helloworld.xml"; 
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		HelloWorldService helloworld = (HelloWorldService)context.getBean("helloworld");
		
		logger.debug(helloworld.sayHello());
	}

}
