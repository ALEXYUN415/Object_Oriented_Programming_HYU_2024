package week4;

public class LA1 {
    public static void main(String[] args) {

        Student[] students = new Student[5];

        Student student1 = new Student();
        student1.name = "mike";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "Tom";
        student2.age = 16;
        student2.grade = 80;

        Student student3 = new Student();
        student3.name = "Owen";
        student3.age = 17;
        student3.grade = 100;

        Student student4 = new Student();
        student4.name = "Kate";
        student4.age = 10;
        student4.grade = 80;

        Student student5 = new Student();
        student5.name = "Jane";
        student5.age = 16;
        student5.grade = 50;

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        students[4] = student5;

        for (int i = 0; i < students.length; i++)
            System.out.println("Name:" + students[i].name + " Age:" + students[i].name + " Score:" + students[i].grade);

    }

    static class Student {
        String name;
        int age;
        int grade;
    }
}