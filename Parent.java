package bubt.cse.edu;

public class Parent {
    protected String eyeclour;
    protected String bgroup;
    protected double height;

    public Parent(String eyeclour, String bgroup,double height){
        this.eyeclour=eyeclour;
        this.bgroup=bgroup;
        this.height=height;
    }
    public String geteyeclour(){
        return eyeclour;
    }
    public String getbgroup(){
        return bgroup;
    }
    public double getheight(){
        return height;
    }

    public void seteyeclour(String eyeclour){
            this.eyeclour=eyeclour;

    }
    public void setbgroup(String bgroup){
        this.bgroup=bgroup;
    }
    public void setheight(double height){
        this.height=height;
    }

    public void display(){
        System.out.println("Eyeclour: " + this.eyeclour);
        System.out.println("Blood Group: " + this.bgroup);
        System.out.println("Height: " + this.height);
    }

}
