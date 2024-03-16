package org.example.utilities;

public class MockRandomNumberGenerator implements RandomNumberGenerator {
    private final int[] sequence;
    private int index;

    public MockRandomNumberGenerator(int[] sequence) {
        this.sequence = sequence;
        this.index = 0;
    }

    @Override
    public int nextInt(int bound) {
        int result = sequence[index];
        index = (index + 1) % sequence.length;
        return result;
    }
}
