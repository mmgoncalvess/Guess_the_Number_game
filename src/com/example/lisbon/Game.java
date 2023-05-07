package com.example.lisbon;

public class Game {

    private final int maxNumber;
    private final Player[] players;

    public Game(Player[] players, int maxNumber){
        this.players = players;
        this.maxNumber = maxNumber;
    }

    public void game() {
        int magicNumber = RandomGenerator.getRandom(maxNumber);
        int guessNumber;
        boolean endGame = false;
        int iterations = 0;
        while (!endGame) {
            for(Player player: players) {
                guessNumber = player.guessNumber(maxNumber);
                if(guessNumber == magicNumber) {
                    System.out.println(player.getName() + ": " + guessNumber + " You won!!!");
                    endGame = true;
                }
                System.out.println(player.getName() + ": " + guessNumber);
            }
            iterations++;
        }
        System.out.println("Iterations: " + iterations);
    }

}
