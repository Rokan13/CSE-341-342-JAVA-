package bubt.cse.edu.bd;

public class Application {
    public static void main(String[] args){
        Driver driver1 = new Driver("BRTA-C-001",
                "Kalam");
        Driver driver2 = new Driver("BRTA-C-002",
                "Salam");

        Engine engine1 = new Engine(4);
        Engine engine2 = new Engine(5);

        Car car1 = new Car("Toyota Prius", 80.5, engine1, "Blue", "Round");
        Car car2 = new Car("Mazda RX", 180.5, engine2, "Red", "Square");

        //Association performs
        driver1.drive(car1);
        driver2.drive(car2);

        driver1.drive(car2);
        driver2.drive(car1);
    }
}
