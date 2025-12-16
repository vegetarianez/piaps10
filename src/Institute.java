import java.util.ArrayList;
import java.util.List;


class Institute {
    private String name;
    private String address;
    private Faculty faculty;
    private List<ResearchAssociate> researchAssociates;

    public Institute(String name, String address) {
        this.name = name;
        this.address = address;
        this.researchAssociates = new ArrayList<>();
    }

    public void addResearchAssociate(ResearchAssociate ra) {
        if (!researchAssociates.contains(ra)) {
            researchAssociates.add(ra);
        }
    }

    public void removeResearchAssociate(ResearchAssociate ra) {
        researchAssociates.remove(ra);
    }

    public String getName() { return name; }
    public String getAddress() { return address; }
    public Faculty getFaculty() { return faculty; }
    public List<ResearchAssociate> getResearchAssociates() { return new ArrayList<>(researchAssociates); }

    public void setFaculty(Faculty faculty) { this.faculty = faculty; }

    @Override
    public String toString() {
        String facultyName = (faculty != null) ? faculty.getName() : "не привязан";
        return "Кафедра: " + name +
                "\n  Адрес: " + address +
                "\n  Факультет: " + facultyName +
                "\n  Научных сотрудников: " + researchAssociates.size();
    }
}