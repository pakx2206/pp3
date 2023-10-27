public class StudentTest 
{       
    public static void main(String[] args)
    {
        Student s = new Student();
        
        s.name = "Peter";
        s.age = 21;
        s.ID = 888;
        s.valid = 1;
        s.semester = 4;
        s.grade = 4.7;

        System.out.println(s.name + " " + s.age);
        s.sayHello();
        s.displayAge();
        s.displayName();
        s.displayInfo();

        
        Student s2 = new Student();
        s2.name = "John";
        s2.age = 22;
        s2.ID = 645;
        s2.valid = 0;
        s2.semester = 5;
        s2.grade = 3.4
        System.out.println(s2.name + " " + s2.age);
        s2.sayHello();
        s2.displayAge();
        s2.displayName();
        s2.displayInfo();



    }
    

}