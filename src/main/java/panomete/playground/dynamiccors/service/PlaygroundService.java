package panomete.playground.dynamiccors.service;

import java.util.List;

public interface PlaygroundService {
    String greeting(String name);
    List<Integer> firstThousandsPrimeNumbers();
    Boolean isPrimeNumber(Integer number);
}
