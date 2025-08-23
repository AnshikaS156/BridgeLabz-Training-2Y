import java.util.*;
public class sumofnaturalfor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= sc.nextInt();
        if(n<1){
            System.out.println("The number is not a natural number");
        }
        else{
            int sum=0;
            for(int i=1;i<=n;i++){
                sum+=i;
            }
            int formulaSum = n * (n + 1) / 2;
            System.out.println("Sum using for loop: " + sum);
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
