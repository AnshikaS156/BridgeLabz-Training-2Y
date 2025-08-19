public class areaofcircle {

    public static void main(String[] args) {
        double radius = 5.0; // Example radius
        double area = calculateArea(radius);
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    
}
