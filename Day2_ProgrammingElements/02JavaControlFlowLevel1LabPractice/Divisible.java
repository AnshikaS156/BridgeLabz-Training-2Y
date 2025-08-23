//Write a program to check if a number is divisible by 5
// I/P => number
// O/P => Is the number ___ divisible by 5? ___

import java.util.Scanner;
public class Divisible {
    public static void main(String[] args){

        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        number= input.nextInt();

        System.out.println("Is the number "+ number+ " divisible by 5?");
        if(number % 5 ==0){
            System.out.println("Yes");


        }else{
        System.out.println("No");
        }
        

        input.close();

    }
}
