package bd.edu.bubt.cse.customException.bubt.cse.edu;

public class UsernameContainsSpaceException extends RuntimeException{
    public UsernameContainsSpaceException(){
        super("Invalid Username Exception\n" +
              "Error: Username can't contain space!");
    }
}
