public class volofcylinder {
    public static void main(String[] args) {
        double radius = 5.0; // Example radius
        double height = 10.0; // Example height
        double volume = calculateVolume(radius, height);
        System.out.println("The volume of the cylinder with radius " + radius + " and height " + height + " is: " + volume);
    }

    public static double calculateVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }
    
}
