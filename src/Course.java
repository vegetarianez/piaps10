class Course {
    private int id;
    private String name;
    private float weeklyDuration; // часов в неделю
    private ResearchAssociate lecturer;

    public Course(int id, String name, float weeklyDuration) {
        this.id = id;
        this.name = name;
        this.weeklyDuration = weeklyDuration;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public float getWeeklyDuration() { return weeklyDuration; }
    public ResearchAssociate getLecturer() { return lecturer; }

    public void setLecturer(ResearchAssociate lecturer) {
        this.lecturer = lecturer;
    }

    @Override
    public String toString() {
        String lecturerName = (lecturer != null) ? lecturer.getName() : "не назначен";
        return "Курс: " + name +
                " (ID: " + id +
                ", Часов в неделю: " + weeklyDuration +
                ", Преподаватель: " + lecturerName + ")";
    }
}