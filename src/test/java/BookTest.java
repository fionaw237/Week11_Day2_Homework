import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before() {
        book = new Book("Lord of the Rings", "J.R.R. Tolkein", "Fantasy");
    }

    @Test
    public void hasTitle() {
        String title = book.getTitle();
        assertEquals("Lord of the Rings", title);
    }

    @Test
    public void hasAuthor() {
        String author = book.getAuthor();
        assertEquals("J.R.R. Tolkein", author);
    }

    @Test
    public void hasGenre() {
        String genre = book.getGenre();
        assertEquals("Fantasy", genre);
    }



}
