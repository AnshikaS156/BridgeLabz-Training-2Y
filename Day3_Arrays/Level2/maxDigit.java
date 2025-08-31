import java.util.Scanner;
public class maxDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        
        // Extracting digits and storing in the array
        while (number != 0) {
            if (index == maxDigit) {
                // Increase the size of the array by 10
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                for (int j = 0; j < digits.length; j++) {
                    temp[j] = digits[j];
                }
                digits = temp; // Assign the new array to digits
            }
            digits[index] = number % 10; // Get the last digit
            number /= 10; // Remove the last digit
            index++;
        }
        
        // Finding largest and second largest digits
        int largest = -1;
        int secondLargest = -1;
        
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // Update second largest
                largest = digits[i]; // Update largest
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i]; // Update second largest if it's not equal to largest
            }
        }
        
        // Displaying the results
        if (largest != -1) {
            System.out.println("The largest digit is: " + largest);
        } else {
            System.out.println("No digits found.");
        }
        
        if (secondLargest != -1) {
            System.out.println("The second largest digit is: " + secondLargest);
        } else {
            System.out.println("No second largest digit found.");
        }
        
        sc.close();
    }
    
}
