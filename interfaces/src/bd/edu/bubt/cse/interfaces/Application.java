package bd.edu.bubt.cse.interfaces;

public class Application {

    public static void main(String[] args){
        //IVehicle hv=new HybridVehicle(4,2,1500,20.3);
        HybridVehicle hv=new HybridVehicle(4,3,1500,34.4);
        hv.showdetails();
        hv.move();
        hv.brake();
        hv.horn();
        hv.enlight();
    }
}
