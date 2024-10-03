package week6.LA3;

class Manager extends Employee {
    public Manager(String id, String name, String email) {
        super(id, name, email);
    }

    public void work() {
        System.out.println(getName() + " is managing.");
    }

    public void manageTeam() {
        System.out.println(getName() + " is managing the team.");
    }
}

