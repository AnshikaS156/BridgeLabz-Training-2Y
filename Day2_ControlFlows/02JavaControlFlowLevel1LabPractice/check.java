import java.util.*;
public class check {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int number;
        System.out.print("Enter number:");
        number=input.nextInt();
        if(number>0)
        System.out.println("Positive");
        else if(number==0)
        System.out.println("zero");
        else if(number<0)
        System.out.println("Negative");

        input.close();



    }

    
}
