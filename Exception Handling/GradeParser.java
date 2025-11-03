
public class GradeParser {
    public static void main(String[] args) {
        String[] grades = {"90", "A+", "85", "B", "100"};

        for (String grade : grades) {
            try {
                int value = Integer.parseInt(grade);
                System.out.println("Grade parsed: " + value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid grade input: " + grade);
            }
        }
    }
}
