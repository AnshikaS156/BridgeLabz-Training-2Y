
import java.util.Scanner;

public class Tigonometric{
    public static double[] calculateTrigonometricFunctions(double angle) {
        double rad = Math.toRadians(angle);
        double sin = Math.sin(rad);
        double cos = Math.cos(rad);
        double tan = Math.tan(rad);
        return new double[]{sin, cos, tan};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();
        double[] trig = calculateTrigonometricFunctions(angle);
        System.out.printf("sin = %.4f, cos = %.4f, tan = %.4f\n", trig[0], trig[1], trig[2]);
        sc.close();
    }
}
