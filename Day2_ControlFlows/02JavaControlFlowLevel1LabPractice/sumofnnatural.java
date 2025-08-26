import java.util.*;
public class sumofnnatural {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(n < 1){
            System.out.println("The number is not a natural number");
        }
        else{
            int sum = 0;
            int i = 1;
            while(i <= n){
                sum += i;
                i++;
            }
            int formulaSum = n * (n + 1) / 2;
            System.out.println("Sum using while loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);
            if(sum == formulaSum){
                System.out.println("Both computations are correct and equal.");
            } else {
                System.out.println("There is a discrepancy between the two computations.");
            }
        }
        sc.close();
        
    }
    
}
