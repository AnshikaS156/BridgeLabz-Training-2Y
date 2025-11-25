import java.util.*;

public class StoreInventory {
    private Map<String, Integer> inventory = new HashMap<>();

    public void addProduct(String name, int qty) {
        inventory.put(name, inventory.getOrDefault(name, 0) + qty);
    }

    public void buyProduct(String name, int qty) {
        if (!inventory.containsKey(name)) {
            System.out.println(name + " is not stocked.");
            return;
        }
        int remain = inventory.get(name) - qty;
        if (remain <= 0) {
            inventory.remove(name);
            System.out.println(name + " is now out of stock.");
        } else {
            inventory.put(name, remain);
        }
    }

    public void restock(String name, int qty) {
        addProduct(name, qty);
    }

    public void query(String name) {
        if (!inventory.containsKey(name)) System.out.println(name + ": not stocked");
        else System.out.println(name + ": " + inventory.get(name));
    }

    public void printOutOfStock(List<String> allProducts) {
        System.out.println("Out of stock:");
        for (String p : allProducts) {
            if (!inventory.containsKey(p) || inventory.get(p) == 0) {
                System.out.println(p);
            }
        }
    }

    public static void main(String[] args) {
        StoreInventory store = new StoreInventory();
        store.addProduct("Soap", 10);
        store.addProduct("Shampoo", 5);
        store.addProduct("Pen", 0); // initial zero

        store.buyProduct("Shampoo", 3); // leaves 2
        store.buyProduct("Soap", 10); // removes
        store.buyProduct("Soap", 1); // not stocked

        store.restock("Pen", 20);

        store.query("Pen");
        store.query("Soap");

        List<String> known = Arrays.asList("Soap", "Shampoo", "Pen", "Toothpaste");
        store.printOutOfStock(known);
    }
}
