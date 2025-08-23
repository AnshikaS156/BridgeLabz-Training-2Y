import java.util.*;

public class count {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int counter= sc.nextInt();
        
        while(counter>0){
            System.out.println(counter);

            counter--;
        }
        sc.close();

    } 
    
    
}
