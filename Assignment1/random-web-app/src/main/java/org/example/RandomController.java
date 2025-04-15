package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomController {

    private final RandomNumberGenerator rng = new RandomNumberGenerator();

    @GetMapping("/random")
    public String getRandom() {
        int number = rng.generate();
        System.out.println("Generated Number: " + number);
        return "Random number generated. Check console.";
    }
}
