import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();
        // simulate 10 votes for 3 candidates: A, B, C
        String[] simulatedVotes = {"A","B","A","C","B","A","B","C","A","B"};
        for (String v : simulatedVotes) {
            votes.put(v, votes.getOrDefault(v, 0) + 1);
        }
        System.out.println("Vote counts: " + votes);

        // find highest
        String winner = null;
        int max = -1;
        int total = 0;
        for (Map.Entry<String, Integer> e : votes.entrySet()) {
            total += e.getValue();
            if (e.getValue() > max) {
                max = e.getValue();
                winner = e.getKey();
            }
        }
        System.out.println("Winner: " + winner + " with " + max + " votes. Total votes: " + total);
    }
}
