package panomete.playground.dynamiccors.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlaygroundServiceImpl implements PlaygroundService{
    @Override
    public String greeting(String name) {
        return "Hello".concat(", ").concat(name).concat("!");
    }

    @Override
    public List<Integer> firstThousandsPrimeNumbers() {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < 1000; i++) {
            if (isPrimeNumber(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    @Override
    public Boolean isPrimeNumber(Integer number) {
        if(number < 2) {
            return false;
        }
        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
