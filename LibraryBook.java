import java.util.Scanner;

public class LibraryBook {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input book details
        System.out.print("Enter Book Title: ");
        String bookTitle = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String authorName = sc.nextLine();

        System.out.print("Enter Book ID: ");
        String bookId = sc.nextLine().toUpperCase();

        System.out.print("Is book available? (true/false): ");
        boolean isAvailable = sc.nextBoolean();

        // Input ratings
        System.out.print("Enter number of ratings: ");
        int numRatings = sc.nextInt();

        if (numRatings == 0) {
            System.out.println("No ratings available!");
            return;
        }

        int[] bookRatings = new int[numRatings];
        for (int i = 0; i < numRatings; i++) {
            System.out.print("Enter rating " + (i + 1) + ": ");
            bookRatings[i] = sc.nextInt();
        }

        // Display book info
        displayBookInfo(bookTitle, authorName, bookId, isAvailable);

        // String operations
        System.out.println("Author Name Length: " + authorName.length());
        compareAuthorNames(authorName, "Shakespeare");

        // Display ratings and calculate statistics
        System.out.println("===== RATINGS =====");
        for (int i = 0; i < numRatings; i++) {
            System.out.println("Rating " + (i + 1) + " → " + bookRatings[i]);
            if (bookRatings[i] == 1) {
                System.out.println("One user gave a poor rating!");
            }
        }

        int totalRatings = calculateTotalRatings(bookRatings);
        double averageRating = calculateAverageRating(bookRatings);

        System.out.println("Total Ratings: " + totalRatings);
        System.out.printf("Average Rating: %.1f\n", averageRating);

        if (averageRating >= 4) {
            System.out.println("Book Status: Highly Rated Book!");
        } else {
            System.out.println("Book Status: Average Book");
        }

        sc.close();
    }

    // === METHODS ===
    static void displayBookInfo(String title, String author, String id, boolean isAvailable) {
        System.out.println("===== BOOK INFO =====");
        System.out.println("Title: " + title.toUpperCase());
        System.out.println("Author: " + author);
        System.out.println("Book ID: " + id.toUpperCase());
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    static int calculateTotalRatings(int[] ratings) {
        return ratings.length;
    }

    static double calculateAverageRating(int[] ratings) {
        int sum = 0;
        for (int r : ratings) {
            sum += r;
        }
        return (double) sum / ratings.length;
    }

    static void compareAuthorNames(String a1, String a2) {
        if (a1.equalsIgnoreCase(a2)) {
            System.out.println("Comparing with '" + a2 + "' → Same author");
        } else {
            System.out.println("Comparing with '" + a2 + "' → Different authors");
        }
    }
}
