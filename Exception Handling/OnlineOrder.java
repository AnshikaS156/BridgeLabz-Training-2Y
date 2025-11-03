import java.util.Random;

class OutOfStockException extends Exception {
    public OutOfStockException(String msg) { super(msg); }
}

class PaymentFailedException extends Exception {
    public PaymentFailedException(String msg) { super(msg); }
}

class Order {
    public void placeOrder() throws OutOfStockException, PaymentFailedException {
        Random rand = new Random();
        int status = rand.nextInt(2);

        if (status == 0)
            throw new OutOfStockException("Product is out of stock!");
        else
            throw new PaymentFailedException("Payment could not be processed!");
    }
}

public class OnlineOrder {
    public static void main(String[] args) {
        Order order = new Order();
        try {
            order.placeOrder();
        } catch (OutOfStockException e) {
            System.out.println("Order failed: " + e.getMessage());
        } catch (PaymentFailedException e) {
            System.out.println("Order failed: " + e.getMessage());
        }
    }
}
