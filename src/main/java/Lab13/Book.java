package Lab13;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int pages;
    private boolean available;

    public Book(String title, String author, String isbn, int pages, boolean available)
            throws InvalidISBNException {
        if (isbn == null || !isbn.matches("\\d{3}-\\d-\\d{4}-\\d{4}-\\d")) {
            throw new InvalidISBNException("Неверный ISBN: " + isbn);
        }
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPages() {
        return pages;
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrow() throws BookNotAvailableException {
        if (!available) {
            throw new BookNotAvailableException("Книга " + title + " недоступна");
        }
        available = false;
        System.out.println("Книга " + title + "выдана");
    }

    public void returnBook() {
        available = true;
        System.out.println("Книга" + title + " возвращена");
    }

}
