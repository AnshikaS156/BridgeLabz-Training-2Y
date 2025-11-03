interface GPS {
    void getCurrentLocation();
    void updateLocation(String newLocation);
}

abstract class Vehicle {
    private String vehicleId, driverName;
    private double ratePerKm;

    public Vehicle(String id, String driver, double rate) {
        this.vehicleId = id;
        this.driverName = driver;
        this.ratePerKm = rate;
    }

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate/km: ₹" + ratePerKm);
    }

    abstract double calculateFare(double distance);
}

class Car extends Vehicle implements GPS {
    public Car(String id, String driver, double rate) { super(id, driver, rate); }
    public double calculateFare(double distance) { return distance * 15; }
    public void getCurrentLocation() { System.out.println("Current Location: Connaught Place"); }
    public void updateLocation(String newLocation) { System.out.println("Updated to: " + newLocation); }
}

public class MainRide {
    public static void main(String[] args) {
        Vehicle v = new Car("C123", "Rohan", 15);
        v.getVehicleDetails();
        System.out.println("Fare (10 km): ₹" + v.calculateFare(10));
    }
}
