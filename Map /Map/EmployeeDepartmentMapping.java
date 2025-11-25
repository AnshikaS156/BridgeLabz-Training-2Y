import java.util.HashMap;
import java.util.Map;

public class EmployeeDepartmentMapping {

    public static void main(String[] args) {

        Map<Integer, String> employees = new HashMap<>();

        // 1. Add employees
        employees.put(101, "HR");
        employees.put(102, "IT");
        employees.put(103, "Sales");
        employees.put(104, "IT");
        employees.put(105, "HR");

        // 2. Update department
        employees.put(103, "Marketing");

        // 3. Find all in IT
        System.out.println("Employees in IT:");
        for (Integer id : employees.keySet()) {
            if (employees.get(id).equals("IT")) {
                System.out.println(id);
            }
        }

        // 4. Count employees per department
        Map<String, Integer> deptCount = new HashMap<>();

        for (Integer id : employees.keySet()) {
            String dept = employees.get(id);

            if (!deptCount.containsKey(dept)) {
                deptCount.put(dept, 0);
            }

            deptCount.put(dept, deptCount.get(dept) + 1);
        }

        System.out.println("Total employees per department:");
        for (String dept : deptCount.keySet()) {
            System.out.println(dept + " = " + deptCount.get(dept));
        }
    }
}
