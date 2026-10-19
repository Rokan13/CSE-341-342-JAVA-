package bd.edu.bubt.cse;

public class Teacher {
    private String name;
    private int tid;
    public Teacher(){
        this.name = " ";
        this.tid = 0;
    }
    public Teacher(String n,int i){
        this.name = n;
        this.tid = i;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int gettid(){
        return this.tid;
    }
    public void settid(int tid){
        this.tid=tid;
    }
    public void showditails(){
        System.out.println(" .............");
        System.out.println(" Name: " + this.name);
        System.out.println("Teacher id: " + this.tid);
    }

    public void Teach(Student s){
        System.out.println(this.name+ " with id" + this.tid + " teaches java");
        s.Learn();
    }
}
