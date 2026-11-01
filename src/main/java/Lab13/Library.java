package Lab13;

import java.util.Map;
import java.util.LinkedHashMap;

public class Library {
    private Map<String, Book> books = new LinkedHashMap<>();

    public void addBook(Book book) {
        books.put(book.getTitle(), book);
    }

    public Book findBook(String title) throws BookNotFoundException {
        Book book = books.get(title);
        if (book == null) {
            throw new BookNotFoundException("Книга " + title + "не найдена");

        }
        return book;
    }

    public void borrowBooks(String title) throws BookNotFoundException, BookNotAvailableException {
        Book book = findBook(title);
        book.borrow();
    }

    public void returnBook(String title) throws BookNotFoundException {
        Book book = findBook(title);
        book.returnBook();
    }

    public void printBook() {
        for (Book book : books.values()) {
            System.out.println("Названаие: " + book.getTitle());
            System.out.println("Автор: " + book.getAuthor());
            System.out.println("ISBN: " + book.getIsbn());
            System.out.println("Страниц: " + book.getPages());
            System.out.println("Доступна: " + book.isAvailable());
            System.out.println();
        }
    }
}
