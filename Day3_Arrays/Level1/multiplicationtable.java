import java.util.Scanner;
public class multiplicationtable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int[] multiplicationTable = new int[10];

        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i;
        }

        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationTable[i - 1]);
        }

        scanner.close();
    }
    
}
