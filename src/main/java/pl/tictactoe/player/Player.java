package pl.tictactoe.player;


import pl.tictactoe.board.Status;

public class Player {

    public Status status;
    public String nick;

    public Player(Status status, String nick) {
        this.status = status;
        this.nick = nick;
    }


    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
}