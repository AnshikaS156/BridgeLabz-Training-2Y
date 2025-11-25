import java.util.*;

public class FindKeyWithHighestValue {
    public static String findMaxKey(Map<String, Integer> map) {
        String best = null;
        int bestVal = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() > bestVal) {
                bestVal = e.getValue();
                best = e.getKey();
            }
        }
        return best;
    }

    public static void main(String[] args) {
        Map<String, Integer> sample = new HashMap<>();
        sample.put("A", 10);
        sample.put("B", 20);
        sample.put("C", 15);

        System.out.println(findMaxKey(sample)); // B
    }
}
