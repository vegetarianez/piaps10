import java.text.SimpleDateFormat;
import java.util.Date;


class Participation {
    private int hours;
    private Date startDate;
    private Date endDate;
    private Project project;
    private ResearchAssociate researchAssociate;

    public Participation(int hours, Date startDate, Date endDate, Project project, ResearchAssociate researchAssociate) {
        this.hours = hours;
        this.startDate = startDate;
        this.endDate = endDate;
        this.project = project;
        this.researchAssociate = researchAssociate;
    }

    public int getHours() { return hours; }
    public Date getStartDate() { return startDate; }
    public Date getEndDate() { return endDate; }
    public Project getProject() { return project; }
    public ResearchAssociate getResearchAssociate() { return researchAssociate; }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        return "Участие в проекте: " + project.getName() +
                "\n  Часы: " + hours +
                "\n  Период: " + sdf.format(startDate) + " - " + sdf.format(endDate);
    }
}
