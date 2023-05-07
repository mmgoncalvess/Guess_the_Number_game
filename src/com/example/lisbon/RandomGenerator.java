package com.example.lisbon;

import java.util.Random;

public class RandomGenerator {

    public static int getRandom(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }

}
