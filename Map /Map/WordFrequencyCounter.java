import java.io.*;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) throws IOException {
        
        String text = "Hello world, hello Java!";
     
        String cleaned = text.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();
        String[] words = cleaned.split("\\s+");

        Map<String, Integer> freq = new HashMap<>();
        for (String w : words) {
            if (w.isEmpty()) continue;
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }

        System.out.println(freq);
    }
}
