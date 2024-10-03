package week6.LA3;

public class LA3 {
    public static void main(String[] args) {
        Manager manager = new Manager("001", "Alice", "alice@example.com");
        manager.work();
        manager.manageTeam();

        Developer developer = new Developer("002", "Bob", "bob@example.com", "Java");
        developer.work();
        developer.writeCode();

        Intern intern = new Intern("003", "Charlie", "charlie@example.com", 6);
        intern.work();
        intern.extendInternship(3);
    }
}