package bd.edu.bubt.sms;

public class Application {
    public static void main(String[] args) {

        // 1. Create a new Car object using the parameterized constructor
        Car myCar = new Car("Toyota Corolla ", 120.5);

        // 2. Create a new Driver object using the parameterized constructor
        Driver myDriver = new Driver("Shah Rokan A Alam Mahin", "20255103043");

        // 3. Print out some details using the getter methods
        System.out.println("Driver Name: " + myDriver.getName());
        System.out.println("License ID: " + myDriver.getLicenseID());
        System.out.println("Car Model: " + myCar.getModel());
        System.out.println("Top Speed: " + myCar.getSpeed() + " km/h");
        System.out.println("-------------------------------------------------");

        // 4. Call the drive method, which in turn calls the car's run method
        myDriver.drive(myCar);
    }
}