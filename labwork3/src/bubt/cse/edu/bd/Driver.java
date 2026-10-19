package bubt.cse.edu.bd;

public class Driver {
    private String licenseId;
    private String name;

    public Driver() {
        this.licenseId = "";
        this.name = "";
    }

    public Driver(String licenseId, String name) {
        this.licenseId = licenseId;
        this.name = name;
    }

    public String getLicenseId() {
        return this.licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showDetails(){
        System.out.println("----------------------------------");
        System.out.println("|           Driver Info:         |");
        System.out.println("|--------------------------------|");
        System.out.println("| License ID: " + this.licenseId);
        System.out.println("| Name: " + this.name);
        System.out.println("----------------------------------");
    }

    // Association root
    public void drive(Car car){
        System.out.print(this.name + " with License ID: " +
                this. licenseId + " is driving ");
        car.run();
    }
}
