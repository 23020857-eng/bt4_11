public class Teacher {
    private String fullName;
    private String id;
    private String email;
    private String title;

    public Teacher(String fullName, String id, String email, String title) {
        this.fullName = fullName;
        this.id = id;
        this.email = email;
        this.title = title;
    }

    @Override
    public String toString() {
        return title + " " + fullName + " (ID: " + id + ", Email: " + email + ")";
    }
}
