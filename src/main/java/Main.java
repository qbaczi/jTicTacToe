import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main {

    private static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        Person person =  new Person(10,"TOm", "Jerry");


        log.info("{} {}",person,"test");

//utworzyc kolekcje stringow np. aaaaaaaa x 10000000

        //zrobic heap dump'a
        //pokazac mi go


    }
}
