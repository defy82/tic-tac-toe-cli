package com.scaler.tictactoe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class GameTests {

    public static final String p1Char = "X";
    public static final String p2Char = "O";

    @Test
    void canCreateNewGame() {
        Game game = new Game(p1Char, p2Char);

        assertEquals(p1Char, game.getP1().getCharacter());
        assertEquals(p2Char, game.getP2().getCharacter());
        assertNull(game.getCharInBox(0));

    }

    @Test
    void testTurnMechanism() {
        Game game = new Game(p1Char, p2Char);

        assertEquals(game.getNextTurn(), game.getP1());

        game.playTurn(0);
        assertEquals(game.getCharInBox(0), p1Char);
        assertEquals(game.getNextTurn(), game.getP2());

    }
}
