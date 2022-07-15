package com.scaler.tictactoe;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Target;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTests {

    @Test
    void constructPlayer() {
        Player p1 = new Player("X");
        assertEquals("X", p1.getCharacter());
    }
}
