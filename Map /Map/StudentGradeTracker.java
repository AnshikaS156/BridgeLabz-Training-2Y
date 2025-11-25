import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Map<String, Double> grades = new HashMap<>();
        // 1. Add several students
        grades.put("Zara", 78.5);
        grades.put("Anshika", 92.0);
        grades.put("Bhav", 65.0);

        // 2. Update grade (retake)
        grades.put("Bhav", 80.0); // updated

        // 3. Remove a student who dropped out
        grades.remove("Zara");

        // 4. Print sorted by student name
        TreeMap<String, Double> sorted = new TreeMap<>(grades);
        System.out.println("Students and grades (alphabetical):");
        for (Map.Entry<String, Double> e : sorted.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
