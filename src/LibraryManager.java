import java.util.TreeSet;
public class LibraryManager {
    private TreeSet<String> books;
    public LibraryManager() {
        books = new TreeSet<>();
    }
    public void addBook(String title) {
        books.add(title);
    }
    public void removeBook(String title) {
        books.remove(title);
    }
    public boolean isBookAvailable(String title) {
        return books.contains(title);
    }
    public void displayAllBooks() {
        System.out.println("Library Books:");
        for (String book : books) {
            System.out.println(book);
        }
    }
    public void findBooksByStartingLetter(char letter) {
        System.out.println("Books starting with '" + letter + "':");
        for (String book : books) {
            if (book.toLowerCase().startsWith(
                    String.valueOf(letter).toLowerCase())) {
                System.out.println(book);
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        LibraryManager library = new LibraryManager();
        library.addBook("Java Programming");
        library.addBook("Data Structures");
        library.addBook("Algorithms");
        library.addBook("Computer Networks");
        library.displayAllBooks();
        System.out.println("\nIs 'Algorithms' available? "
                + library.isBookAvailable("Algorithms"));
        library.findBooksByStartingLetter('C');
        library.removeBook("Algorithms");
        library.displayAllBooks();
    }
}