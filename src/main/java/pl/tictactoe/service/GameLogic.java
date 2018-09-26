package pl.tictactoe.service;

import pl.tictactoe.board.Board;
import pl.tictactoe.board.TypeTicTacToe;
import pl.tictactoe.player.Player;
import pl.tictactoe.view.ViewBoard;

import java.util.Scanner;

public class GameLogic {

    Player playerOne = new Player(TypeTicTacToe.X);
    Player playerTwo = new Player(TypeTicTacToe.O);

    public void createGamers() {
        Scanner scanner = new Scanner(System.in);
        String nickOne = scanner.nextLine();
        playerOne.setNick(nickOne);

        String nickTwo = scanner.nextLine();
        playerTwo.setNick(nickTwo);
    }

    public void move(Player player, Board board) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        board.board[x][y].type = player.type;
    }

    public void game() {
        createGamers();
        Board board = new Board();
        boolean end = true;
        while(end) {
            ViewBoard.showBoard(board);
            move(playerOne, board);
            ViewBoard.showBoard(board);
           LogicService.check(board); //add if X or O exit!
            LogicService.isDraw(board);  //if true DRAW
            move(playerTwo, board);
            ViewBoard.showBoard(board);
            LogicService.check(board);  //add if X or O exit!
            LogicService.isDraw(board);  //if true DRAW
        }
    }
    //create player 1
    //create player 2

    //while :
    //move player 1
    //check if win or draw - if yes break and print winner
    //print table
    //move player 2
    //check if win or draw - if yes break and print winner
    //print table

    //extra add validation if player one to put X or O in already full position
}
