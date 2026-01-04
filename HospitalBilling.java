public class HospitalBilling {
    public static void main(String[] args) {

        System.out.println("Welcome to the Hospital of Allghenny");
        System.out.println("This is your bill of today and thanks for visiting us");

        // Create an object type: Patient
        Patient demoPatient = new Patient(
                "Ana", "M.", "Munar",
                "6224 Fifth", "Pittsburgh", "PA", "15260",
                "412-335-6589",
                "Camilo A", "555-562-9999"
        );

        // 2. Create Procedure
        Procedure procedure1 = new Procedure(
                "Physical Exam", "2025-10-25", "Dr. Smith", 450.00
        );

        Procedure procedure2 = new Procedure(
                "Therapist", "2025-05-25", "Dr. Arias", 300.00
        );

        Procedure procedure3 = new Procedure(
                "Blood test", "2025-08-25", "Dr. Adan", 800.00
        );

        // Show patient info
        demoPatient.displayPatientInfo();

        System.out.println("\n Procedures that was made");

        // Show the info of all the procedure
        System.out.println("Procedure #1:");
        procedure1.displayProcedureInfo();
        System.out.println("Procedure #2:");
        procedure2.displayProcedureInfo();
        System.out.println("Procedure #3:");
        procedure3.displayProcedureInfo();

        // 5. Find the total of all the procedures and show the value
        double totalCost = procedure1.getCharges() +
                procedure2.getCharges() +
                procedure3.getCharges();

        System.out.printf("The total cost of all the procedures was: $%.2f\n", totalCost);
    }
}

