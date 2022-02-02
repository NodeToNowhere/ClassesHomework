import java.util.ArrayList;

public class Library {
    public String name;
    public ArrayList<Book> library;
    public int capacity;

    public Library(){
        this.name = "The Book Shop";
        this.library = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        if (capacity <= 10) {
            this.library.add(book);
            capacity += 1;
        } else {
            System.out.println("Library Full");
        }
    }

    public int countBooks(){
        return this.library.size();
    }
}
