public class Student {
    private String fullName;
    private String id;
    private String email;

    public Student(String fullName, String id, String email) {
        this.fullName = fullName;
        this.id = id;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student: " + fullName + " (ID: " + id + ", Email: " + email + ")";
    }
}
