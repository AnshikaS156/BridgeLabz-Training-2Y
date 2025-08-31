import java.util.Scanner;
public class bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] employeeData = new double[10][2]; // [][0] = salary, [][1] = years of service
        double[][] bonusData = new double[10][2]; // [][0] = bonus, [][1] = new salary
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input loop
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary and years of service for employee " + (i + 1) + ":");
            double salary = scanner.nextDouble();
            double yearsOfService = scanner.nextDouble();

            if (salary < 0 || yearsOfService < 0) {
                System.out.println("Invalid input. Please enter again.");
                i--; // Decrement index to repeat this iteration
                continue;
            }

            employeeData[i][0] = salary;
            employeeData[i][1] = yearsOfService;
        }

        // Calculation loop
        for (int i = 0; i < 10; i++) {
            double salary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonus;

            if (yearsOfService > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            double newSalary = salary + bonus;

            bonusData[i][0] = bonus;
            bonusData[i][1] = newSalary;

            totalBonus += bonus;
            totalOldSalary += salary;
            totalNewSalary += newSalary;
        }

        // Output results
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        scanner.close();
    }
}