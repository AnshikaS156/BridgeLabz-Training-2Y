import java.util.ArrayList;
import java.util.List;


abstract class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public abstract double getDiscountedPrice();

    public void displayProductInfo() {
        System.out.println("Product ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Base Price: " + price);
        System.out.println("Discounted Price: " + getDiscountedPrice());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return this.id == product.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}

class OrganicProduct extends Product {
    public OrganicProduct(int id, String name, double price) {
        super(id, name, price);
    }
    @Override
    public double getDiscountedPrice() {
        return getPrice() * 0.9;
    }
    @Override
    public String toString() {
        return "Product ID: " + getId() + ", Name: " + getName() + ", Base Price: " + getPrice() + ", Discounted Price: " + getDiscountedPrice();
    }
}

class RecycledProduct extends Product {
    public RecycledProduct(int id, String name, double price) {
        super(id, name, price);
    }
    @Override
    public double getDiscountedPrice() {
        return getPrice() * 0.95;
    }
    @Override
    public String toString() {
        return "Product ID: " + getId() + ", Name: " + getName() + ", Base Price: " + getPrice() + ", Discounted Price: " + getDiscountedPrice();
    }
}


class Cart {
    protected List<Product> products;
    private static int totalCartsCreated = 0;

    public Cart() {
        products = new ArrayList<>();
        totalCartsCreated++;
    }


    public void addItem(Product product) {
        products.add(product);
        System.out.println("Added Product: " + product.getName());
    }


    public void addItem(Product... products) {
        for (Product product : products) {
            this.products.add(product);
            System.out.println("Added Product: " + product.getName());
        }
    }

  
    public void addItem(int productId, int quantity) {
        System.out.println("Added " + quantity + " units of Product ID " + productId);
    }

   
    public static int getCartCount() {
        return totalCartsCreated;
    }

    
    public void printCartItems() {
        System.out.println("Items in Cart:");
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }
}


class CartWithBill extends Cart {
    public static final double TAX_RATE = 0.05;

    public final void printBillHeader() {
        System.out.println("******* EcoCart Bill ********");
    }

    public void printBill() {
        printBillHeader();
        double grandTotal = 0;
        for (Product product : products) {
            double discounted = product.getDiscountedPrice();
            double tax = discounted * TAX_RATE;
            double total = discounted + tax;
            System.out.println("Item: " + product.getName() + ", Price: " + discounted + ", Tax: " + tax + ", Total: " + total);
            grandTotal += total;
        }
        System.out.println("----------------------------");
        System.out.println("Grand Total: " + grandTotal);
    }
}


final class EcoRules {
    public static void printEcoGuidelines() {
        System.out.println("Use eco-friendly bags.");
        System.out.println("Recycle waste responsibly.");
    }
}


public class Main {
    public static void main(String[] args) {
       
        OrganicProduct p1 = new OrganicProduct(101, "Organic Apple", 100);
        RecycledProduct p2 = new RecycledProduct(201, "Recycled Notebook", 200);
        OrganicProduct p3 = new OrganicProduct(102, "Organic Banana", 50);

        
        System.out.println("Displaying Product Info (Using displayProductInfo)");
        p1.displayProductInfo();
        p2.displayProductInfo();
        p3.displayProductInfo();
        System.out.println();

       
        System.out.println("Adding Products to Cart");
        CartWithBill cart1 = new CartWithBill();
        CartWithBill cart2 = new CartWithBill();
        cart1.addItem(p1); 
        cart1.addItem(p2, p3); 
        cart1.addItem(101, 3); 
        System.out.println();

    
        System.out.println("Printing Cart Items (printCartItems)");
        cart1.printCartItems();
        System.out.println();

       
        System.out.println("Using Static Method (Cart.getCartCount())");
        System.out.println("Total carts created: " + Cart.getCartCount());
        System.out.println();

        
        System.out.println("Printing Bill (Using TAX_RATE)");
        cart1.printBill();
        System.out.println();

       
        System.out.println("Using EcoRules Class");
        EcoRules.printEcoGuidelines();
    }
}

