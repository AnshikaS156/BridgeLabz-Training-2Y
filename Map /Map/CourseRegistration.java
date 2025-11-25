import java.util.*;

public class CourseRegistration {
    public static void main(String[] args) {
        Map<String, Integer> courses = new HashMap<>();
        courses.put("CS101", 48);
        courses.put("CS102", 52);
        courses.put("MA101", 3);
        courses.put("PH101", 20);
        courses.put("HS101", 0);

        // Add student to CS101
        courses.put("CS101", Math.max(0, courses.getOrDefault("CS101", 0) + 1));

        // Drop student from MA101
        courses.put("MA101", Math.max(0, courses.getOrDefault("MA101", 0) - 1));

        // Print near full (>=50) and under-subscribed (<5)
        System.out.println("Near full (>=50):");
        for (Map.Entry<String, Integer> e : courses.entrySet()) if (e.getValue() >= 50) System.out.println(e);

        System.out.println("Under-subscribed (<5):");
        for (Map.Entry<String, Integer> e : courses.entrySet()) if (e.getValue() < 5) System.out.println(e);
    }
}
