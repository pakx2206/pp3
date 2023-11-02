public class Student 
{
    String name;
    int age; 
    int IDcard;
    boolean IDvalid = true;
    int SemesterNumber;
    float AverageGrade;


void sayHello() 
{
    System.out.println("Hello from "+name);
}
void displayName() 
{
    System.out.println("Name:"+name);
}
void displayAge()
{
    System.out.println("Age:"+age);
}
void changeID(boolean valid)
{
    IDvalid = valid;
}
void displayInfo(){
    System.out.println(IDvalid == true ? "Valid" : "Invalid");
}
}