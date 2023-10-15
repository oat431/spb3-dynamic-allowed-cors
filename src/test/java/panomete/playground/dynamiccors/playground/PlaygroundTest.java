package panomete.playground.dynamiccors.playground;

import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class PlaygroundTest {
    @Test
    void readFile() throws IOException {
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
        for(String s : ALLOWED_ORIGINS) {
            System.out.println(s);
        }
    }
}
