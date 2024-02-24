package jenkinsPoc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class JenkinsPocApplication {

	Logger logger = LoggerFactory.getLogger(JenkinsPocApplication.class);
	public void sampleMethod(){
		logger.info("Application  log started");

	}
	public static void main(String[] args) {
		SpringApplication.run(JenkinsPocApplication.class, args);
	}

}