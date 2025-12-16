import java.util.ArrayList;
import java.util.List;

class University {
    private String name;
    private List<Faculty> faculties;
    private List<Employee> employees;

    public University(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
        this.employees = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        if (!faculties.contains(faculty)) {
            faculties.add(faculty);
        }
    }

    public void addEmployee(Employee employee) {
        if (!employees.contains(employee)) {
            employees.add(employee);
        }
    }


    public String getName() { return name; }
    public List<Faculty> getFaculties() { return new ArrayList<>(faculties); }
    public List<Employee> getEmployees() { return new ArrayList<>(employees); }

    @Override
    public String toString() {
        return "Университет: " + name +
                "\n  Факультетов: " + faculties.size() +
                "\n  Сотрудников: " + employees.size() +
                "\n  Всего сотрудников в системе: " + Employee.getEmployeeCounter();
    }
}