

import java.util.Scanner;
public class multiBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        double[][] personData = new double[numberOfPersons][3]; // 0: weight, 1: height, 2: BMI
        String[] weightStatus = new String[numberOfPersons];

        for (int i = 0; i < numberOfPersons; i++) {
            double weight;
            do {
                System.out.print("Enter weight (in pounds) for person " + (i + 1) + ": ");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("Please enter a positive value for weight.");
                }
            } while (weight <= 0);
            personData[i][0] = weight;

            double height;
            do {
                System.out.print("Enter height (in inches) for person " + (i + 1) + ": ");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Please enter a positive value for height.");
                }
            } while (height <= 0);
            personData[i][1] = height;

            // Calculate BMI
            double bmi = (weight * 703) / (height * height);
            personData[i][2] = bmi;

            // Determine weight status
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        // Display results
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight", "Height", "BMI", "Weight Status");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        scanner.close();
    }   
    
}
