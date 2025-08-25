import java.util.*;

public class factorstillhundred {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter a number: ");
        number=sc.nextInt();
        if(number>=1 && number<100){
            for(int i =number;i<=100;i--){
                if(number%i==0){
                    System.out.println(i);
                }

            }
        }
        else
            System.out.println("Can't check for the given input");
        

        sc.close();



    }
    
}
