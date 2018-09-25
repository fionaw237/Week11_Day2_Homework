import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int bookCount() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (hasSpace()){
            this.books.add(book);
        }
    }

    public boolean hasSpace() {
        return bookCount() < getCapacity();
    }

    public void lend(Book book) {
        this.books.remove(book);
    }
}
