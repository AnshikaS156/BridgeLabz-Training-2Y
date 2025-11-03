import java.util.*;

interface Insurable {
    double calculateInsurance();
    void getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber, type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    public Car(String no, double rate) { super(no, "Car", rate); }
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return 5000; }
    public void getInsuranceDetails() { System.out.println("Insurance: ₹5000 per year"); }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String no, double rate) { super(no, "Bike", rate); }
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return 1000; }
    public void getInsuranceDetails() { System.out.println("Insurance: ₹1000 per year"); }
}

public class MainVehicle {
    public static void main(String[] args) {
        List<Vehicle> list = List.of(new Car("DL05AB1234", 2000), new Bike("UP14XY6789", 500));
        for (Vehicle v : list) {
            System.out.println("Vehicle No: " + v.getVehicleNumber());
            System.out.println("Type: " + v.getType());
            System.out.println("Rental (5 days): ₹" + v.calculateRentalCost(5));
            if (v instanceof Insurable i) {
                System.out.println("Insurance Cost: ₹" + i.calculateInsurance());
            }
            System.out.println("----------------------------------");
        }
    }
}

