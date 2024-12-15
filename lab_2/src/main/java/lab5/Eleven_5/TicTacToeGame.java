package lab5.Eleven_5;

public interface TicTacToeGame {
    boolean makeMove(int row, int col, char player); // Зробити хід
    boolean isWinner(char player);                  // Перевірити, чи є переможець
    boolean isDraw();                               // Перевірити, чи є нічия
    void resetGame();                               // Скинути гру
    char[][] getBoard();                            // Отримати стан поля
}
