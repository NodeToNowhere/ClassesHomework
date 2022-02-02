import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book bookOne;

    @Before
    public void setUp(){
        bookOne = new Book("Speaker For The Dead","Orson Scott Card", "Sci-fi");
    }
    @Test
    public void canAddBookToLibrary(){
        library.addBook(bookOne);
        assertEquals(1, library.countBooks());
    }

}
