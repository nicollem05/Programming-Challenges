public class Patient {
    // Patient information
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String emergencyContactName;
    private String emergencyContactPhone;

    //create the patient
    public Patient(String firstn, String middlen, String lastn, String addr, String thecity, String st, String zip,
                   String phone, String ecName, String ecPhone) {
        this.firstName = firstn;
        this.middleName = middlen;
        this.lastName = lastn;
        this.address = addr;
        this.city = thecity;
        this.state = st;
        this.zipCode = zip;
        this.phoneNumber = phone;
        this.emergencyContactName = ecName;
        this.emergencyContactPhone = ecPhone;
    }

    // Getters and Setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getMiddleName() { return middleName; }
    public void setMiddleName(String middleName) { this.middleName = middleName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public String getZipCode() { return zipCode; }
    public void setZipCode(String zipCode) { this.zipCode = zipCode; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getEmergencyContactName() { return emergencyContactName; }
    public void setEmergencyContactName(String emergencyContactName) { this.emergencyContactName = emergencyContactName; }

    public String getEmergencyContactPhone() { return emergencyContactPhone; }
    public void setEmergencyContactPhone(String emergencyContactPhone) { this.emergencyContactPhone = emergencyContactPhone; }

    // show the info of the patient
    public void displayPatientInfo() {
        System.out.println("PATIENT INFO");
        System.out.printf("Name: %s\n", firstName, middleName, lastName);
        System.out.printf("Address: %s %s\n", address, city, state, zipCode);
        System.out.printf("Phone: %s\n", phoneNumber);
        System.out.println("Emergency contact:");
        System.out.printf("  Name: %s\n", emergencyContactName);
        System.out.printf("  Phone: %s\n", emergencyContactPhone);
    }
}