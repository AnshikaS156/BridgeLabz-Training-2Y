
import java.util.Scanner;
public class basiccalculator {
    public static void main(String[] args){
        double num1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = input.nextDouble();
        double num2;
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the second number: ");
        num2 = input2.nextDouble();
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + num1 + " and "+ num2 + " is " + sum +" , " + difference +" , "+ product+ " and " + quotient);

        input.close();
        input2.close();
    }

}

    




