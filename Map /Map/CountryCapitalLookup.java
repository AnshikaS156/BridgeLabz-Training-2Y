import java.util.*;

public class CountryCapitalLookup {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>(); // sorted
        map.put("India", "New Delhi");
        map.put("USA", "Washington, D.C.");
        map.put("Japan", "Tokyo");
        map.put("France", "Paris");
        map.put("Germany", "Berlin");
        map.put("Brazil", "Brasília");
        map.put("Egypt", "Cairo");
        map.put("Australia", "Canberra");

        // Lookup example
        String query = "Japan";
        System.out.println(query + " -> " + map.getOrDefault(query, "Unknown country"));

        // Not found
        System.out.println("Atlantis -> " + map.getOrDefault("Atlantis", "Unknown country"));

        // Print all in alphabetical order
        for (Map.Entry<String, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
