import java.util.Scanner;
public class factorswhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter a positive integer: ");
        number = sc.nextInt();

        System.out.println("Factors of " + number + " are:");
        int i = 1;
        while (i <= number) {
            if (number % i == 0) {
                System.out.println(i);
            }
            i++;
        }
        sc.close();
    }
    
}
