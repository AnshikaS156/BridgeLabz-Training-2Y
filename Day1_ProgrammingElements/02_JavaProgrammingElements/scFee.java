import java.util.Scanner;
public class scFee {
    public static void main(String[] args){
        int fee;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the fee amount: ");
        fee = input.nextInt();
        int discountpercent;
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the discount percentage: ");
        discountpercent = input2.nextInt();
        double discount= fee/100*discountpercent;
        double total = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + total);
                        

        input.close();
        input2.close();
    }
    
}
