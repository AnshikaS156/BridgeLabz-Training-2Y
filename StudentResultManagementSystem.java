// ...existing code...
import java.util.Scanner;

public class StudentResultManagementSystem{
    static class InvalidMarksException extends Exception {
        InvalidMarksException(String message) { super(message); }
    }

    static class InvalidAgeException extends Exception {
        InvalidAgeException(String message) { super(message); }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            if (name == null || name.trim().isEmpty()) {
                throw new NullPointerException("No name entered");
            }

            System.out.print("Enter age: ");
            int age = Integer.parseInt(sc.nextLine());
            validateAge(age); // may throw InvalidAgeException

            final int n = 3;
            int[] marks = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.printf("Marks for subject %d: ", i + 1);
                marks[i] = Integer.parseInt(sc.nextLine());
            }

            validateMarks(marks); // may throw InvalidMarksException

            if (marks.length == 0) { // defensive: handle division by zero
                throw new ArithmeticException("No marks to compute average");
            }
            int total = 0;
            for (int m : marks) total += m;
            double average = (double) total / marks.length;

            System.out.println("\n--- Student Result ---");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Total: " + total);
            System.out.printf("Average: %.2f%n", average);

            // Intentional ArrayIndexOutOfBoundsException
            try {
                System.out.println("Accessing extra index (intentional): " + marks[3]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index is out of bounds (intentional): " + e.getMessage());
            }

        } catch (NullPointerException e) {
            System.out.println("Name error: " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid numeric input.");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        } finally {
            System.out.println("Result processing completed");
            sc.close();
        }
    }

    static void validateMarks(int[] marks) throws InvalidMarksException {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 0 || marks[i] > 100) {
                throw new InvalidMarksException("Invalid marks at subject " + (i + 1) + ": " + marks[i]);
            }
        }
    }

    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Not valid age to vote: " + age);
        }
    }
}
// ...existing code...






