import java.util.HashMap;
import java.util.Map;

public class SubjectTopperReport {

    public static void main(String[] args) {

        // subject -> (student -> marks)
        Map<String, Map<String, Integer>> data = new HashMap<>();

        data.put("Maths", new HashMap<String, Integer>());
        data.put("Physics", new HashMap<String, Integer>());
        data.put("Chemistry", new HashMap<String, Integer>());

        data.get("Maths").put("A", 95);
        data.get("Maths").put("B", 88);
        data.get("Maths").put("C", 72);

        data.get("Physics").put("A", 85);
        data.get("Physics").put("B", 91);
        data.get("Physics").put("C", 89);

        data.get("Chemistry").put("A", 78);
        data.get("Chemistry").put("B", 92);
        data.get("Chemistry").put("C", 93);

        // 1. Top scorer per subject
        System.out.println("Topper per subject:");
        for (String subject : data.keySet()) {

            String topper = "";
            int highest = -1;

            Map<String, Integer> marks = data.get(subject);

            for (String student : marks.keySet()) {
                int score = marks.get(student);
                if (score > highest) {
                    highest = score;
                    topper = student;
                }
            }

            System.out.println(subject + " -> " + topper);
        }

        // 2. Average per subject
        System.out.println("\nAverage per subject:");
        for (String subject : data.keySet()) {

            Map<String, Integer> marks = data.get(subject);
            int total = 0, count = 0;

            for (String student : marks.keySet()) {
                total += marks.get(student);
                count++;
            }

            double average = (count == 0) ? 0 : (total / (double) count);
            System.out.println(subject + " -> " + average);
        }

        // 3. Subjects with marks above 90
        System.out.println("\nSubjects where someone scored above 90:");
        for (String subject : data.keySet()) {
            Map<String, Integer> marks = data.get(subject);
            boolean found = false;

            for (String student : marks.keySet()) {
                if (marks.get(student) > 90) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println(subject);
            }
        }
    }
}
