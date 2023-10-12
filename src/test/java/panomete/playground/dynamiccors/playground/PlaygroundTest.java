package panomete.playground.dynamiccors.playground;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class PlaygroundTest {
    @Test
    void readFile() throws IOException {
        File file = new File("D:\\programming_practice\\java\\dynamiccors\\src\\main\\resources\\dynamic_cors.txt");
        Scanner in = new Scanner(file);
        List<String> allowedOrigin = new ArrayList<>();
        while(in.hasNext()) {
            allowedOrigin.add(in.nextLine());
        }
        for(String i : allowedOrigin) {
            System.out.println(i);
        }
        System.out.println(String.valueOf(allowedOrigin));
    }
}
