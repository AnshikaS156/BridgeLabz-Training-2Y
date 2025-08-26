import java.util.*;
public class greatestfactorwhile{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int number;
        System.out.println("Enter a number:");
        number=sc.nextInt();
        int i=1;
        while(i<=number/2){
            if(number%i==0){
                System.out.println("Greatest factor of "+number+" is: "+i);
                break;
            }
            i++;
        }
        sc.close();
    }
    
}
