package bd.edu.bubt.sms;

public class Car {
    private String model;
    private double speed;

    public Car() {

    }

    public Car(String m, double s) {
        this.model = m;
        this.speed = s;
    }

    public String getModel() {
        return this.model;
    }

    public double getSpeed() {
        return this.speed;
    }

    public void setModel(String m) {
        this.model = m;
    }

    public void setSpeed(double s) {
        this.speed = s;
    }

    public void run() {
        System.out.print(this.model + " is Starting...");
        System.out.print("Car is running");
    }
}