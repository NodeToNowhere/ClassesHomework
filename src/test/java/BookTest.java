import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {
    Book bookOne;

    @Before
    public void setup(){
        bookOne = new Book("Speaker For The Dead","Orson Scott Card", "Sci-fi");

    }
    @Test
    public void checkForName(){

        assertEquals("Speaker For The Dead", this.bookOne.name );
    }
    @Test
    public void checkForAuthor(){

        assertEquals("Orson Scott Card", this.bookOne.author );
    }
    @Test
    public void checkForGenre(){

        assertEquals("Sci-fi", this.bookOne.genre );
    }
}
