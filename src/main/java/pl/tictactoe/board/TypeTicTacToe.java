package pl.tictactoe.board;

public enum TypeTicTacToe {

    X("X"),
    O("O"),
    EMPTY(" ");

    private final String value;


    private TypeTicTacToe(String value) {
        this.value = value;

    }


    public String getValue() {
        return value;
    }
}
