package pl.tictactoe.service;

import pl.tictactoe.board.Board;
import pl.tictactoe.board.Status;
import pl.tictactoe.board.TypeTicTacToe;

import java.util.Optional;

public class LogicService {


    public static Optional<Object> check(Board board) {
        Status[][] t = board.board;

        for (int i = 0; i < t.length; i++) {
            if (!t[i][0].type.equals(TypeTicTacToe.EMPTY)
                    && t[i][0].type.equals(t[i][1].type)
                    && t[i][0].type.equals(t[i][2].type)
                    ) {
                return Optional.ofNullable(t[i][0].type.getValue());
            }

            if (!t[0][i].type.equals(TypeTicTacToe.EMPTY)
                    && t[0][i].type.equals(t[1][i].type)
                    && t[0][i].type.equals(t[2][i].type)
                    ) {
                return Optional.ofNullable(t[0][i].type.getValue());
            }
        }

        if(!t[0][0].type.equals(TypeTicTacToe.EMPTY)
                && t[0][0].type.equals(t[1][1].type)
                && t[1][1].type.equals(t[2][2].type)) {
            return Optional.ofNullable(t[0][0].type.getValue());
        }


        if (!t[0][2].type.equals(TypeTicTacToe.EMPTY)
                && t[0][2].type.equals(t[1][1].type)
                && t[0][2].type.equals(t[2][0].type)
                ) {
            return Optional.ofNullable(t[1][1].type.getValue());
        }


        return Optional.empty();
    }

    public static boolean isDraw(Board board) {
        if(isFull(board) && !check(board).isPresent())
            return true;
        else return false;
    }

    public static boolean isFull(Board board) {
        Status[][] t = board.board;

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {

                if (t[i][j].type.equals(TypeTicTacToe.EMPTY))
                    return false;
            }}
            return true;

    }
}
