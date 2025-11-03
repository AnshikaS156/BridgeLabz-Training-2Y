import java.util.Random;

class NegativeAmountException extends Exception { public NegativeAmountException(String m){ super(m);} }
class InsufficientFundsException2 extends Exception { public InsufficientFundsException2(String m){ super(m);} }
class NetworkFailureException extends Exception { public NetworkFailureException(String m){ super(m);} }

class Transaction {
    public void perform() throws NegativeAmountException, InsufficientFundsException2, NetworkFailureException {
        Random r = new Random();
        int code = r.nextInt(3);
        if (code == 0) throw new NegativeAmountException("Amount cannot be negative!");
        else if (code == 1) throw new InsufficientFundsException2("Balance too low!");
        else throw new NetworkFailureException("Network error during transaction!");
    }
}

public class BankTransaction {
    public static void main(String[] args) {
        Transaction t = new Transaction();
        try {
            t.perform();
        } catch (NegativeAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException2 e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NetworkFailureException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
