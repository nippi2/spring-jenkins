package jenkinsPoc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class JenkinsPocApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsPocApplication.class);
	public void sampleMethod(){
		logger.info("Application  log started");

	}
	public static void main(String[] args) {
		logger.info(" spring main class executed");
		SpringApplication.run(JenkinsPocApplication.class, args);
	}

}
