import java.util.*;
public class oddeven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(num>=1){
            for(int i = 0; i<=num;i++){
                if(i%2==0){
                    System.out.println(i + " is even");
                }
                else{
                    System.out.println(i + " is odd");
                }

            }

        }
        sc.close();
    }
}
