import java.util.HashMap;
import java.util.Map;

public class BankingSystem {

    private Map<String, Double> accounts = new HashMap<>();

    // Add new customer
    public void addAccount(String accNo, double initialBalance) {
        accounts.put(accNo, initialBalance);
    }

    // Deposit money
    public void deposit(String accNo, double amount) {
        if (accounts.containsKey(accNo)) {
            double newBalance = accounts.get(accNo) + amount;
            accounts.put(accNo, newBalance);
        } else {
            System.out.println("Account not found: " + accNo);
        }
    }

    // Withdraw money
    public void withdraw(String accNo, double amount) {
        if (accounts.containsKey(accNo)) {
            double current = accounts.get(accNo);
            if (amount > current) {
                System.out.println("Insufficient balance for " + accNo);
            } else {
                accounts.put(accNo, current - amount);
            }
        } else {
            System.out.println("Account not found: " + accNo);
        }
    }

    // Print accounts sorted by descending balance
    public void printSortedDescending() {
        // Convert to array for manual sorting
        String[] accNos = accounts.keySet().toArray(new String[0]);

        // Simple bubble sort by balance
        for (int i = 0; i < accNos.length - 1; i++) {
            for (int j = 0; j < accNos.length - i - 1; j++) {
                double bal1 = accounts.get(accNos[j]);
                double bal2 = accounts.get(accNos[j + 1]);

                if (bal1 < bal2) {
                    // swap
                    String temp = accNos[j];
                    accNos[j] = accNos[j + 1];
                    accNos[j + 1] = temp;
                }
            }
        }

        // print sorted
        for (String acc : accNos) {
            System.out.println(acc + " -> " + accounts.get(acc));
        }
    }

    // Print top 3 customers
    public void printTop3() {
        String[] accNos = accounts.keySet().toArray(new String[0]);

        // Sort descending like above
        for (int i = 0; i < accNos.length - 1; i++) {
            for (int j = 0; j < accNos.length - i - 1; j++) {
                if (accounts.get(accNos[j]) < accounts.get(accNos[j + 1])) {
                    String temp = accNos[j];
                    accNos[j] = accNos[j + 1];
                    accNos[j + 1] = temp;
                }
            }
        }

        System.out.println("Top 3 customers:");
        for (int i = 0; i < accNos.length && i < 3; i++) {
            System.out.println(accNos[i] + " -> " + accounts.get(accNos[i]));
        }
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        bank.addAccount("A001", 1000);
        bank.addAccount("A002", 6000);
        bank.addAccount("A003", 12000);
        bank.addAccount("A004", 7000);
        bank.addAccount("A005", 300);

        bank.deposit("A001", 500);
        bank.withdraw("A002", 7000);
        bank.withdraw("A003", 2000);

        System.out.println("Sorted by balance (desc):");
        bank.printSortedDescending();

        bank.printTop3();
    }
}
