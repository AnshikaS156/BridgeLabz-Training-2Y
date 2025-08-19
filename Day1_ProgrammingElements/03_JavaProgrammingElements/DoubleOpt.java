import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter value for a: ");
        double a = scanner.nextInt();
        
        System.out.print("Enter value for b: ");
        double b = scanner.nextInt();
        
        System.out.print("Enter value for c: ");
        double c = scanner.nextInt();
        
        
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        System.out.println("Result of Int operations are "+ result1 + ", " + result2 + ", " + result3 + " and  " + result4);
        
        
        scanner.close();
    }
    
}
