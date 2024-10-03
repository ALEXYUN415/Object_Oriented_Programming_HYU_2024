package week6.LA2;

class Student extends Person {

    int grade;
    String major;

    public Student(String name, int age, int grade, String major) {
        super(name, age);
        this.grade = grade;
        this.major = major;
    }

    public void displayInfo() {

        super.displayInfo();
        System.out.println("Grade: " + grade);
        System.out.println("Major: " + major);
    }
}
