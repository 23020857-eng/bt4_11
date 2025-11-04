public class Advisor {
    private String fullName;
    private String email;

    public Advisor(String fullName, String email) {
        this.fullName = fullName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Advisor: " + fullName + " (Email: " + email + ")";
    }
}
