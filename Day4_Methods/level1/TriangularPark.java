import java.util.Scanner;

public class TriangularPark {
    public static double calculatePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static int calculateRounds(double perimeter) {
        return (int) Math.ceil(5000 / perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 sides of triangular park: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double perimeter = calculatePerimeter(a, b, c);
        System.out.println("Rounds required = " + calculateRounds(perimeter));
        sc.close();
    }
}
