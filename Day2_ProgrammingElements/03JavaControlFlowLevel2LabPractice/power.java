import java.util.*;
public class power {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number:");
        int base = sc.nextInt();
        System.out.println("Enter the exponent number:");
        int exponent = sc.nextInt();
        int result = 1;
        for(int i=1; i<=exponent; i++){
            result = result * base;
        }
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        sc.close();
        
    }
    
}
