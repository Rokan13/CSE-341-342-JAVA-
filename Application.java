package bd.edu.bubr.cse;

public class Application {
    public static void main(String[] args){
        driver driver1 = new driver( " Arafat",  "BRO1");
        driver driver2 = new driver( " RAfi",  "A01");
        driver driver3 = new driver( "Amol",  "As02");

        car c1 = new car("Toyota", 0);
        driver1.drive(c1);
        driver2.drive(c1);
        driver3.drive(c1);
    }
}
