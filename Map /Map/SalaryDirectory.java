import java.util.*;
import java.util.stream.*;

public class SalaryDirectory {
    public static void main(String[] args) {
        Map<String, Double> employees = new HashMap<>();
        employees.put("Alice", 70000.0);
        employees.put("Bob", 50000.0);
        employees.put("Carol", 90000.0);
        employees.put("Dave", 90000.0);
        employees.put("Eve", 45000.0);
        employees.put("Frank", 60000.0);

        // Give a raise: increase Carol by 10%
        giveRaise(employees, "Carol", 10);
        // Try to give raise to non-existing
        giveRaise(employees, "Unknown", 5);

        // Average salary
        double avg = employees.values().stream().mapToDouble(Double::doubleValue).average().orElse(0);
        System.out.println("Average salary: " + avg);

        // Highest-paid(s)
        double max = employees.values().stream().mapToDouble(Double::doubleValue).max().orElse(0);
        System.out.println("Highest salary: " + max);
        employees.entrySet().stream()
                .filter(e -> e.getValue() == max)
                .forEach(e -> System.out.println("Top earner: " + e.getKey()));
    }

    static void giveRaise(Map<String, Double> m, String name, double percent) {
        if (!m.containsKey(name)) {
            System.out.println("Employee not found: " + name);
            return;
        }
        m.put(name, m.get(name) * (1.0 + percent / 100.0));
        System.out.println("Raised " + name + " by " + percent + "% -> " + m.get(name));
    }
}
