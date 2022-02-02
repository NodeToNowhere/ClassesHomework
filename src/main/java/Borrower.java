import java.util.ArrayList;
import java.util.Arrays;

public class Borrower {
    public ArrayList<Book> borrowed;


    public Borrower(){
        this.borrowed = new ArrayList<Book>();
    }

    public int countBooks(){
        return this.borrowed.size();
    }
    public void borrowBook(Book book){
        this.borrowed.add(book);
    }
}
