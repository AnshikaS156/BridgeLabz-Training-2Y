import java.util.Scanner;
public class markstwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        
        // 2D array to store marks of n students in 3 subjects (Physics, Chemistry, Maths)
        int[][] marks = new int[n][3];
        
        // Input marks for each student
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();
            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();
            System.out.print("Maths: ");
            marks[i][2] = sc.nextInt();
        }
        
        // Calculate and display percentage and grade for each student
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double percentage = (total / 300.0) * 100;
            char grade;
            
            if (percentage >= 90) {
                grade = 'A';
            } else if (percentage >= 80) {
                grade = 'B';
            } else if (percentage >= 70) {
                grade = 'C';
            } else if (percentage >= 60) {
                grade = 'D';
            } else if (percentage >= 50) {
                grade = 'E';
            } else {
                grade = 'F';
            }
            
            System.out.printf("Student %d: Percentage = %.2f%%, Grade = %c%n", (i + 1), percentage, grade);
        }
        
        sc.close();
    }

    
}
