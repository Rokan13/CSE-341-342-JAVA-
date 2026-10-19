package CSE.bubt.edu.bd;

public class Application {
    public static  void main(String[] args){
        Dept dept1 = new Dept("Cse");  //aggragation . so, etar priority besi, eita age thakbe
        Student student1= new Student("Rokan",43,dept1);
        Teacher teacher1 = new Teacher( "Nur Quraishi", 344);



        teacher1.Teach(student1);
    }
}
