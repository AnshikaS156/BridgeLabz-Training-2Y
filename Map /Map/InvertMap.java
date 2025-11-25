import java.util.*;

public class InvertMap {
    public static <K, V> Map<V, List<K>> invert(Map<K, V> map) {
        Map<V, List<K>> result = new HashMap<>();
        for (Map.Entry<K, V> e : map.entrySet()) {
            result.computeIfAbsent(e.getValue(), k -> new ArrayList<>()).add(e.getKey());
        }
        return result;
    }

    public static void main(String[] args) {
        Map<String, Integer> input = new HashMap<>();
        input.put("A", 1);
        input.put("B", 2);
        input.put("C", 1);

        Map<Integer, List<String>> inverted = invert(input);
        System.out.println(inverted); // {1=[A, C], 2=[B]}
    }
}
