import java.util.ArrayList;
import java.util.List;

class Faculty {
    private String name;
    private Employee dean;
    private List<Institute> institutes;

    public Faculty(String name, Employee dean) {
        this.name = name;
        this.dean = dean;
        this.institutes = new ArrayList<>();
    }

    public void addInstitute(Institute institute) {
        if (!institutes.contains(institute)) {
            institutes.add(institute);
            institute.setFaculty(this);
        }
    }

    public String getName() { return name; }
    public Employee getDean() { return dean; }
    public List<Institute> getInstitutes() { return new ArrayList<>(institutes); }

    @Override
    public String toString() {
        String deanName = (dean != null) ? dean.getName() : "не назначен";
        return "Факультет: " + name +
                "\n  Декан: " + deanName +
                "\n  Кафедр: " + institutes.size();
    }
}