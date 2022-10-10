package org.example;

import static org.junit.jupiter.api.Assertions.*;

class GameFieldTest {

    @org.junit.jupiter.api.Test
    void getLeft() {
        GameField gameField = new GameField();
        assertEquals(false, gameField.getLeft());
    }

    @org.junit.jupiter.api.Test
    void getRight() {
        GameField gameField = new GameField();
        assertEquals(false, gameField.getRight());
    }

    @org.junit.jupiter.api.Test
    void getUp() {
        GameField gameField = new GameField();
        assertEquals(false, gameField.getUp());
    }

    @org.junit.jupiter.api.Test
    void getDown() {
        GameField gameField = new GameField();
        assertEquals(false, gameField.getDown());
    }
}