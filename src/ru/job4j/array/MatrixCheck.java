package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        char check = board[row][0];
        for (int i = 1; i < board[row].length; i++) {
            if (board[row][i] != check) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        char check = board[0][column];
        for (int i = 1; i < board.length; i++) {
            if (board[i][column] != check) {
                result = false;
                break;
            }
        }
        return result;
    }
}