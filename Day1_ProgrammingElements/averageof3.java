import java.util.Scanner;
public class averageof3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        
        double average = calculateAverage(num1, num2, num3);
        System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " is: " + average);
        
        scanner.close();
    }

    public static double calculateAverage(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }
    
    
}
