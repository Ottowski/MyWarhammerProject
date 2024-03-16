package org.example.utilities;

import java.util.Random;

public class DefaultRandomNumberGenerator implements RandomNumberGenerator {
    private final Random random;

    public DefaultRandomNumberGenerator() {
        this.random = new Random();
    }

    @Override
    public int nextInt(int bound) {
        return random.nextInt(bound);
    }
}
