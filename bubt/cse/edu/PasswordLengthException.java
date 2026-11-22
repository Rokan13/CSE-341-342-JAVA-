package bd.edu.bubt.cse.customException.bubt.cse.edu;

public class PasswordLengthException extends RuntimeException {
    public PasswordLengthException(){
        super("Invalid Password Exception\n" +
                "Error: Password must contain at least 8 character!");
    }
}
