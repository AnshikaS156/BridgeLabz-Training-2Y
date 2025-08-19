import java.util.Scanner;

public class sideofsquare {
    public static void main(String[] args) {
        int perimeter;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square:");
        perimeter = sc.nextInt();
        int side = perimeter / 4;
        System.out.println("The length of the side is " + side + " whose area is " + perimeter);
        sc.close();
    }
    
}
