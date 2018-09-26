import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.tictactoe.board.Board;
import pl.tictactoe.view.ViewBoard;


public class Main {

    private static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {


        ViewBoard.showBoard(new Board());

        //TODO 1: klasa player z polami typ X/O oraz nazwa
        //TODO 2: klasa logika = sprawdzajaca czy ktos wygral (ify)

    }
}
