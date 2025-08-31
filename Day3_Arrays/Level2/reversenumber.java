import java.util.Scanner;   
public class reversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Finding the count of digits
        int tempNumber = number;
        int count = 0;
        while (tempNumber != 0) {
            tempNumber /= 10;
            count++;
        }
        
        // Creating an array to store the digits
        int[] digits = new int[count];
        
        // Extracting digits and storing in the array
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10; // Get the last digit
            number /= 10; // Remove the last digit
        }
        
        // Displaying the digits in reverse order
        System.out.print("The digits in reverse order are: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i] + " ");
        }
        
        sc.close();
    }
    
}
