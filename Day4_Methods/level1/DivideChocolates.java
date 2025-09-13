import java.util.Scanner;

public class DivideChocolates {
    public static int[] divideChocolates(int chocolates, int children) {
        int perChild = chocolates / children;
        int remaining = chocolates % children;
        return new int[]{perChild, remaining};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates and number of children: ");
        int ch = sc.nextInt(), kids = sc.nextInt();
        int[] choc = divideChocolates(ch, kids);
        System.out.println("Each child gets " + choc[0] + ", Remaining = " + choc[1]);
        sc.close();
    }
}
