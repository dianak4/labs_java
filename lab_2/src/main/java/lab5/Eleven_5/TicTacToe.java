package lab5.Eleven_5;

import java.util.Arrays;

public class TicTacToe implements TicTacToeGame {
    private final char[][] board;  // Поле 3х3
    private static final int SIZE = 3;

    public TicTacToe() {
        board = new char[SIZE][SIZE];
        resetGame();  // Ініціалізація порожнього поля
    }

    @Override
    public boolean makeMove(int row, int col, char player) {
        if (row < 0 || row >= SIZE || col < 0 || col >= SIZE) {
            return false; // Перевірка меж
        }
        if (board[row][col] != ' ') {
            return false; // Перевірка, чи місце вільне
        }
        board[row][col] = player;
        return true;
    }

    @Override
    public boolean isWinner(char player) {
        // Перевірка рядків, колонок і діагоналей
        for (int i = 0; i < SIZE; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) || // Рядок
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player)) { // Колонка
                return true;
            }
        }
        // Діагоналі
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isDraw() {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell == ' ') {
                    return false; // Якщо є порожні клітинки, це не нічия
                }
            }
        }
        return !isWinner('X') && !isWinner('O'); // Нічия, якщо немає переможця
    }

    @Override
    public void resetGame() {
        for (char[] row : board) {
            Arrays.fill(row, ' '); // Очистка поля
        }
    }

    @Override
    public char[][] getBoard() {
        return board.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TicTacToe ticTacToe = (TicTacToe) o;
        return Arrays.deepEquals(board, ticTacToe.board);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(board);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TicTacToe Board:\n");
        for (char[] row : board) {
            for (char cell : row) {
                sb.append(cell == ' ' ? '-' : cell).append(' ');
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
