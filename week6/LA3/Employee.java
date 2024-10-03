package week6.LA3;

class Employee {
    private String id;
    private String name;
    private String email;

    public Employee(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void work() {
        System.out.println(name + " is working.");
    }
}