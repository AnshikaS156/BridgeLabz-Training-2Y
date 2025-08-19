import java.util.Scanner;

public class area_of_triangle {
    public static void main(String[] args){
        
        int h;
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the the height of the triangle:");
        h = input2.nextInt();

        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the breadth of the triangle:");
        b = input.nextInt();

     

        double Area = 0.5*(b* h);
        System.out.println("The area of the triangle is: " + Area);

        input.close();
        input2.close();


    }
    
}
