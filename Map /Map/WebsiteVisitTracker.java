import java.util.HashMap;
import java.util.Map;

public class WebsiteVisitTracker {

    public static void main(String[] args) {

        Map<String, Integer> visits = new HashMap<>();

        String[] pages = {
                "home", "about", "products", "home",
                "products", "contact", "home", "blog",
                "products", "home"
        };

        // 1. Track visits
        for (String page : pages) {
            if (!visits.containsKey(page)) {
                visits.put(page, 1);
            } else {
                visits.put(page, visits.get(page) + 1);
            }
        }

        // 2. Sort pages by descending visit count using simple array technique
        String[] keys = visits.keySet().toArray(new String[0]);

        // Bubble sort by values (descending)
        for (int i = 0; i < keys.length - 1; i++) {
            for (int j = 0; j < keys.length - i - 1; j++) {
                String p1 = keys[j];
                String p2 = keys[j + 1];

                if (visits.get(p1) < visits.get(p2)) {
                    String temp = keys[j];
                    keys[j] = keys[j + 1];
                    keys[j + 1] = temp;
                }
            }
        }

        System.out.println("Pages sorted by visit count:");
        for (int i = 0; i < keys.length; i++) {
            System.out.println(keys[i] + " -> " + visits.get(keys[i]));
        }

        // 3. Show top visited page
        System.out.println("Most visited page: " + keys[0]);
    }
}
