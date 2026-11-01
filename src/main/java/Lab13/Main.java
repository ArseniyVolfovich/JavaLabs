
package Lab13;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        try {
            library.addBook(new Book("Война и мир", "Лев Толстой", "978-5-1234-5678-9", 1200, true));
            library.addBook(new Book("Мастер и Маргарита", "Михаил Булгаков", "978-5-4321-8765-0", 480, true));
            library.addBook(new Book("Преступление и наказание", "Федор Достоевский", "1234", 670, true));
        } catch (InvalidISBNException e) {
            System.err.println("Ошибка: " + e.getMessage());

        }


        System.out.println("Список книг:");
        library.printBook();

        try {
            library.borrowBooks("Война и мир");
            library.borrowBooks("Война и мир");

        } catch (BookNotFoundException | BookNotAvailableException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        try{
            library.returnBook("Война и мир");
        }catch(BookNotFoundException e){
            System.out.println("Ошибка"+e.getMessage());
        }

        try {
            library.borrowBooks("Гарри Поттер");
        } catch (BookNotFoundException | BookNotAvailableException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            Book book = new Book("Тестовая книга", "Автор", "12345", 100, true);
            library.addBook(book);
        } catch (InvalidISBNException e) {
            System.out.println("Ошибка: " + e.getMessage());

        }
        System.out.println();
        System.out.println("Состояние библиотеки");
        library.printBook();

    }
}
