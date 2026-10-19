package bd.edu.bubt.cse;

public class Dept {
    private String dName;

    public Dept(String dn){
        this.dName = dn;
    }
    public String getdNamet(){
        return this.dName;
    }

    public void setdName(String dName){
        this.dName=dName;
    }
    void showDept(){
        System.out.println("Dept name: " + this.dName);
    }

}
