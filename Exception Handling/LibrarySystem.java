import java.util.*;

class BookNotAvailableException extends Exception { public BookNotAvailableException(String m){ super(m);} }
class InvalidReturnException extends Exception { public InvalidReturnException(String m){ super(m);} }
class UserLimitExceededException extends Exception { public UserLimitExceededException(String m){ super(m);} }

class Library {
    Map<String, Boolean> books = new HashMap<>();
    Map<String, Integer> userBorrowCount = new HashMap<>();

    Library() {
        books.put("Java", true);
        books.put("Python", false);
        books.put("C++", true);
    }

    void borrowBook(String user, String book) throws BookNotAvailableException, UserLimitExceededException {
        if (!books.containsKey(book) || !books.get(book))
            throw new BookNotAvailableException(book + " not available!");
        if (userBorrowCount.getOrDefault(user, 0) >= 5)
            throw new UserLimitExceededException("Borrowing limit exceeded!");
        books.put(book, false);
        userBorrowCount.put(user, userBorrowCount.getOrDefault(user, 0) + 1);
        System.out.println(user + " borrowed " + book);
    }

    void returnBook(String user, String book) throws InvalidReturnException {
        if (books.get(book))
            throw new InvalidReturnException(book + " was not borrowed!");
        books.put(book, true);
        System.out.println(user + " returned " + book);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Library lib = new Library();
        try {
            lib.borrowBook("Anshika", "Python");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

