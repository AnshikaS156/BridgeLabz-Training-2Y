import java.util.*;
public class youngesttallest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.println("Enter the height of Amar (in cm): ");
        int heightAmar = sc.nextInt();

        System.out.println("Enter the age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.println("Enter the height of Akbar (in cm): ");
        int heightAkbar = sc.nextInt();

        System.out.println("Enter the age of Anthony: ");
        int ageAnthony = sc.nextInt();
        System.out.println("Enter the height of Anthony (in cm): ");
        int heightAnthony = sc.nextInt();

        // Finding the youngest friend
        if(ageAmar < ageAkbar && ageAmar < ageAnthony){
            System.out.println("The youngest friend is Amar with age: " + ageAmar);
        } else if(ageAkbar < ageAmar && ageAkbar < ageAnthony){
            System.out.println("The youngest friend is Akbar with age: " + ageAkbar);
        } else if(ageAnthony < ageAmar && ageAnthony < ageAkbar){
            System.out.println("The youngest friend is Anthony with age: " + ageAnthony);
        } else {
            System.out.println("There is a tie for the youngest friend.");
        }

        // Finding the tallest friend
        if(heightAmar > heightAkbar && heightAmar > heightAnthony){
            System.out.println("The tallest friend is Amar with height: " + heightAmar + " cm");
        } else if(heightAkbar > heightAmar && heightAkbar > heightAnthony){
            System.out.println("The tallest friend is Akbar with height: " + heightAkbar + " cm");
        } else if(heightAnthony > heightAmar && heightAnthony > heightAkbar){
            System.out.println("The tallest friend is Anthony with height: " + heightAnthony + " cm");
        } else {
            System.out.println("There is a tie for the tallest friend.");
        }

        sc.close();

        
    }
    
}
