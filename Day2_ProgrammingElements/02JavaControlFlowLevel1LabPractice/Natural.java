import java.util.Scanner;

public class Natural {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");

        if (input.hasNextDouble()) {  
            double d = input.nextDouble();

            // Check if it's a whole number and positive
            if (d > 0 && d == Math.floor(d)) {
                int n = (int) d;  // safe cast since it's whole
                int sum = (n * (n + 1)) / 2;
                System.out.println("The sum of " + n + " natural numbers is " + sum);
            } else {
                System.out.println("The number " + d + " is not a natural number");
            }
        }

        input.close();
    }
}
