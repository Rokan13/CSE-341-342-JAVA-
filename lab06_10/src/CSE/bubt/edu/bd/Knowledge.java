package CSE.bubt.edu.bd;

public class Knowledge {
    private String subject;

    public Knowledge(String subject) {
        this.subject = subject;
    }

    public void showKnowledge() {
        System.out.println("Acquired knowledge in: " + subject);
    }

}
