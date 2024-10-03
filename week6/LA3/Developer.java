package week6.LA3;

class Developer extends Employee {
    private String Language;

    public Developer(String id, String name, String email, String Language) {
        super(id, name, email);
        this.Language = Language;
    }

    public void work() {
        System.out.println(getName() + " is coding in " + Language);
    }

    public void writeCode() {
        System.out.println(getName() + " is writing code.");
    }
}