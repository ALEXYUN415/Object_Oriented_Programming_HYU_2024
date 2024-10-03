package week6.LA2;

public class LA2 {
    public static void main(String[] args) {

        Person person = new Person("John Doe", 30);
        System.out.println("Testing Person.displayInfo():");
        person.displayInfo();

        Student student = new Student("Jane Doe", 20, 2, "Computer Science");
        System.out.println("Testing Student.displayInfo():");
        student.displayInfo();

    }
}
