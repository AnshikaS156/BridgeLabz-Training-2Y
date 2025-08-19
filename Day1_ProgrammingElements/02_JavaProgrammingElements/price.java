import java.util.Scanner;

public class price {
    public static void main(String[] args) {

        int unitprice;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of units: ");
        unitprice = input.nextInt();
        int quantity;
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the quantity: ");
        quantity = input2.nextInt();
        int totalprice = unitprice * quantity;
        System.out.println(" The total purchase price is INR "+ totalprice+ " if the quantity "+ quantity+ " and unit price is INR "+ unitprice + ".");
        input.close();
        input2.close();


    }
        
}
