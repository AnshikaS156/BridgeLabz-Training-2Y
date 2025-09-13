
import java.util.Scanner;
public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Convert number to string to easily access each digit
        String numStr = Integer.toString(number);
        int length = numStr.length();
        
        // Array to store frequency of digits 0-9
        int[] frequency = new int[10];
        
        // Calculate frequency of each digit
        for (int i = 0; i < length; i++) {
            char digitChar = numStr.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            frequency[digit]++;
        }
        
        // Display the frequency of each digit
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");
            }
        }
        
        sc.close();
    }
}
