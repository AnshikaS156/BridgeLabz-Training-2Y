import java.util.*;

interface Taxable {
    double calculateTax();
    void getTaxDetails();
}

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.productId = id;
        this.name = name;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public void display() {
        System.out.println("Product ID: " + productId + ", Name: " + name + ", Price: ₹" + price);
    }

    abstract double calculateDiscount();
}

class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() { return getPrice() * 0.1; }
    public double calculateTax() { return getPrice() * 0.18; }
    public void getTaxDetails() { System.out.println("Tax: 18% GST"); }
}

class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() { return getPrice() * 0.2; }
    public double calculateTax() { return getPrice() * 0.05; }
    public void getTaxDetails() { System.out.println("Tax: 5% GST"); }
}

class Groceries extends Product {
    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    public double calculateDiscount() { return getPrice() * 0.05; }
}

public class MainEcommerce {
    public static void main(String[] args) {
        List<Product> items = List.of(
            new Electronics(1, "Laptop", 60000),
            new Clothing(2, "T-Shirt", 1200),
            new Groceries(3, "Rice", 800)
        );

        for (Product p : items) {
            p.display();
            double discount = p.calculateDiscount();
            double tax = (p instanceof Taxable t) ? t.calculateTax() : 0;
            double finalPrice = p.getPrice() + tax - discount;
            System.out.println("Final Price: ₹" + finalPrice);
            System.out.println("-----------------------------------");
        }
    }
}
