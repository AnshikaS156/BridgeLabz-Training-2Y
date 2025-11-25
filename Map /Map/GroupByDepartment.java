import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {
    String name;
    String department;

    Employee(String n, String d) {
        name = n;
        department = d;
    }

    public String toString() {
        return name;
    }
}

public class GroupByDepartment {

    public static Map<String, List<Employee>> group(List<Employee> employees) {
        Map<String, List<Employee>> map = new HashMap<>();

        for (Employee e : employees) {
            if (!map.containsKey(e.department)) {
                map.put(e.department, new ArrayList<Employee>());
            }
            map.get(e.department).add(e);
        }

        return map;
    }

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Alice", "HR"));
        list.add(new Employee("Bob", "IT"));
        list.add(new Employee("Carol", "HR"));

        Map<String, List<Employee>> result = group(list);

        for (String dept : result.keySet()) {
            System.out.println(dept + " -> " + result.get(dept));
        }
    }
}
