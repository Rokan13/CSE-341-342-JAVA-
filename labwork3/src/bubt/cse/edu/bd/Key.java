package bubt.cse.edu.bd;

public class Key {
    private String color;
    private String shape;

    public Key() {
    }

    public Key(String color, String shape) {
        this.color = color;
        this.shape = shape;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void showDetails(){
        System.out.println("----------------------------------");
        System.out.println("|             Key Info:          |");
        System.out.println("|--------------------------------|");
        System.out.println("| Color: " + this.color);
        System.out.println("| Shape: " + this.shape);
        System.out.println("----------------------------------");
    }

    public void start(){
        System.out.println("The " + this.color + " key with " +
                this.shape + " has opened the door" +
                " and started the engine.");
    }
}
