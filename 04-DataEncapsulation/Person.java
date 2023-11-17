public class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public boolean isAdult(){
        return (this.age>=18);
    }
    public String display(){
        return String.format("Name: %s\nAge: %s\n..........", this.name, this.age);
    }
    public static void main(String[] args) {
        
            Person p1 = new Person("Patryk", 19);
    
            System.out.println(p1.getAge());
            System.out.println(p1.isAdult());
            System.out.println(p1.display());
    
        
    }
}