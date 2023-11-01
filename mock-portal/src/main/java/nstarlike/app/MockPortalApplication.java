package nstarlike.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This class is an application class to mock MyData Portal.
 * This class uses the SpringBootApplication annotation 
 * to use auto-configuration, component-scan and to define extra configuration.
 * 
 * @author starlike
 */
@SpringBootApplication
public class MockPortalApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(MockPortalApplication.class, args);
	}

}
