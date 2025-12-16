import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Project {
    private String name;
    private Date startDate;
    private Date endDate;
    private List<Participation> participations;

    public Project(String name, Date startDate, Date endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.participations = new ArrayList<>();
    }

    public void addParticipation(Participation participation) {
        participations.add(participation);
    }

    public String getName() { return name; }
    public Date getStartDate() { return startDate; }
    public Date getEndDate() { return endDate; }
    public List<Participation> getParticipations() { return new ArrayList<>(participations); }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        return "Проект: " + name +
                " (" + sdf.format(startDate) + " - " + sdf.format(endDate) + ")" +
                "\n  Участников: " + participations.size();
    }
}