import java.util.*;
public class greatestfactorfor {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int number;
        System.out.println("Enter a number:");
        number=sc.nextInt();
        for(int i=number/2;i>=1;i--){
            if(number%i==0){
                System.out.println("Greatest factor of "+number+" is: "+i);
                break;
            }
        }
        sc.close();
    }
    
}
