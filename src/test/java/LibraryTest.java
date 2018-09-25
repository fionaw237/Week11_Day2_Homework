import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before() {
        library = new Library(2);
        book = new Book("Lord of the Rings", "J.R.R. Tolkein", "Fantasy");
    }

    @Test
    public void hasCapacity() {
        int capacity = library.getCapacity();
        assertEquals(2, capacity);
    }

    @Test
    public void startsWithNoBooks() {
        int bookCount = library.bookCount();
        assertEquals(0, bookCount);
    }

    @Test
    public void canAddBook() {
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }



    @Test
    public void DoesntAddBookIfNoSpace() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void canLendBook() {
        library.addBook(book);
        library.addBook(book);
        library.lend(book);
        assertEquals(1, library.bookCount());
    }


}
