package com.example.lisbon;

public class Main {
    public static void main(String[] args) {
        Player[] players = {new Player("Peter"), new Player("Anne"), new Player("Manuel")};
        Game g = new Game(players, 100);
        g.game( );
    }
}
