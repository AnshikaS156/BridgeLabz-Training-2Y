import java.util.LinkedHashMap;
import java.util.Map;

public class ShoppingCart {

    public static void main(String[] args) {

        // Maintains insertion order
        LinkedHashMap<String, Double> cart = new LinkedHashMap<>();

        // 1. Add products (in order)
        cart.put("Laptop", 45000.0);
        cart.put("Mouse", 500.0);
        cart.put("Keyboard", 1000.0);
        cart.put("Bag", 1200.0);

        // 2. Display in order
        System.out.println("Cart contents:");
        for (String product : cart.keySet()) {
            System.out.println(product + " -> ₹" + cart.get(product));
        }

        // 3. Total bill
        double total = 0;
        for (String product : cart.keySet()) {
            total += cart.get(product);
        }
        System.out.println("Total bill: ₹" + total);

        // 4. Apply discount if needed
        if (total > 5000) {
            double discounted = total * 0.90;
            System.out.println("After 10% discount: ₹" + discounted);
        }

        // 5. Remove item (simulate quantity zero)
        cart.remove("Mouse");

        System.out.println("Cart after removing Mouse:");
        for (String product : cart.keySet()) {
            System.out.println(product + " -> ₹" + cart.get(product));
        }
    }
}
