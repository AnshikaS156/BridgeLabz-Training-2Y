import java.util.*;
public class Vote {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter the age: ");
        n=input.nextInt();
        if(n>=18){
            System.out.println("The person can vote");
        }else{
            System.out.println("The person cannot vote");
        }
        input.close();
    }
}
