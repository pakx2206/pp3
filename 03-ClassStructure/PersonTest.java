public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("Patryk", 75, 182);
        Person p2 = new Person("Szymon", 80, 176);
        Person p3 = new Person("Nikodem", 77, 180);

        p1.displayRecord();
        p2.displayRecord();
        p3.displayRecord();

    }
}
