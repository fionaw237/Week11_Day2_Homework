import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book;

    @Before
    public void before() {
        borrower = new Borrower();
        library = new Library(2);
        book = new Book("Lord of the Rings", "J.R.R. Tolkein", "Fantasy");
    }

    @Test
    public void startsWithNoBooks() {
        int bookCount = borrower.bookCount();
        assertEquals(0, bookCount);
    }

    @Test
    public void canMoveBookToBorrowersCollection() {
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.bookCount());
        borrower.borrow(book, library);
        assertEquals(1, library.bookCount());
        assertEquals(1, borrower.bookCount());
    }
}
