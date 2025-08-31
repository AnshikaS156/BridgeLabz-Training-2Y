import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int[] multiplicationResult = new int[4]; // To store results for 6, 7, 8, and 9

        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i; // Store result in array
        }

        System.out.println("Multiplication table of " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        sc.close();
    }
    
}
