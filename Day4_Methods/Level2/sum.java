

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid natural number greater than 0.");
            return;
        }

        int recursiveSum = sumRecursive(n);
        int formulaSum = sumFormula(n);

        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        if (recursiveSum == formulaSum) {
            System.out.println("Both methods give the same result. The computation is correct.");
        } else {
            System.out.println("The results do not match. There is an error in the computation.");
        }
    }

    // Method to find the sum of n natural numbers using recursion
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }

    // Method to find the sum of n natural numbers using the formula n*(n+1)/2
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }
    
}
