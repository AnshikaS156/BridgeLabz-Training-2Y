import java.util.*;

public class WordFrequencySentence {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful.";
        String cleaned = sentence.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();
        String[] words = cleaned.split("\\s+");
        Map<String, Integer> freq = new HashMap<>();
        for (String w : words) {
            if (w.isEmpty()) continue;
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }
        for (Map.Entry<String, Integer> e : freq.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
