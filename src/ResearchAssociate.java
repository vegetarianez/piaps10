import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class ResearchAssociate extends Employee {
    private String fieldOfStudy;
    private List<Institute> institutes;
    private List<Participation> projectParticipations;
    private List<Course> courses;

    public ResearchAssociate(int socialSecurityNumber, String name, String email, String fieldOfStudy) {
        super(socialSecurityNumber, name, email);
        this.fieldOfStudy = fieldOfStudy;
        this.institutes = new ArrayList<>();
        this.projectParticipations = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addInstitute(Institute institute) {
        if (!institutes.contains(institute)) {
            institutes.add(institute);
            institute.addResearchAssociate(this);
        }
    }

    public void removeInstitute(Institute institute) {
        institutes.remove(institute);
        institute.removeResearchAssociate(this);
    }

    public void participateInProject(Project project, int hours, Date startDate, Date endDate) {
        Participation participation = new Participation(hours, startDate, endDate, project, this);
        projectParticipations.add(participation);
        project.addParticipation(participation);
    }

    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.setLecturer(this);
        }
    }

    public void removeCourse(Course course) {
        courses.remove(course);
        course.setLecturer(null);
    }

    public String getFieldOfStudy() { return fieldOfStudy; }
    public List<Institute> getInstitutes() { return new ArrayList<>(institutes); }
    public List<Participation> getProjectParticipations() { return new ArrayList<>(projectParticipations); }
    public List<Course> getCourses() { return new ArrayList<>(courses); }

    public void setFieldOfStudy(String fieldOfStudy) { this.fieldOfStudy = fieldOfStudy; }

    @Override
    public String getPosition() {
        return "Научный сотрудник";
    }

    public boolean isLecturer() {
        return !courses.isEmpty();
    }

    @Override
    public String toString() {
        String result = super.toString() + "\n  Область исследований: " + fieldOfStudy;
        if (isLecturer()) {
            result += "\n  Преподаватель курсов: " + courses.size();
        }
        return result;
    }
}