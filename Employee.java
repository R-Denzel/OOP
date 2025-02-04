// Employee.java
public abstract class Employee implements UniversityMember {
    protected String name;
    protected String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Concrete method common to all employees
    public void clockIn() {
        System.out.println(name + " from " + department + " has clocked in.");
    }

    // Abstract method to be implemented by subclasses
    public abstract void performDuties();
}
