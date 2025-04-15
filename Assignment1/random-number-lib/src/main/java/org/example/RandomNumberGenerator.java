package org.example;

import java.util.Random;

public class RandomNumberGenerator {
    public int generate() {
        return new Random().nextInt(1000000);
    }
}
