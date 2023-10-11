package panomete.playground.dynamiccors.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import panomete.playground.dynamiccors.payload.request.CheckPrimeRequest;
import panomete.playground.dynamiccors.payload.response.IsPrimeNumberDto;
import panomete.playground.dynamiccors.payload.response.SampleDto;
import panomete.playground.dynamiccors.service.PlaygroundService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class PlaygroundController {
    final PlaygroundService playgroundService;

    @GetMapping("/ping")
    public ResponseEntity<SampleDto> ping() {
        return new ResponseEntity<>(
                new SampleDto("pong"),
                HttpStatus.OK
        );
    }

    @GetMapping("/greeting")
    public ResponseEntity<SampleDto> greeting(
            @RequestParam(name = "name", required = false, defaultValue = "World") String name
    ) {
        return new ResponseEntity<>(
                new SampleDto(playgroundService.greeting(name)),
                HttpStatus.OK
        );
    }

    @GetMapping("/first-1000-primes")
    public ResponseEntity<List<Integer>> firstThousandsPrimeNumbers() {
        return new ResponseEntity<>(
                playgroundService.firstThousandsPrimeNumbers(),
                HttpStatus.OK
        );
    }

    @PostMapping("/check-prime")
    public ResponseEntity<IsPrimeNumberDto> checkPrime(
            @RequestBody CheckPrimeRequest request
    ) {
        IsPrimeNumberDto response = new IsPrimeNumberDto(
                playgroundService.isPrimeNumber(request.number())
        );
        return new ResponseEntity<>(
                response,
                HttpStatus.OK
        );
    }
}
