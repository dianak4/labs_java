package lab5.Eleven_5;

import lab5.Eleven_5.TicTacToe;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {
    @Test
    public void testMakeMove() {
        TicTacToe game = new TicTacToe();
        assertTrue(game.makeMove(0, 0, 'X'));
        assertFalse(game.makeMove(0, 0, 'O')); // Клітинка зайнята
        assertFalse(game.makeMove(3, 3, 'X')); // Позамежне значення
    }

    @Test
    public void testWinner() {
        TicTacToe game = new TicTacToe();
        game.makeMove(0, 0, 'X');
        game.makeMove(0, 1, 'X');
        game.makeMove(0, 2, 'X');
        assertTrue(game.isWinner('X'));
        assertFalse(game.isWinner('O'));
    }

    @Test
    public void testDraw() {
        TicTacToe game = new TicTacToe();
        game.makeMove(0, 0, 'X');
        game.makeMove(0, 1, 'O');
        game.makeMove(0, 2, 'X');
        game.makeMove(1, 0, 'X');
        game.makeMove(1, 1, 'O');
        game.makeMove(1, 2, 'X');
        game.makeMove(2, 0, 'O');
        game.makeMove(2, 1, 'X');
        game.makeMove(2, 2, 'O');
        assertTrue(game.isDraw());
        assertFalse(game.isWinner('X'));
        assertFalse(game.isWinner('O'));
    }

    @Test
    public void testResetGame() {
        TicTacToe game = new TicTacToe();
        game.makeMove(0, 0, 'X');
        game.resetGame();
        char[][] board = game.getBoard();
        for (char[] row : board) {
            for (char cell : row) {
                assertEquals(' ', cell); // Всі клітинки мають бути порожніми
            }
        }
    }
}
