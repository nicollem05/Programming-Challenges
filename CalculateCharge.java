import java.util.Scanner;

public class CalculateCharge {

    // Calculate the parking charge based on hours parked
    public static double calculateCharge(double hours) {
        // Min charge
        final double MINIMUM_FEE = 2.00;
        // Up to 3 hours
        final double BASE_HOURS = 3.0;
        // Extra per hour
        final double ADDITIONAL_RATE = 0.50;
        // Max per 24 hours
        final double MAXIMUM_CHARGE = 10.00;

        // If 24 hours or more → max charge
        if (hours >= 24.0) {
            return MAXIMUM_CHARGE;
        }

        double charge;

        // 3 hours or less → min charge
        if (hours <= BASE_HOURS) {
            charge = MINIMUM_FEE;
        }
        // More than 3 hours → add extra charge
        else {
            double extraHours = hours - BASE_HOURS;
            double additionalCharge = extraHours * ADDITIONAL_RATE;
            charge = MINIMUM_FEE + additionalCharge;
        }

        // Cap at max charge
        if (charge > MAXIMUM_CHARGE) {
            charge = MAXIMUM_CHARGE;
        }

        return charge;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hours for 3 cars
        double[] hoursParked = new double[3];
        // Charges for 3 cars
        double[] charges = new double[3];

        System.out.println("Parking Charge Calculator");

        // Input hours for each car
        for (int i = 0; i < 3; i++) {
            System.out.printf("Enter hours parked for Car %d: ", i + 1);
            if (scanner.hasNextDouble()) {
                hoursParked[i] = scanner.nextDouble();
            } else {
                System.out.println("Invalid input. Using 0 hours.");
                hoursParked[i] = 0.0;
                scanner.next(); // Clear invalid input
            }

            // Calculate charge for this car
            charges[i] = calculateCharge(hoursParked[i]);
        }
        scanner.close();

        // Calculate totals
        double totalHours = 0.0;
        double totalCharges = 0.0;
        for (int i = 0; i < 3; i++) {
            totalHours += hoursParked[i];
            totalCharges += charges[i];
        }

        // Print report
        System.out.println("\n--- Parking Summary ---");
        System.out.printf("%-5s %-10s %-10s\n", "Car", "Hours", "Charge");

        // Show each car info
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-5d %-10.1f $%-9.2f\n",
                    i + 1, hoursParked[i], charges[i]);
        }

        // Show totals
        System.out.printf("%-5s %-10.1f $%-9.2f\n",
                "TOTAL", totalHours, totalCharges);
    }
}