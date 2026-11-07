
package A_OOP.LibraryMgmt;

public class LibraryBook {

    private final String isbn;
    private final String title;
    private final String author;
    private boolean borrowed;

    public LibraryBook(String isbn, String title, String author) {
        this(isbn, title, author, false);
    }

    private LibraryBook(String isbn, String title, String author, boolean borrowed) {
        if (isbn == null || isbn.isBlank()) {
            throw new IllegalArgumentException("ISBN cannot be null or blank");
        }

        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be null or blank");
        }

        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("Author cannot be null or blank");
        }

        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.borrowed = borrowed;
    }

    public void borrow() {
        if (borrowed) {
            throw new IllegalStateException("Book is already borrowed.");
        }

        borrowed = true;
    }

    public boolean isBorrowed() {
        return borrowed;
    }
}
