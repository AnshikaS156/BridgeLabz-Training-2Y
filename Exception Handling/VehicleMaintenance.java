class ServiceOverdueException extends Exception { public ServiceOverdueException(String m){ super(m);} }
class InvalidMileageException extends Exception { public InvalidMileageException(String m){ super(m);} }

class Vehicle {
    int mileage;
    boolean overdue;

    Vehicle(int mileage, boolean overdue) {
        this.mileage = mileage;
        this.overdue = overdue;
    }

    void checkMaintenance() throws ServiceOverdueException, InvalidMileageException {
        if (mileage < 0) throw new InvalidMileageException("Mileage cannot be negative!");
        if (overdue) throw new ServiceOverdueException("Service date overdue!");
        System.out.println("Vehicle maintenance OK.");
    }
}

public class VehicleMaintenance {
    public static void main(String[] args) {
        Vehicle car = new Vehicle(-200, true);
        try {
            car.checkMaintenance();
        } catch (ServiceOverdueException | InvalidMileageException e) {
            System.out.println("Maintenance alert: " + e.getMessage());
        }
    }
}
