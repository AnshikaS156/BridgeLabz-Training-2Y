interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }

    public void getPatientDetails() {
        System.out.println("ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }

    abstract double calculateBill();
}

class InPatient extends Patient implements MedicalRecord {
    private double roomCharges;

    public InPatient(int id, String name, int age, double roomCharges) {
        super(id, name, age);
        this.roomCharges = roomCharges;
    }

    public double calculateBill() { return roomCharges + 2000; }
    public void addRecord(String record) { System.out.println("Added record: " + record); }
    public void viewRecords() { System.out.println("Viewing InPatient records..."); }
}

public class MainHospital {
    public static void main(String[] args) {
        Patient p = new InPatient(1, "Anshika", 22, 5000);
        p.getPatientDetails();
        System.out.println("Bill: ₹" + p.calculateBill());
    }
}
