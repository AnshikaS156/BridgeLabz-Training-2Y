interface Discountable {
    void applyDiscount();
    void getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println(itemName + " | Price: ₹" + price + " | Qty: " + quantity);
    }

    protected double getPrice() { return price; }
    protected int getQuantity() { return quantity; }
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) { super(name, price, qty); }
    public double calculateTotalPrice() { return getPrice() * getQuantity(); }
    public void applyDiscount() { System.out.println("5% discount applied on Veg Item."); }
    public void getDiscountDetails() { System.out.println("Discount: 5%"); }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int qty) { super(name, price, qty); }
    public double calculateTotalPrice() { return getPrice() * getQuantity() + 50; }
    public void applyDiscount() { System.out.println("2% discount on Non-Veg Item."); }
    public void getDiscountDetails() { System.out.println("Discount: 2%"); }
}

public class MainFood {
    public static void main(String[] args) {
        FoodItem f1 = new VegItem("Paneer Tikka", 200, 2);
        FoodItem f2 = new NonVegItem("Chicken Curry", 300, 1);

        f1.getItemDetails();
        System.out.println("Total: ₹" + f1.calculateTotalPrice());
        f2.getItemDetails();
        System.out.println("Total: ₹" + f2.calculateTotalPrice());
    }
}
