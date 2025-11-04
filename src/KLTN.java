public class KLTN<T, V> implements Comparable<KLTN<?, ?>> {
    private String thesisName;
    private T student;
    private V supervisor;

    public KLTN(String thesisName, T student, V supervisor) {
        this.thesisName = thesisName;
        this.student = student;
        this.supervisor = supervisor;
    }

    @Override
    public int compareTo(KLTN<?, ?> other) {
        return this.thesisName.compareToIgnoreCase(other.thesisName);
    }

    @Override
    public String toString() {
        return "Thesis: " + thesisName + "\n  " + student + "\n  Supervisor: " + supervisor + "\n";
    }
}
