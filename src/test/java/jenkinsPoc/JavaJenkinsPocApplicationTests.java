package jenkinsPoc;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaJenkinsPocApplicationTests {

	Logger logger = LoggerFactory.getLogger(JavaJenkinsPocApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info(" application test executed");
	}

}
