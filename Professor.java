// Professor.java
public class Professor extends Employee {
    private String course;

    public Professor(String name, String department, String course) {
        super(name, department);
        this.course = course;
    }

    @Override
    public void attendMeeting() {
        System.out.println("Professor " + name + " is attending a faculty meeting.");
    }

    @Override
    public void showDetails() {
        System.out.println("Professor Name: " + name + ", Department: " + department + ", Course: " + course);
    }

    @Override
    public void performDuties() {
        System.out.println("Professor " + name + " is teaching " + course + ".");
    }
}
