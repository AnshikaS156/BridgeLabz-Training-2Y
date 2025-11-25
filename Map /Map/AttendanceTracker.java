import java.util.*;

public class AttendanceTracker {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Alice", "Bob", "Carol", "Dave", "Eve");
        Map<String, Integer> attendance = new HashMap<>();
        for (String s : students) attendance.put(s, 0);

        // Simulate 15 days: random attendance
        Random r = new Random(1);
        for (int day = 0; day < 15; day++) {
            // for demo create a list of present students each day
            for (String s : students) {
                if (r.nextBoolean()) attendance.put(s, attendance.get(s) + 1);
            }
        }

        System.out.println("Attendance counts: " + attendance);
        System.out.println("Under-attending (<10 days):");
        for (Map.Entry<String, Integer> e : attendance.entrySet()) {
            if (e.getValue() < 10) System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
