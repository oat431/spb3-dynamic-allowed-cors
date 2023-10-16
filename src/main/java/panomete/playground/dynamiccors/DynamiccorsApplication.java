package panomete.playground.dynamiccors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DynamiccorsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamiccorsApplication.class, args);
    }

}
