import java.util.Map;
import java.util.TreeMap;

public class LibraryCatalog {

    private Map<String, String> catalog = new TreeMap<>();

    public void addBook(String isbn, String title) {
        catalog.put(isbn, title);
    }

    public void removeBook(String isbn) {
        if (catalog.containsKey(isbn)) {
            catalog.remove(isbn);
        }
    }

    public void searchByISBN(String isbn) {
        if (catalog.containsKey(isbn)) {
            System.out.println(isbn + " -> " + catalog.get(isbn));
        } else {
            System.out.println("Book not found");
        }
    }

    public void searchByTitle(String title) {
        boolean found = false;
        for (String key : catalog.keySet()) {
            if (catalog.get(key).equalsIgnoreCase(title)) {
                System.out.println(key + " -> " + catalog.get(key));
                found = true;
            }
        }
        if (!found) {
            System.out.println("Title not found");
        }
    }

    public void printAll() {
        for (String isbn : catalog.keySet()) {
            System.out.println(isbn + " -> " + catalog.get(isbn));
        }
    }

    public static void main(String[] args) {
        LibraryCatalog lib = new LibraryCatalog();

        lib.addBook("978-001", "Java Programming");
        lib.addBook("978-002", "Data Structures");
        lib.addBook("978-003", "Algorithms");

        lib.searchByISBN("978-001");
        lib.searchByTitle("Algorithms");

        System.out.println("All books:");
        lib.printAll();

        lib.removeBook("978-002");

        System.out.println("After removal:");
        lib.printAll();
    }
}
