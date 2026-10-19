package bubt.java;

public class Application {
    public static void main(String[] args){
        Car myCar = new Car("Toyota Corolla ",120.5);
        Driver myDriver = new Driver("Rokan","043");

        System.out.println("Driver Name: " + myDriver.getName());
        System.out.println("License ID: " + myDriver.getLicenseID());

        System.out.println("Car Model: " + myCar.getModel());
        System.out.println("Driver : " + myCar.getSpeed());
        myDriver.driver(myCar);
    }
}
