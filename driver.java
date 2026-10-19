package bd.edu.bubr.cse;

public class driver {
    private String name;
    private String licenseID;
    public driver(){

    }
    public driver(String n, String lid){
        name = n;
        licenseID = lid;
    }
    public String getName(){
        return this.name;
    }
    public String getLicenseID(){
        return this.licenseID;
    }

    public void setName(String n){
        this.name = n;
    }
    public void setLicenseID(String lid) {
        this.licenseID = lid;
    }

    public void drive(car c){
        c.run();
    }
}
