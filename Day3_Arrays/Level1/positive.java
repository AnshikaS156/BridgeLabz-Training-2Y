import java.util.Scanner;
public class positive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        
        for (int number : numbers) {
            if (number > 0) {
                if (number % 2 == 0) {
                    System.out.println(number + " is a positive even number.");
                } else {
                    System.out.println(number + " is a positive odd number.");
                }
            } else if (number < 0) {
                System.out.println(number + " is a negative number.");
            } else {
                System.out.println("The number is zero.");
            }
        }

        
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("The first and last elements are equal: " + numbers[0]);
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("The first element (" + numbers[0] + ") is greater than the last element (" + numbers[numbers.length - 1] + ").");
        } else {
            System.out.println("The first element (" + numbers[0] + ") is less than the last element (" + numbers[numbers.length - 1] + ").");
        }

        scanner.close();
    }
    
}
