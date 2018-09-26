package pl.tictactoe.view;

import pl.tictactoe.board.Board;

public class ViewBoard {


    public static void showBoard(Board board) {

        for(int i = 0; i < board.board.length; i++) {
            for (int j = 0; j < board.board.length; j++) {
                System.out.print(board.board[i][j].type.getValue());
            }
            System.out.println();
        }}



    }



