public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("Oskar", 67, 175);
        Person p2 = new Person("Jeremi", 83, 176);
        Person p3 = new Person("Miłosz", 65, 180);

        p1.displayRecord();
        p2.displayRecord();
        p3.displayRecord();

    }
}
