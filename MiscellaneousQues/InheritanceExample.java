class Person{
    String name;
    int age;
    String address;

    public Person(String name, int age, String address){
       this.name = name;
       this.age = age;
       this.address= address;
    }

    public void getDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

class Student extends Person{

    int id;
    String course;

    public Student(String course, int id, String name, int age, String address) {
        super(name, age, address);
        this.course = course;
        this.id = id;
    }

}

class Teacher extends Person{
    int id;
    String sub;

    public Teacher(int id, String sub, String name, int age, String address) {
        super(name, age, address);
        this.id = id;
        this.sub = sub;
    }


}
public class InheritanceExample {
    public static void main(String[] args) {
        Student newStudent = new Student("MCA", 101, "Dhami", 25, "Delhi");

        newStudent.getDetails();
        Teacher newTeacher = new Teacher(111, "Math", "Ritik", 36, "Bihar");
         newTeacher.getDetails();
        
    }
}
