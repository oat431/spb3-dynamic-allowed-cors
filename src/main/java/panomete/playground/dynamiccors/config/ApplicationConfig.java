package panomete.playground.dynamiccors.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Configuration
public class ApplicationConfig {

    private final String[] ALLOWED_METHOD = {
            "GET", "POST", "PUT", "DELETE", "OPTIONS"
    };

//    @Bean
//    CorsConfigurationSource corsConfigurationSource() throws FileNotFoundException {
//        CorsConfiguration configuration = new CorsConfiguration();
//        configuration.setAllowedOrigins(ALLOWED_ORIGINS);
//        configuration.setAllowedMethods(List.of(ALLOWED_METHOD));
//        configuration.setAllowedHeaders(List.of("*"));
//        configuration.setExposedHeaders(List.of("*"));
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", configuration);
//        return source;
//    }

    @Bean
    WebMvcConfigurer corsConfigurer() throws FileNotFoundException {
        File file = new File("D:\\programming_practice\\java\\dynamiccors\\src\\main\\resources\\dynamic_cors.txt");
        Scanner in = new Scanner(file);
        List<String> allowedOrigin = new ArrayList<>();
        while(in.hasNext()) {
            allowedOrigin.add(in.nextLine());
        }
        String[] ALLOWED_ORIGINS = new String[allowedOrigin.size()];
        for(int i=0;i<allowedOrigin.size();i++) {
            ALLOWED_ORIGINS[i] = allowedOrigin.get(i);
        }
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
