import java.util.Scanner;

public class SmallestAndLargest {
    public static int[] findSmallestAndLargest(int n1, int n2, int n3) {
        int smallest = Math.min(n1, Math.min(n2, n3));
        int largest = Math.max(n1, Math.max(n2, n3));
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
        int[] res = findSmallestAndLargest(x, y, z);
        System.out.println("Smallest = " + res[0] + ", Largest = " + res[1]);
        sc.close();
    }
}
