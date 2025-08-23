import java.util.Scanner;
public class Smallest {
    public static void main(String args[]){
        int a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = input.nextInt();
        System.out.println("Enter the second number:");
        b = input.nextInt();
        System.out.println("Enter the third number:");
        c = input.nextInt();
        if(a<=b && a<=c){
            System.out.println( "Is the first number the smallest? Yes");
            
        }else if(b<=a && b<=c){
            System.out.println( "Is the second number the smallest? Yes");

        }else {
            System.out.println( "Is the third number the smallest? Yes");

        }
        input.close();

    }
}
