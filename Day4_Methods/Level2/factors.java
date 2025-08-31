
import java.util.Scanner;
public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int[] factorsArray = findFactors(num);
        System.out.print("Factors of " + num + " are: ");
        for (int factor : factorsArray) {
            System.out.print(factor + " ");
        }
        System.out.println();
        System.out.println("Sum of factors: " + sumOfFactors(factorsArray));
        System.out.println("Sum of squares of factors: " + sumOfSquaresOfFactors(factorsArray));
        System.out.println("Product of factors: " + productOfFactors(factorsArray));
        sc.close();
    }

    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int sumOfSquaresOfFactors(int[] factors) {
        int sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += factor * factor;
        }
        return sumOfSquares;
    }

    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
}
    
