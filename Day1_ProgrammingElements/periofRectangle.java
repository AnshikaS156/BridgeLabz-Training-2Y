public class periofRectangle {
    
    public static void main(String[] args) {
        double length = 5.0; 
        double width = 3.0; 
        double perimeter = calculatePerimeter(length, width);
        System.out.println("The perimeter of the rectangle with length " + length + " and width " + width + " is: " + perimeter);
    }

    public static double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }
}
