package bd.edu.bubt.cse.interfaces;

public class HybridVehicle implements ILandVehicle,IWaterVehicle{
    private  int noofwheel;
    private int noofturbines;
    private int noofspins;
    private double wheelradious;

    public HybridVehicle(){ }
    public HybridVehicle(int noofwheel, int noofturbines,int noofspins,double wheelradious){
        this.noofwheel=noofwheel;
        this.noofturbines=noofturbines;
        this.noofspins=noofspins;
    }

    public int getNoofwheel(){
        return noofwheel;
    }
    public void setNoofwheel(int noofwheel){
        this.noofwheel=noofwheel;
    }
    public int getNoofturbines(){
        return noofturbines;
    }
    public void setNoofturbines(int noofturbines){
        this.noofturbines=noofturbines;
    }
    public int getNoofspins(){
        return noofspins;
    }
    public void setNoofspins(int noofspins){
        this.noofspins=noofspins;
    }
    public double getWheelradious(){
        return wheelradious;
    }
    public void setWheelradious(double wheelradious){
        this.wheelradious=wheelradious;
    }

    public  void showdetails(){
        System.out.println("Wheel" + this.noofwheel);
        System.out.print("Turbines" +this.noofturbines);
        System.out.print("Spins" +this.noofspins);
        System.out.print("Radious" +this.wheelradious);
        System.out.print("Complete distance" +this.calcDistance());
    }
 public void move(){
        System.out.println("Hybrid vehicle is moving using its " +this.noofwheel + "wheels and" +this.noofturbines + "Turbines");
       }
 public  void brake(){
        System.out.println("The hubrid vehicle is stoping using its brake");
 }
 public void horn(){
        System.out.println("Hybrid vehicle is maling noise using its" + "horn");
 }
 public void enlight(){
        System.out.println("the hybrid vehcle is enlighting using its " + "light");
 }
 public double calcDistance() {
     return this.noofspins * (2 * IVehicle.PI * this.wheelradious);
 }
}
