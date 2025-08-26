import java.util.*;
public class Break {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.println("Enter a number to add to sum: ");
            int num = sc.nextInt();
            if(num <= 0){
                break;
            }
            sum += num;
        }
        System.out.println("The sum is: " + sum);
        sc.close();

    }

    }    
