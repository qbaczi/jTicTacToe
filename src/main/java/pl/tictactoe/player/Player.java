package pl.tictactoe.player;


import pl.tictactoe.board.TypeTicTacToe;

public class Player {

    public TypeTicTacToe type;
    public String nick;

    public Player(TypeTicTacToe type) {
        this.type = type;
    }


    public TypeTicTacToe getType() {
        return type;
    }

    public void setType(TypeTicTacToe type) {
        this.type = type;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
}