public class Procedure {
    //Declare variables
    private String procedureName;
    private String date;
    private String practitionerName;
    private double charges;

    public Procedure(String name, String date, String practitioner, double charges) {
        this.procedureName = name;
        this.date = date;
        this.practitionerName = practitioner;
        this.charges = charges;
    }

    // Getters and Setters
    public String getProcedureName() {
        return procedureName;
    }
    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public String getPractitionerName() {
        return practitionerName;
    }
    public void setPractitionerName(String practitionerName) {
        this.practitionerName = practitionerName;
    }

    public double getCharges() {
        return charges;
    }
    public void setCharges(double charges) {
        this.charges = charges;
    }

    //show the info of the procedure
    public void displayProcedureInfo() {
        System.out.printf("  Procedure: %s\n", procedureName);
        System.out.printf("  Date: %s\n", date);
        System.out.printf("  Doctor: %s\n", practitionerName);
        System.out.printf("  Charge of treatment: $%.2f\n", charges);
    }
}

