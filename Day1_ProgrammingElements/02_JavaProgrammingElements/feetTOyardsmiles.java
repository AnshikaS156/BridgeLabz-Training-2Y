import java.util.Scanner;
public class feetTOyardsmiles{
    public static void main(String[] args) {
        int feet;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the distance in miles:");
        feet= sc.nextInt();
        int yard= 3*feet;
        int miles= 1760*feet;
        System.out.println("Your Height in feet is "+ feet+ " while in feet is "+ yard + " and miles is "+ miles );
        sc.close();
       
    }

    
}
