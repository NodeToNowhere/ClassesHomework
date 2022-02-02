import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class BorrowerTest {
    Borrower borrower;
    Library library;
    Book bookOne;


    @Before
    public void setUp(){
        bookOne = new Book("Speaker For The Dead","Orson Scott Card", "Sci-fi");
    }


    @Test
    public void canMoveBook(){
        borrower.borrowBook(bookOne);
        assertEquals(1, borrower.countBooks());

    }
}

