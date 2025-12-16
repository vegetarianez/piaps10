abstract class Employee {
    private static int employeeCounter = 0;
    private int socialSecurityNumber;
    private String name;
    private String email;

    public Employee(int socialSecurityNumber, String name, String email) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.name = name;
        this.email = email;
        employeeCounter++;
    }

    public static void setEmployeeCounter(int employeeCounter) {
        Employee.employeeCounter = employeeCounter;
    }

    public int getSocialSecurityNumber() { return socialSecurityNumber; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public static int getEmployeeCounter() { return employeeCounter; }

    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }

    public abstract String getPosition();

    @Override
    public String toString() {
        return "Сотрудник: " + name + " (ID: " + socialSecurityNumber + ", Email: " + email + ")";
    }
}