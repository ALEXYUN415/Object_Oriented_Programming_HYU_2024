package week6.LA3;

class Intern extends Employee {

    private int internshipDuration;

    public Intern(String id, String name, String email, int internshipDuration) {
        super(id, name, email);
        this.internshipDuration = internshipDuration;
    }

    public void work() {
        System.out.println(getName() + " is working as an intern for " + internshipDuration + " months");
    }

    public void extendInternship(int months) {
        internshipDuration += months;
        System.out.println(getName() + "'s internship has been extended to " + internshipDuration + " months.");
    }
}


