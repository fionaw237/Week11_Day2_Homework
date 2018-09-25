import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> books;

    public Borrower() {
        this.books = new ArrayList<>();
    }

    public int bookCount() {
        return this.books.size();
    }

    public void borrow(Book book, Library library) {
        this.books.add(book);
        library.lend(book);
    }
}
