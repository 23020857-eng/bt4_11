public class Main {
    public static void main(String[] args) {

        ListSortable<KLTN<?, ?>> list = new ListSortable<>();

        Student s1 = new Student("Nguyen Van A", "S01", "a@student.com");
        Student s2 = new Student("Tran Thi B", "S02", "b@student.com");

        Teacher t1 = new Teacher("Le Quang", "T01", "quang@school.com", "ThS.");
        Advisor a1 = new Advisor("Pham Minh", "pm@company.com");

        list.add(new KLTN<>("AI in Healthcare", s1, t1));
        list.add(new KLTN<>("Blockchain in Finance", s2, a1));
        list.add(new KLTN<>("Computer Vision for Traffic", s1, a1));

        list.print();
    }
}
