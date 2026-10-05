package bd.edu.bubr.cse;

public class Application {
    public static void main(String[] args){
        Driver driver1 = new Driver( " Arafat",  "BRO1");
        Driver driver2 = new Driver( " RAfi",  "A01");
        Driver driver3 = new Driver( "Amol",  "As02");

        Car c1 = new Car("Toyota", 0);
        driver1.drive(c1);
        driver2.drive(c1);
        driver3.drive(c1);
    }
}
