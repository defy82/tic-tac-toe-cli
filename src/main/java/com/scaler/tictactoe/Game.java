package com.scaler.tictactoe;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Game {

    private Player p1;
    private Player p2;

    private Player nextTurn;

    private String[][] gameState = new String[3][3];

    public Game(String p1Char, String p2Char) {
        p1 = new Player(p1Char);
        p2 = new Player(p2Char);
        nextTurn = p1;
    }

    public String getCharInBox(int boxNo) {
        return gameState[boxNo/3][boxNo%3];
    }

    public void playTurn(int boxNo) {
        gameState[boxNo/3][boxNo%3] = nextTurn.getCharacter();
        nextTurn = nextTurn == p1 ? p2 : p1;
    }
}
