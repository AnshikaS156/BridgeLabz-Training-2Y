package Day4_Methods.level1;

import java.util.Scanner;

public class prt {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal, Rate, Time: ");
        double p = sc.nextDouble(), r = sc.nextDouble(), t = sc.nextDouble();
        System.out.println("Simple Interest = " + calculateSimpleInterest(p, r, t));
        sc.close();
    }
}
