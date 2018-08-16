public class Employee extends Person {
    private String employeeID;
    public Employee(String firstName, String lastName, String empID) {
        super(firstName, lastName);
        employeeID = empID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
}