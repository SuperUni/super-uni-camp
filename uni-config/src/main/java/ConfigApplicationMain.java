import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
@ComponentScan("com.uni")
public class ConfigApplicationMain {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplicationMain.class, args);
    }
}
