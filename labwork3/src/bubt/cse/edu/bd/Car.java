package bubt.cse.edu.bd;

public class Car {
    private String model;
    private double speed;
    //Aggregation (Ownership) root
    private Engine engine;
    //Composition (Ownership) root
    private Key key;


    public Car(){
        this.model = "";
        //Composition (Life-Death Relationship) root
        this.key = new Key("Black", "Round");
    }

    public Car(String model, double speed, Engine engine, String color, String shape) {
        this.model = model;
        this.speed = speed;
        this.engine = engine;
        //Composition (Life-Death Relationship) root
        this.key = new Key(color, shape);
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSpeed() {
        return this.speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void showDetails(){
        System.out.println("----------------------------------");
        System.out.println("|            Car Info:           |");
        System.out.println("|--------------------------------|");
        System.out.println("| Model: " + this.model);
        System.out.println("| Speed: " + this.speed + " Kmph");
        System.out.println("----------------------------------");
    }

    public void run(){

        System.out.println(this.model + " with speed- "
                + this.speed + " Kmph...");
        //Composition perform
        this.key.start();
        //Aggregation perform
        this.engine.operate();
        System.out.println();
    }
}
