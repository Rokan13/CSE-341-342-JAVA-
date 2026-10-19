package bd.edu.bubt.cse;

public class Student {
    private String name;
    private int id;

    private Dept dept;

    public Student(String n, int id, Dept dept){
        this.name=" ";
        this.id= 0;
        this.dept=dept;
    }
    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
    public  Dept getDept(){
        return this.dept;
    }
    public void setDept(Dept dept){
        this.dept=dept;
    }


    public void setName(String name){
        this.name=name;
    }
    public void setid(int id){
        this.id=id;
    }



    public void Learn(){
        System.out.println("Student is learning");
        this.dept.showDept();
    }

}
