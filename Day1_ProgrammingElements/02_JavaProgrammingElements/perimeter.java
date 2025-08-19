import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) {
        int side;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square:");
        side = sc.nextInt();
        int perimeter = 4 * side;
        System.out.println("The length of the side is"+ side +" whose perimeter is " + perimeter );
        sc.close();


        
    }
    
}
