package pl.tictactoe.board;

public class Board {
    public Status[][] board;

    public Board() {
        this.board = new Status[3][3];

        for(int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = new Status();
            }

        }}


    }

