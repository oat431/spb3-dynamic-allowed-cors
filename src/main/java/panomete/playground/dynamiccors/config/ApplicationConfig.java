package panomete.playground.dynamiccors.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Configuration
public class ApplicationConfig {

    private final String[] ALLOWED_METHOD = {
            "GET", "POST", "PUT", "DELETE", "OPTIONS"
    };

    private String[] getAllowedCors() throws IOException {
        ClassPathResource resource = new ClassPathResource("dynamic_cors.txt");
        File file = resource.getFile();
        Scanner in = new Scanner(file);
        List<String> allowedOrigins = new ArrayList<>();
        while(in.hasNext()) {
            allowedOrigins.add(in.nextLine());
        }
        String[] ALLOWED_ORIGINS = new String[allowedOrigins.size()];
        for(int i = 0; i < allowedOrigins.size(); i++) {
            ALLOWED_ORIGINS[i] = allowedOrigins.get(i);
        }
        return ALLOWED_ORIGINS;
    }

    WebMvcConfigurer corsConfigurer() throws IOException {
        String[] ALLOWED_ORIGINS = getAllowedCors();
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry
                        .addMapping("/**")
                        .allowedOrigins(ALLOWED_ORIGINS)
                        .allowedMethods(ALLOWED_METHOD);
            }
        };
    }
}
