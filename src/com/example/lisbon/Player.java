package com.example.lisbon;

public class Player {

    private final String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int guessNumber(int max) {
        return RandomGenerator.getRandom(max);
    }
}
