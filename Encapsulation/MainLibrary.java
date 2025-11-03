interface Reservable {
    void reserveItem();
    void checkAvailability();
}

abstract class LibraryItem {
    private int itemId;
    private String title, author;

    public LibraryItem(int id, String title, String author) {
        this.itemId = id;
        this.title = title;
        this.author = author;
    }

    public void getItemDetails() {
        System.out.println("ID: " + itemId + ", Title: " + title + ", Author: " + author);
    }

    abstract int getLoanDuration();
}

class Book extends LibraryItem implements Reservable {
    public Book(int id, String t, String a) { super(id, t, a); }
    public int getLoanDuration() { return 14; }
    public void reserveItem() { System.out.println("Book reserved successfully."); }
    public void checkAvailability() { System.out.println("Book available."); }
}

public class MainLibrary {
    public static void main(String[] args) {
        LibraryItem item = new Book(1, "OOP Concepts", "James Gosling");
        item.getItemDetails();
        System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
    }
}
