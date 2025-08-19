public class power {
    public static void main(String[] args) {
        double base = 2.0; 
        int exponent = 3; 
        double result = calculatePower(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

    public static double calculatePower(double base, int exponent) {
        return Math.pow(base, exponent);
    }
    
}
