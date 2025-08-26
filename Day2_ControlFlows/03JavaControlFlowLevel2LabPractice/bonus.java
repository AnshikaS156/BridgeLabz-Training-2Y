import java.util.*;
public class bonus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter years of service:");
        int yearsofservice=sc.nextInt();

        
        System.out.print("Enter salary:"); 
        int salary=sc.nextInt();   
        
        if(yearsofservice>5){
            int bonus= salary*5/100;
            System.out.println("Bonus: "+bonus);
        }else{
            System.out.println("No bonus");
        }

        sc.close();
    }
    
}
