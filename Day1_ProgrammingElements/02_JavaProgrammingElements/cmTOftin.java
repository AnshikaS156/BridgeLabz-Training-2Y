import java.util.Scanner;

public class cmTOftin {
    public static void main(String args[]){
        int cm;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height in cm: ");
        cm = sc.nextInt();
        double inch= cm/2.54;
        double feet = inch/12;
        System.out.println("Your Height in cm is " + cm +" while in feet is"+ feet + " and inches is "+ inch);
        sc.close();
    }

        

        
        
}
    
