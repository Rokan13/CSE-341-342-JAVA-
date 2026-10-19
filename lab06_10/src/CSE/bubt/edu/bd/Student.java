package CSE.bubt.edu.bd;

public class Student {
    private String name;
    private int id;

    private Dept dept; //aggragation with dept
    private Knowledge knowledge;// composition

    public Student(String n, int id, Dept dept){
        this.name=" ";
        this.id= 0;
        this.dept=dept;
        this.knowledge = new Knowledge("Core Programming"); // composition
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



    public void Learn(){        // learn method from teacher
        System.out.println("Student is learning");
        this.dept.showDept(); //aggragation
        this.knowledge.showKnowledge(); // composition
    }
}
