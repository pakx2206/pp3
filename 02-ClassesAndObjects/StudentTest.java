public class StudentTest 
{
    public static void main(String[] args) 
    {
        
        Student s = new Student();
        s.name = "Peter";
        s.age = 21;
        s.IDcard = 111;
        s.IDvalid = true;
        s.SemesterNumber = 3;
        s.AverageGrade = 3.7f;




        System.out.println(s.name + " " + s.age);
        s.sayHello();
        s.displayAge();
        s.displayName();      
        s.changeID(false);
        s.displayInfo();
        
        // Student s1 = new Student();
        // s1.name = "Robert";
        // s1.age = 22;


        // System.out.println(s1.name + " " + s1.age);
        // s1.sayHello();
        // s1.displayAge();
        // s1.displayName();


        Student s2 = new Student();
        s2.name = "Adam";
        s2.age = 23;
        s.IDcard = 222;
        s.IDvalid = false;
        s.SemesterNumber = 2;
        s.AverageGrade = 3.2f;


        System.out.println(s2.name + " " + s2.age);
        s2.sayHello();
        s2.displayAge();
        s2.displayName();
        s2.changeID(true);
        s2.displayInfo();
        
        
       

    }
}