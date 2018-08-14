import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
@RefreshScope
@EnableEurekaServer
@ComponentScan("com.uni")
public class EurakaApplicationMain {
    static Logger logger = LoggerFactory.getLogger("eureka");
    public static void main(String[] args) {
        logger.info("server start");
        SpringApplication.run(EurakaApplicationMain.class, args);
    }
}
