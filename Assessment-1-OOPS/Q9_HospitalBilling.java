import java.util.Scanner;

// Abstract base class
abstract class Doctor {
    double consultationCharge;

    public Doctor(double consultationCharge) {
        this.consultationCharge = consultationCharge;
    }

    // Abstract method
    public abstract String getDoctorType();

    // Concrete method (default: returns only consultation charge)
    public double calculateTotalBill(double testCharges) {
        return consultationCharge;
    }
}

// Derived class 1: General Physician (500.0)
class GeneralPhysician extends Doctor {
    public GeneralPhysician() {
        super(500.0);
    }

    @Override
    public String getDoctorType() {
        return "General Physician";
    }
}

// Derived class 2: Specialist (1000.0)
class Specialist extends Doctor {
    public Specialist() {
        super(1000.0);
    }

    @Override
    public String getDoctorType() {
        return "Specialist";
    }
}

// Derived class 3: Emergency Doctor (1500.0 + test charges)
class EmergencyDoctor extends Doctor {
    public EmergencyDoctor() {
        super(1500.0);
    }

    @Override
    public String getDoctorType() {
        return "Emergency Doctor";
    }

    @Override
    public double calculateTotalBill(double testCharges) {
        return consultationCharge + testCharges;
    }
}

public class Q9_HospitalBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int doctorType = sc.nextInt();
        double testCharges = sc.nextDouble();

        // Abstract class reference for runtime polymorphism
        Doctor doctor = null;

        if (doctorType == 1) {
            doctor = new GeneralPhysician();
        } else if (doctorType == 2) {
            doctor = new Specialist();
        } else if (doctorType == 3) {
            doctor = new EmergencyDoctor();
        }

        if (doctor != null) {
            System.out.println("Doctor Type: " + doctor.getDoctorType());
            System.out.println("Consultation Charge: " + String.format("%.2f", doctor.consultationCharge));
            System.out.println("Test Charges: " + String.format("%.2f", testCharges));
            System.out.println("Total Bill: " + String.format("%.2f", doctor.calculateTotalBill(testCharges)));
        }

        sc.close();
    }
}
