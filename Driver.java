package bd.edu.bubt.sms;

public class Driver {
    private String name;
    private String licenseID;

    public Driver() {  //default constructor
    }

    public Driver(String n, String lid) { //parameterize constructor
        name = n;
        licenseID = lid;
    }

    public String getName() {
        return this.name;
    }

    public String getLicenseID() {
        return this.licenseID;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setLicenseID(String lid) {
        this.licenseID = lid;
    }

    // Fixed: 'car' changed to 'Car'
    public void drive(Car c) {
        c.run();
    }
}