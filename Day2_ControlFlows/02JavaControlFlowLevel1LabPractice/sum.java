import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        double userInput;

        System.out.print("Enter numbers to sum: ");

        while (true) {
            userInput = scanner.nextDouble();
            if (userInput == 0) {
                break;
            }
            total += userInput;
        }

        System.out.println("The total sum is: " + total);
        scanner.close();
    }
    
}
