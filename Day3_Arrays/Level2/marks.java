import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        
        int[][] marks = new int[n][3];
        double[] percentages = new double[n];
        char[] grades = new char[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + " (Physics, Chemistry, Maths): ");
            for (int j = 0; j < 3; j++) {
                int mark = sc.nextInt();
                if (mark < 0) {
                    System.out.println("Please enter positive values only.");
                    j--; // Decrement index to re-enter the mark
                } else {
                    marks[i][j] = mark;
                }
            }
            
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300.0) * 100;
            
            if (percentages[i] >= 90) {
                grades[i] = 'A';
            } else if (percentages[i] >= 80) {
                grades[i] = 'B';
            } else if (percentages[i] >= 70) {
                grades[i] = 'C';
            } else if (percentages[i] >= 60) {
                grades[i] = 'D';
            } else if (percentages[i] >= 50) {
                grades[i] = 'E';
            } else {
                grades[i] = 'F';
            }
        }
        
        System.out.println("\nStudent Marks, Percentages and Grades:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": Marks: " + marks[i][0] + ", " + marks[i][1] + ", " + marks[i][2] +
                               " | Percentage: " + String.format("%.2f", percentages[i]) + "%" +
                               " | Grade: " + grades[i]);
        }
        
        sc.close();
    }
    
}
